package sdkd.com.ec.tomysql;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 打开或关闭数据库
 * Created by ydf_m on 2016/7/5.
 */
public class UsingMySql {

    private Connection conn = null;
    public PreparedStatement ps = null;

    public UsingMySql(String sql){
        try {
            Class.forName(getPro("driver"));   //指定连接类型
            try {
                conn = DriverManager.getConnection(getPro("url"), getPro("user"), getPro("password"));   //获取链接
                ps = conn.prepareStatement(sql);     //准备执行语句
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getPro(String key){     //获取配置表中的信息
        Properties pro = new Properties();

        try {
            InputStream in = this.getClass().getResourceAsStream("/jdbc.properties");
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String value = pro.get(key).toString();

        return value;
    }

    public void close(){      //关闭数据库
        try {
            if(this.conn != null) this.conn.close();
            if(this.ps != null) this.ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
