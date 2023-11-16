package requests;

import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import utils.JsonPathUtils;
import utils.LogUtil;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * 运行文件模块封装
 */
public class RunFiles extends RequestLogin {

    public int cid;  //computePower接口的入参id
    public int sid;
    public RunFiles(String callCoding, String phoneNuber,String validateCode)  {
        super(callCoding, phoneNuber,validateCode);
    }

    /**
     * 上传文件的接口封装
     * @param filepath  文件的路径
     * @return   接口的响应结果
     * @throws IOException
     */
    public String uploadScript(String filepath) throws IOException {
        try{
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("file", filepath,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(filepath)))
                    .build();
            Request request = new Request.Builder()
                    .url("https://computeshare-frontend.hamster.newtouch.com/api/v1/compute-power/upload/script")
                    .method("POST", body)
                    .addHeader("Authorization", super.token)
                    .build();
            Response response = client.newCall(request).execute();
            client.dispatcher().executorService().shutdown(); //关闭链接
            String res=response.body().string();
            JSONObject ob = json.jsonData(res);
            this.cid=(int)ob.getJSONObject("data").get("id");
            return res;
        } catch (IOException e) {
            lg.error("上传文件的接口执行失败"+e);
            throw new IOException(e);
        }
    }

    /**
     * 运行Python文件的接口封装
     * @param id  运行文件的id编号，由上传文件接口返回
     * @return 返回接口的响应结果
     * @throws IOException  接口异常处理
     */
    public String computePower(int id) throws IOException {
        try {
            RequestBody body = RequestBody.create(super.mediaType, "id="+id);
            Request request = new Request.Builder()
                    .url(super.url+"api/v1/compute-power/python")
                    .method("POST", body)
                    .addHeader("Authorization", token)
                    .build();
            Response response = client.newCall(request).execute();
            String res=response.body().string();
            JSONObject obj=json.jsonData(res);
            client.dispatcher().executorService().shutdown(); //关闭链接
            this.sid= obj.getJSONObject("data").getInteger("id");
            return res;
        } catch (IOException e){
            lg.error("运行Python文件接口调用失败"+e);
            throw new IOException(e);
        }
    }

    /**
     * 返回文件编译执行状态的接口
     * @param id 文件执行接口运行后返回的id
     * @return 响应结果
     */
    public String scriptInfo(int id){
        try{
            Request request = new Request.Builder()
                    .url(url+"api/v1/compute-power/script/info/"+id)
                    .method("GET",null)
                    .addHeader("Authorization", token)
                    .build();
            Response response = client.newCall(request).execute();
            String res=response.body().string();
            client.dispatcher().executorService().shutdown(); //关闭链接
            return res;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 查看所数据的执行状态
     * @param page 参数页面
     * @param size 参数
     * @return 响应结果
     */
    public String scripList(int page ,int size){
        try {
            Request request = new Request.Builder()
                    .url("https://computeshare-frontend.hamster.newtouch.com/api/v1/compute-power/script/list?page="+page+"&size="+size)
                    .method("GET", null)
                    .addHeader("Authorization", token)
                    .build();
            Response response = client.newCall(request).execute();
            String res=response.body().string();
            client.dispatcher().executorService().shutdown(); //关闭链接
            return res;
        } catch (IOException e) {
            lg.error("查询所有运行文件状态的接口失败");
            throw new RuntimeException(e);
        }
    }

}

class test{
    public static void main(String[] args) throws IOException {
        RunFiles RF=new RunFiles("+86","18326447662","000000");
        JsonPathUtils js=new JsonPathUtils();
        RF.uploadScript("./src/datas/files/test01.py");
        String a=RF.computePower(RF.cid);
        System.out.println(a);
        String b=RF.scriptInfo(RF.sid);
        System.out.println(b);
        String c=RF.scripList(1,10);
        System.out.println(c);
        Object obt=js.jsonPath(c,"$.data.list[0]"); //通过jsonpath获取部分值
        System.out.println(obt);
    }
}