package com.ujiuye.service;

import com.ujiuye.bean.Student;
import com.ujiuye.dao.getStuDao;

import java.util.List;

public class StuServlet {

    public List<Student> getStuBean(String sname)
    {
        System.out.println("sname = " + sname);
        getStuDao getStuDao = new getStuDao();
        List<Student> stuList = getStuDao.getStuList(sname);
        return stuList;
    }

}
