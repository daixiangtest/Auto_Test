package Java_basics.day05;
/**
 *
 *    访问权限      类   包  子类  其他包
 　　　　   public      ∨   ∨    ∨     ∨           （对任何人都是可用的）
 　　    protected      ∨   ∨   ∨       ×　　　 （继承的类可以访问以及和private一样的权限）
 　　　　 default       ∨   ∨   ×        ×　　　 （同包访问权限，即在整个包内均可被访问）
 　　　　 private       ∨    ×    ×        ×　　　 （本类可访问，其它类无法访问）
 * 1、所有的方法都支持同类调用
 * 2、同一个包下调用不能用private修饰
 * 3、跨包调用必须用public
 *
 */
public class Function02 {
    public static int add1(int a,int b){//公开的
        return a+b;
    }//对任何人都是可用的）
    protected static int add2(int a,int b){return a+b;} //继承的子类和当前类可以访问
    static int add3(int a,int b){return a+b;}  //没有默认为default修饰在同一个包类可以被访问
    private static int add4(int a,int b){return a+b;}// 影藏方法只有在同类中才可以被调用
    public static void main(String[] args) {
        System.out.println(add1(10,20));
        System.out.println(add2(10,20));
        System.out.println(add3(10,20));
        System.out.println(add4(10,20));
    }
}
