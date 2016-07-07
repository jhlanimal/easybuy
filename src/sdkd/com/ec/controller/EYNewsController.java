package sdkd.com.ec.controller;

import sdkd.com.ec.im.EYNewsImport;
import sdkd.com.ec.model.EYNews;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by ydf_m on 2016/7/6.
 */
public class EYNewsController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EYNewsImport newsimport = new EYNewsImport();
        List<EYNews> list = newsimport.getNews();
        request.setAttribute("newList",list);


        //跳转
        request.getRequestDispatcher("/index.jsp").forward(request,response);

        /**
         * login
         */
//        EYUser user =  login();
//        request.getSession().setAttribute("user",user);
//        String paraId = request.getParameter("id");
//        if(paraId!=null && !"".equals(paraId)){
//            int id = Integer.valueOf(id);
//            EbNews news = newsDao.getNewsById(id);
//            request.setAttribute("news",news);
//        }
    }
}
