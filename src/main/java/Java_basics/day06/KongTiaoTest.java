package Java_basics.day06;

public class KongTiaoTest {
    public static void main(String[] args){
        KongTiao kt=new KongTiao();
        kt.brand="美的";
        kt.power=300;
        kt.on();
        System.out.println(kt.tempera);
        kt.add();
        System.out.println(kt.tempera);
        kt.off();
        System.out.println(kt.tempera);
        KongTiao kt2=new KongTiao("美的",200,20); //不同的构造方法可以创造不同的实例对象的方法
        System.out.println(kt2.tempera);
        KongTiao kt3=new KongTiao("格力");
        System.out.println(kt3.brand);
    }
}
