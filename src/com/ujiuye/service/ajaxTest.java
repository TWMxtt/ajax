package com.ujiuye.service;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class ajaxTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = this.getServletContext();

        Integer count = null;

        if (servletContext.getAttribute("count") instanceof Integer)
        {
            count = (Integer) servletContext.getAttribute("count");
        }

        if (count == null)
        {
            count = 1;
        }else
        {
            count++;
        }

        servletContext.setAttribute("count",count);

        resp.getWriter().print(count);

    }
}
