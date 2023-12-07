package Java_basics.练习;

import java.util.Objects;

/**
 * 根据给定的类（类的属性：name，age，phone，job），重写equals方法，要求是name，age相同，即认为对象相同
 *
 * 不能用工具生成，自己实现的equals不能和工具生成的一样
 */
public class JavaTestUser {
    private String name;
    private int age;
    private String phone;
    private String job;

    public JavaTestUser() {
    }

    public JavaTestUser(String name, int age, String phone, String job) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        // 方式一：自动生成的
        // if (this == o) return true;
        // if (o == null || getClass() != o.getClass()) return false;
        // User user = (User) o;
        // return age == user.age &&
        //         Objects.equals(name, user.name) ;

        // 方式二：自己重写的
        if (this==o)
            return true;
        if (o==null)
            return false;
        if (this.getClass()!=o.getClass())
            return false;
        JavaTestUser user = (JavaTestUser) o;
        if (this.age!=user.age)
            return false;
        if (this.name==null){
            if (user.name!=null)
                return false;
        } else if (!this.name.equals(user.name)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, phone);
    }

    public static void main(String[] args) {
        JavaTestUser u1=new JavaTestUser("zhanssan",18,"1908899290","打游戏");
        JavaTestUser u2=new JavaTestUser("zhanssan",18,"1908899290","开车");
        JavaTestUser u3=new JavaTestUser();
        JavaTestUser u4=new JavaTestUser();
        boolean a=u1.equals(u2);
        System.out.println(a);
        boolean a2=u3.equals(u4);
        System.out.println(a2);
        u1.setAge(20);
        boolean a3=u1.equals(u2);
        System.out.println(a3);


    }
}
