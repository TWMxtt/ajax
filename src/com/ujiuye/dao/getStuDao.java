package com.ujiuye.dao;

import com.ujiuye.bean.Student;
import com.ujiuye.utils.ThreadDruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class getStuDao {
    //获取DBUtils核心对象
    private QueryRunner qr = new QueryRunner(ThreadDruidUtils.getDataSuroceObject());

    public List<Student> getStuList(String sname)
    {
        System.out.println("sname----------- = " + sname);
        String sql = "select * from student where sname like '%"+ sname +"%'";
        List<Student> query = null;
        try {
            query = qr.query(sql, new BeanListHandler<>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }

}
