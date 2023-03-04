package com.woniuxy.day024;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Field[] f = Good.class.getDeclaredFields();
        List<Good> resultList = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day024", "root", "123456");
            PreparedStatement pstmt = connection.prepareStatement("SELECT name,stock FROM goods");
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                Good good = new Good();
                for (Field field : f) {
                    field.setAccessible(true);
                    field.set(good, resultSet.getObject(field.getName()));
                }
                resultList.add(good);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        resultList.forEach(System.out::println);

    }
}

class Good {
    private String name;
    private int stock;

    public Good() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "good{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                '}';
    }
}