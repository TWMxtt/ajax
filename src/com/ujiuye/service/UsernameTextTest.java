package com.ujiuye.service;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/onmouseover")
public class UsernameTextTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        String un = req.getParameter("un");

        ServletContext servletContext = this.getServletContext();

        String usernames = (String) servletContext.getAttribute("usernames");

        if (un.equals(usernames))
        {
            resp.getWriter().print("您输入的已经存在");
        }else
        {
            servletContext.setAttribute("usernames",un);
            resp.getWriter().print("√");
        }

    }
}
