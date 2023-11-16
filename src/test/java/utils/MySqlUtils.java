package utils;

import java.io.IOException;
import java.sql.*;

public class MySqlUtils {
    private static Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    /**
     * 构造数据库的链接对象
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public MySqlUtils() throws SQLException, ClassNotFoundException, IOException {
        try {
            //读取配置文件中的MySQL数据库信息
            GetProperties gp = new GetProperties();
            //获取配置文件中的driver对应的数据
            gp.getMysql("driver");
            //加载driver数据
            Class.forName(gp.getMysql("driver"));
            System.out.println(gp.getMysql("password"));
            //获取数据的URL，用户名，密码，并且赋值
            String url = gp.getMysql("url");
            String user = gp.getMysql("user");
            String psw = gp.getMysql("password");
            //通话获取的driver信息来获取连接对象
            conn = DriverManager.getConnection(url, user, psw);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException(e + "数据库连接失败");
        }
    }

    /**
     * 封装数据库查询
     *
     * @param sql 需要执行的sql语句，条件判断值用？号填充
     * @param obj 需要填充的条件值
     * @return 返回执行完sql的对象
     */
    public ResultSet query(String sql, Object[] obj) throws SQLException {
        try {
            ps = conn.prepareStatement(sql); //获取preparestatement对象预编译sql语句防止sql注入
            for (int i = 1; i <= obj.length; i++) {  //例如sql的语句为insert into table values(?,?,?)
                ps.setObject(i, obj[i - 1]);  //将object数组中的数据一次添加到sql语句的？占位符中
            }
            rs = ps.executeQuery(); //执行注入完成的sql语句
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("查询数据库失败");
        }
    }


    /**
     *   封装增删改查
     * @param sql  需要执行的sql语句
     * @param obj  需要填充的条件值
     * @return  收影响的数据条数
     */
    public int dataDml(String sql, Object[] obj) {
        int count = -1;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 1; i <= obj.length; i++) {
                ps.setObject(i, obj[i - 1]);
            }
            count = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("增删改数据库失败");
            throw new RuntimeException(e);
        }
        return count;
    }

    /**
     * 关闭数据库
     */
    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("链接对象关闭失败");
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("sql预编译对象关闭失败");
                }
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        System.out.println("游标对象关闭失败");
                    }
                }
            }
        }
    }
}
