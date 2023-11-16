package dataclass;

import org.testng.annotations.BeforeMethod;
import utils.MySqlUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 用来存储数据库tb_user表单的数据对象
 */
public class TestDB {
    private int id;
    private String name;
    private String quarter;
    private int num;
    private int count;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getQuarter() {
        return quarter;
    }

    public int getNum() {
        return num;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public void setNum(int num) {
        this.num = num;
    }
    //根据字段查询数据库信息放入对象中,存入第一条数据并统计查询的条数
    public void setData(String key) throws SQLException, IOException, ClassNotFoundException {
        MySqlUtils ms=null;
        try {
            Object[] obj={key};
            String sql = "select * from test where name=?";
            ms = new MySqlUtils();
            ResultSet rs = ms.query(sql, obj);
            int count=0;
            while (rs.next()){
                if (count<1){
                    this.id=rs.getInt("id");
                    this.name=rs.getString("name");
                    this.quarter=rs.getString("quarter");
                    this.num=rs.getInt("number");
                }
                count++;
            }
            this.count=count;
        } catch (SQLException e) {
            System.out.println("sql异常");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到类");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("获取数据异常");
            throw new RuntimeException(e);
        }finally {
            if (ms != null) {
                ms.close();
            }
        }


    }
    //返回统计数
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "TestDB{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quarter='" + quarter + '\'' +
                ", num=" + num +
                '}';
    }

    public static void main(String[] args) throws IllegalAccessException {
        TestDB tb=new TestDB();

        Field[] field=tb.getClass().getDeclaredFields();;
        for (Field fiel:field){
            System.out.println(fiel.getName());
            System.out.println(fiel.get(tb));
        }
    }
}
