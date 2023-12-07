package Java_basics.day08;

import java.util.ArrayList;
import java.util.List;
//创建一个员工类
public class Role {
    private String rolename;//姓名
    private String job;//工作
    private String specialty;//专业

    public void setRolename(String rolename){
        this.rolename=rolename;
    }
    public void setJob(String job){
        this.job=job;
    }
    public void setSpecialty(String specialty){
        this.specialty=specialty;
    }
    public void setRole(String rolename,String job,String specialty){
        this.rolename=rolename;
        this.job=job;
        this.specialty=specialty;
    }
    public String getRolename(){
        return this.rolename;
    }
    public String getJob(){
        return this.job;
    }
    public String getSpecialty(){
        return this.specialty;
    }
    public Role(){};
    @Override  //重新构造基类的抽象方法
    public String toString(){
        return "Role[rolename="+rolename+",job="+job+",speciaty="+specialty+"]";
    }
    //将员工信息添加到列表中
    public List<String> getList(){
        List<String> li=new ArrayList<String>();
        li.add(this.rolename);
        li.add(this.job);
        li.add(this.specialty);
        return li;
    }



}
