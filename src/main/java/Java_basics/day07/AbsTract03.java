package Java_basics.day07;

public class AbsTract03 extends AbsTract01 {


    @Override
    public String longin(String user, String pwd) {
        if (user.equals("dahua") & pwd.equals("abcd1")){
            return "登录成功";
        }
            return "登录失败";
    }
}
