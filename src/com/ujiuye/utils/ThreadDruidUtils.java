package com.ujiuye.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ThreadDruidUtils {
    //定义本地线程规避连接（线程）安全
    private static final ThreadLocal<Connection> tl = new ThreadLocal<>();

    //返回连接池对象
    public static DataSource getDataSuroceObject()
    {
        //接收当前线程的类加载器指定配置文件的输入流
//        InputStream DruidDataSoruce = Thread.currentThread().getContextClassLoader().getResourceAsStream("druid.properties");
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //创建properties来接受配置文件的输入流
//        Properties properties = new Properties();
//        try {
//            properties.load(DruidDataSoruce);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //根据创建properties集合创建连接池
//        DataSource dataSource = null;
//        try {
//            dataSource = DruidDataSourceFactory.createDataSource(properties);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return comboPooledDataSource;
    }

    //返回连接对象
    public static Connection getConnectionObject()
    {
        Connection con = null;
        if (tl.get() == null)
        {
            try {
                tl.set(getDataSuroceObject().getConnection());
                con = tl.get();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return con;
    }

    //清除连接对象
    public static void clearConnectionObject(Connection connection)
    {
        if (connection != null)
        {
            try {
                connection.close();
                tl.remove();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}




