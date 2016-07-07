package sdkd.com.ec.controller;

import sdkd.com.ec.im.EYSellingImport;
import sdkd.com.ec.model.EYSelling;

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
@WebServlet(name = "EYSelling")
public class EYSellingController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EYSellingImport sellingimport = new EYSellingImport();
        List<EYSelling> list = sellingimport.getHotSelling();
        request.setAttribute("sellingList",list);

        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
