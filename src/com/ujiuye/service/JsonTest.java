package com.ujiuye.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/jsons")
public class JsonTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student1 = new Student(1, "lort", "b", "1233333112", "lort@qq.com");
        Student student2 = new Student(2, "mary", "b", "1233333112", "mary@qq.com");
        Student student3 = new Student(3, "jeck", "b", "1233333112", "jeck@qq.com");
        ObjectMapper om = new ObjectMapper();
        String str = om.writeValueAsString(student1);
        resp.getWriter().print(str);
    }

}
