package requests;

import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import utils.JsonPathUtils;
import utils.LogUtil;

import java.io.IOException;

/**
 * 由于后面的所有接口都需要获取登录信息才可以操作，所以将登录模块封装为测试项目的父类，其他模块都可以继承该类获取token值来进行接口调用
 */
public class RequestLogin {
    LogUtil lg = new LogUtil();
    String url = "https://computeshare-frontend.hamster.newtouch.com/";
    MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
    String token = "Bearer ";
    JsonPathUtils json=new JsonPathUtils();
    OkHttpClient client=new OkHttpClient.Builder().build();

    public RequestLogin() {
    }

    /**
     * 构造方法： 默认执行验证码接口登录接口，返回token值存入变量方便其他子类接口调用
     * @param callCoding  号码段区位
     * @param phoneNuber  手机号
     * @param validateCode 验证码
     * @throws IOException 处理接口异常
     */
    public RequestLogin(String callCoding, String phoneNuber, String validateCode) {
        try {
            RequestBody body = RequestBody.create(mediaType, "countryCallCoding=" + callCoding + "&telephoneNumber=" + phoneNuber);
            Request request = new Request.Builder()
                    .url(this.url + "api/v1/sms/send")
                    .method("POST", body)
                    .build();
            client.newCall(request).execute();
            RequestBody body1 = RequestBody.create(mediaType, "countryCallCoding=" + callCoding + "&telephoneNumber=" + phoneNuber + "&validateCode=" + validateCode);
            Request request1 = new Request.Builder()
                    .url("https://computeshare.hamster.newtouch.com/v1/user/login_by_vc")
                    .method("POST", body1)
                    .build();
            Response response1 = client.newCall(request1).execute();
            JSONObject ob = json.jsonData(response1.body().string());
            client.dispatcher().executorService().shutdown(); //关闭链接
            this.token += (String) ob.getJSONObject("data").get("token");

        } catch (Exception e) {
            lg.error("默认登录接口报错" + e);
            System.out.println("默认登录接口报错");
            throw new RuntimeException(e);
        }


    }

    /**
     * 静态方法 获取验证码接口
     * @param callCoding  接口参数 号码段
     * @param phoneNuber  接口参数 手机号
     * @return 返回响应接口
     * @throws IOException 接口异常
     */
    public static String send(String callCoding, String phoneNuber) throws IOException {
        RequestLogin ht = new RequestLogin();
        try {

            MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
            RequestBody body = RequestBody.create(mediaType, "countryCallCoding=" + callCoding + "&telephoneNumber=" + phoneNuber);
            Request request = new Request.Builder()
                    .url(ht.url + "api/v1/sms/send")
                    .method("POST", body)
                    .build();
            Response response = ht.client.newCall(request).execute();
            ht.client.dispatcher().executorService().shutdown(); //关闭链接
            return response.body().string();
        } catch (Exception e) {
            System.out.println("验证码接口报错");
            ht.lg.error("验证码接口报错" + e);
            throw new RuntimeException(e);
        }
    }

    /**
     * 静态方法 用于单独调用登录接口
     * @param callCoding  接口参数  号码段
     * @param telephoneNumber  接口参数  手机号
     * @param validateCode  接口参数  验证码
     * @return 响应结果
     * @throws IOException 接口异常处理
     */
    public static String login(String callCoding, String telephoneNumber, String validateCode) throws IOException {
        RequestLogin ht = new RequestLogin();
        try {
            MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
            RequestBody body = RequestBody.create(mediaType, "countryCallCoding=" + callCoding + "&telephoneNumber=" + telephoneNumber + "&validateCode=" + validateCode);
            Request request = new Request.Builder()
                    .url("https://computeshare.hamster.newtouch.com/v1/user/login_by_vc")
                    .method("POST", body)
                    .build();
            Response response = ht.client.newCall(request).execute();
            ht.client.dispatcher().executorService().shutdown(); //关闭链接
            return response.body().string();
        } catch (IOException e) {
            ht.lg.error("登录接口报错" + e);
            throw new IOException();
        }

    }

    public static void main(String[] args) throws IOException {
        RequestLogin ht = new RequestLogin("+86", "18326447662", "000000");
        send("+86","18326447662");
        System.out.println(login("+86","18326447662","000000"));
    }
}
