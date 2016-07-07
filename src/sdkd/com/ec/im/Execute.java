package sdkd.com.ec.im;
123456
import sdkd.com.ec.tomysql.UsingMySql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 操作父类
 * Created by sdust on 2016/7/6.
 */
public class Execute {
    private static String sql = null;     //mysql操作语句
    private static UsingMySql usingsql = null;
    private static ResultSet rs = null;

    /*
    *CUD
     */
    public void executeModify(String sql, List<Object> values) {
        usingsql = new UsingMySql(sql);
        try {
            if (values != null && values.size() > 0) {
                for (int i = 0; i < values.size(); i++) {
                    usingsql.ps.setString((i+1), (String) values.get(i));
                }
            }
            usingsql.ps.executeUpdate(sql);      //执行语句

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
    *R
     */
    public ResultSet executeSearch(String sql, List<Object> values) {
        usingsql = new UsingMySql(sql);
        try {
            if (values != null && values.size() > 0) {
                for (int i = 0; i < values.size(); i++) {
                    usingsql.ps.setString(i, (String) values.get(i));
                }
            }
            rs = usingsql.ps.executeQuery(sql);      //执行语句

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void close(){
        if(rs != null) try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        usingsql.close();
    }
}
