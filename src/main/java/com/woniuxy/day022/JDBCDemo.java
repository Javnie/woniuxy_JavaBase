package com.woniuxy.day022;
/**
 * jdbc:mysql://61.139.65.134:31816/ + <database name>
 */

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        //加载驱动 Java8可选
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //注意端口号和database名称
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://61.139.65.134:31816/day020","root","123456");

            Statement stmt=connection.createStatement();
//            String sql="INSERT INTO students(name,class) values('Nicki',1)";
//            stmt.execute(sql);

            String sql="SELECT * FROM students";
            ResultSet resultSet = stmt.executeQuery(sql);
            while(resultSet.next()){
                System.out.print(resultSet.getString("id")+"\t");
                System.out.println(resultSet.getString(2));
            }

            PreparedStatement pstmt=connection.prepareStatement("INSERT INTO students(name,class) values(?,?)");
            pstmt.setString(1,"Ariana");
            pstmt.setInt(2,1);
            pstmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
