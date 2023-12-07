package Java_basics.练习;

/**
 * 创建Person类（name，age，address），address是对象属性，Address类（province、city），创建一个Person类对象person，
 * 并给所以属性赋值，最后打印person
 */
public class Person {
    private String name;
    private int age;
    private String provine;
    private String city;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(Address address) {
        this.city=address.getCity();
        this.provine=address.getProvince();
    }

    public String getAddress() {
        return provine+"\t"+city;
    }
}

class Address {
    private String province;
    private String city;

    public Address(String province, String city) {
        this.city = city;
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }
}
class Test{
    public static void main(String[] args) {
        Person ps=new Person("小花",20);
        Address ass=new Address("安徽","宣城");
        System.out.println(ass.getCity());
        ps.setAddress(ass);
        System.out.println(ps.getAddress());
        System.out.println(ps.getAge());
        System.out.println(ps.getName());
    }
}