package dataclass;

import java.util.HashMap;

/**
 * 存放响应数据的对象类
 */
public class ResponseData {
    /**
     * 声明变量将获取的响应数据存入对象的变量中方便调用
     */
    public String code;
     public String message;

     public HashMap<String,String> data;

    public ResponseData(String code,String message,HashMap<String,String> data){
        this.code=code;
        this.data=data;
        this.message=message;
    }

    public HashMap<String, String> getData() {
        return data;
    }

    public void setData(HashMap<String, String> data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
