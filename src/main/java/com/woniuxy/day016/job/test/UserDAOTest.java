package com.woniuxy.day016.job.test;

import com.woniuxy.day016.job.user.User;
import com.woniuxy.day016.job.dao.UserDAO;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class UserDAOTest {
    public static void main(String[] args) {
        String propertyPath = "src\\main\\java\\com\\woniuxy\\day016\\job\\PropertyDoc\\p.property";
        Properties property = new Properties();
        try {
            property.load(new FileReader(propertyPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        UserDAO dao;
        try {
            dao = (UserDAO) Class.forName(property.getProperty("userimpl")).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        User user1 = new User
                (Integer.parseInt(property.getProperty("user1.id"))
                        , property.getProperty("user1.name")
                        , LocalDate.parse(property.getProperty("user1.birthdate"), DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                        , LocalDateTime.now());
        User user2 = new User
                (Integer.parseInt(property.getProperty("user2.id"))
                        , property.getProperty("user2.name")
                        , LocalDate.parse(property.getProperty("user2.birthdate"), DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                        , LocalDateTime.now());
        User user3 = new User
                (Integer.parseInt(property.getProperty("user3.id"))
                        , property.getProperty("user3.name")
                        , LocalDate.parse(property.getProperty("user3.birthdate"), DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                        , LocalDateTime.now());
        User user4 = new User
                (Integer.parseInt(property.getProperty("user4.id"))
                        , property.getProperty("user4.name")
                        , LocalDate.parse(property.getProperty("user4.birthdate"), DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                        , LocalDateTime.now());

        try {
            Method add = UserDAO.class.getDeclaredMethod("add", User.class);
            Method getById = UserDAO.class.getDeclaredMethod("getById", int.class);
            Method getByName = UserDAO.class.getDeclaredMethod("getByName", String.class);
            Method updateById = UserDAO.class.getDeclaredMethod("updateById", User.class);
            Method deleteById = UserDAO.class.getDeclaredMethod("deleteById", int.class);

            add.invoke(dao, user1);
            add.invoke(dao, user2);
            add.invoke(dao, user3);
            add.invoke(dao, user4);

            System.out.println(getById.invoke(dao, 1));

            System.out.println(getByName.invoke(dao, "Jack"));

            updateById.invoke(dao, new User(3, "Ellen Degeneres"));

            deleteById.invoke(dao, 4);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
