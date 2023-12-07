package Java_basics.day06;
//测试学生类
public class StdentTest {
    public static void main(String[] args){
        Student st=new Student();
        //st.name="sss";  //类以外无法直接为私有属性赋值
        //System.out.println(st.name);//也无法访问，属性被私密化，无法直接访问
        st.setAge(10);
        st.setId(20);
        st.setName("hah");
        st.setSex('男');
        System.out.println(st.getAge());
        System.out.println(st.getId());
        System.out.println(st.getName());
        System.out.println(st.getSex());
    }
}
