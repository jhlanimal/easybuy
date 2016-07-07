package sdkd.com.ec.im;

import sdkd.com.ec.model.EYNews;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 获取新闻表中的内容
 * Created by ydf_m on 2016/7/6.
 */
public class EYNewsImport extends Execute{
    public List<EYNews> getNews(){
        List<EYNews> newsList = new ArrayList<EYNews>();
        String sql = "select * from easybuy_news order by en_create_time desc limit 0,7";
        try {
            ResultSet rs = this.executeSearch(sql,null);
            while (rs.next()){
                EYNews news = new EYNews();
                news.setEn_id(rs.getInt("en_id"));
                news.setEn_title(rs.getString("en_title"));
                //添加到集合中
                newsList.add(news);
            }
            //rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.close();
        }
        return newsList;
    }
}
