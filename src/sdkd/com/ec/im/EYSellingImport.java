package sdkd.com.ec.im;

import sdkd.com.ec.model.EYSelling;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ydf_m on 2016/7/6.
 */
public class EYSellingImport extends Execute{
    public List<EYSelling> getHotSelling(){
        List<EYSelling> sellingList = new ArrayList<EYSelling>();
        String sql = "select * from easybuy_product order by ep_id";
        try {
            ResultSet rs = this.executeSearch(sql,null);
            while (rs.next()){
                EYSelling selling = new EYSelling();
                selling.setEp_id(rs.getInt("ep_id"));
                selling.setEp_name(rs.getString("ep_name"));
                selling.setEp_price(rs.getDouble("ep_price"));
                //添加到集合中
                sellingList.add(selling);
            }
            //rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.close();
        }
        return sellingList;
    }
}
