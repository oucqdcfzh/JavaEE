package edu.cn;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * @program HelloJdbc
 * @description:
 * @author:
 * @create:2019-10-15 08:05:00
 **/

public class ConnectionDemo {
    public static String url_encrypt="jdbc:mysql://127.0.0.1:3306/MovieApp?useSSL=false&characterEncoding=utf8";
    public static String user="root";
    public static String password="1234";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection)DriverManager.getConnection(url_encrypt,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
