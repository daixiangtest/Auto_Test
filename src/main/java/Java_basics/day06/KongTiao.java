package Java_basics.day06;
/**
 * 构造方法：
 * 1.构造方法的规则：构造方法也是方法，但是需要方法名和类名相同，并且没有返回值
 * 2.构造方法的作用：构造方法是用来创建对象，跟在new 的后面，比如 new Student07()，它调用的是Student07的无参构造方法
 * 3.如果我们不写任何构造方法，系统会默认生成一个无参构造方法
 * 4.如果我们写了有参构造方法，系统就不会默认提供无参构造方法了，需要手动去添加
 *
 */

public class KongTiao {
    String brand; //品牌
    int power; //功率
    int tempera; //温度
    public KongTiao(){}  //方法名与类名一致为构造方法

    public KongTiao(String brand, int power, int temperature) {  //方法名与类名一致为构造方法，一个类可以有多种构造方法
        this.brand = brand;
        this.power = power;
        this.tempera = temperature;
    }
    public KongTiao(String brand){
        this.brand=brand;
    }


    public void on(){//打开空调
        this.tempera=26;
    }

    public void off(){//关闭空调
        this.tempera=0;
    }

    public void add(){//加一度
        tempera++;
    }

    public void minus(){//减一度
        tempera--;
    }
}
