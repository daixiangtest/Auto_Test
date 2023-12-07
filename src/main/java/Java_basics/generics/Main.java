package Java_basics.generics;

import Java_basics.day07.Emp;
import Java_basics.day07.EmpPerson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IntegerPrint ip=new IntegerPrint(123);//只能打印整数类型
//        IntegerPrint ip1=new IntegerPrint("abc")  //如果我想打印字符串就必须在创建一个类将数据类型改下
        ip.print();

        //所有在java中引用了泛型的语法
        Print<Integer,String> p=new Print<>(123,"ABC");
        p.print();
        Print<String,Double> p1=new Print<>("sssss",0.19);
        p1.print();//这样就可以打印任意的数据类型了

        //测试规范的泛型
        Print01<Emp> p2=new Print01<>(new Emp());
        p2.print();
        Print01<EmpPerson> p3=new Print01<EmpPerson>(new EmpPerson());//该参数只能是EmpPerson及其子类才可以
        p3.print();

        Print01.print01("sss");

        List<Integer> list1=new ArrayList<>();
        list1.add(123);
        list1.add(211);
        Print01.print02(list1);
        List<String> list2=new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        Print01.print02(list2);

        Print01.print03(list1);
    }
}
