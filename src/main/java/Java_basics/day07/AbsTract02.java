package Java_basics.day07;

// AbsTract02作为子类继承父类AbsTract01的方法对抽象类的方法进行覆盖且父类的抽像方法子类必须重写
public class AbsTract02 extends AbsTract01 {




    @Override
    public String longin(String user, String pwd) {
        String a="登录失败";
        if (user.equals("xiaohua")&pwd.equals("abcd")){
             a="登录成功";
        }
        return a;
    }
    public void sleep(){
        System.out.println("上班不能睡觉");
    }

}
