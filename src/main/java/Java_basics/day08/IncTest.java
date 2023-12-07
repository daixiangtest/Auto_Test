package Java_basics.day08;

public class IncTest {
    public static void main(String[] args) {
        Inc02 i01 = new Inc02();
        i01.longin("aa", "ss");
        i01.login("s", "s");
        //接口无法实例化需要通过类来实现方法
        Inc01 I01 = new Inc02();
        I01.add(10, 20);
        Inc01 IN00;
        IN00=new Inc02();

    }
}
