package sdkd.com.ec.im;

import sdkd.com.ec.model.EYNews;
import sdkd.com.ec.model.EYTodaydisco;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ydf_m on 2016/7/6.
 */
public class EYTodaydiscoImport extends Execute{
    public List<EYTodaydisco> getTodaydisco(){
        List<EYTodaydisco> discoList = new ArrayList<EYTodaydisco>();
        String sql = "select * from easybuy_product limit 0,8";
        try {
            ResultSet rs = this.executeSearch(sql,null);
            while (rs.next()){
                EYTodaydisco disco = new EYTodaydisco();
                disco.setEp_id(rs.getInt("ep_id"));
                disco.setEp_name(rs.getString("ep_name"));
                disco.setEp_price(rs.getDouble("ep_price"));
                //添加到集合中
                discoList.add(disco);
            }
            //rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.close();
        }
        return discoList;
    }
}
