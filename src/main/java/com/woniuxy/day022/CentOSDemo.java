package com.woniuxy.day022;
/**
 * jdbc:mysql://18.162.120.240:3306/ + <database name>
 *     my_sql1: 61.139.65.143:46750
 */

import java.sql.*;

public class CentOSDemo {
    public static void main(String[] args) {
        //加载驱动 Java8可选
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //注意端口号和database名称
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://61.139.65.143:46750/db01", "root", "123456");
            System.out.println(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
