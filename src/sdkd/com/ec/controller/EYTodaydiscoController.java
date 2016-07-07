package sdkd.com.ec.controller;

import sdkd.com.ec.im.EYTodaydiscoImport;
import sdkd.com.ec.model.EYTodaydisco;

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
@WebServlet(name = "EYTodaydiscoController")
public class EYTodaydiscoController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EYTodaydiscoImport discoimport = new EYTodaydiscoImport();
        List<EYTodaydisco> list = discoimport.getTodaydisco();
        request.setAttribute("discoList",list);

        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
