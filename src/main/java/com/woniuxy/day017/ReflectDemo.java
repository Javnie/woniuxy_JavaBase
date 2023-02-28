package com.woniuxy.day017;

import com.woniuxy.day016.job.user.User;

import java.lang.reflect.Field;

public class ReflectDemo {
    public static void main(String[] args) {
//        Class<User> c = User.class;
//
//        //Fields[] Field
//        Field[] fields01 = c.getFields();
//        Field[] fields02 = c.getDeclaredFields();
//        try {
//            Field f01 = c.getDeclaredField("name");
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
//
//        //Methods[] Method
//        Method[] methods01 = c.getMethods();
//        Method[] methods02 = c.getDeclaredMethods();
//        try {
//            Method method01 = c.getMethod("setRegtime", LocalDateTime.class);
//            Method method02 = c.getDeclaredMethod("setRegtime", LocalDateTime.class);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }

        try {
            User instance = (User) Class.forName("com.woniuxy.day016.job.user.User").newInstance();
            Field field = User.class.getDeclaredField("id");
            field.setAccessible(true);
            field.set(instance, 7);
            System.out.println(field.get(instance));
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

    }
}
