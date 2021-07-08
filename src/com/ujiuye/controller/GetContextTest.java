package com.ujiuye.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.bean.Student;
import com.ujiuye.service.StuServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ContextTest")
public class GetContextTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String conText = req.getParameter("ConText");
        Student stu = new Student();
        System.out.println("conText = " + conText);
        if (conText != null && conText != "")
        {
            StuServlet ss = new StuServlet();
            List<Student> stuBean = ss.getStuBean(conText);
            ObjectMapper objectMapper = new ObjectMapper();
            String stuObject = objectMapper.writeValueAsString(stuBean);
            PrintWriter writer = resp.getWriter();
            writer.print(stuObject);
            writer.close();
        }else
        {
            PrintWriter writer = resp.getWriter();
            writer.print(conText);
            writer.close();
        }
    }
}
