package com.woniuxy.day015;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 新建CSV文件，其中存储了若干用户信息
 *
 * 声明方法，对其中的用户按照年龄排序（升序）并回写
 * 声明方法，按照性别进行统计用户信息
 */
public class Exercise {
    public static void main(String[] args) {
        List<User> list = null;
        Exercise ex = new Exercise();

        try {
            list = ex.getUsers("src\\DocTest\\0222CSV.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //list.forEach(System.out::println);

        ex.sortByAgeToCSV(list, "src\\DocTest\\0222CSV-01.csv");

        //男性信息
        ex.getGenderInfo(list, true).forEach(System.out::println);
        //女性信息
        System.out.println("-----------");
        ex.getGenderInfo(list, false).forEach(System.out::println);
    }

    List<User> getUsers(String pathname) throws FileNotFoundException {
        if (pathname == null || pathname.trim().equals(" ")) throw new IllegalArgumentException("目标路径不正确");
        File file = new File(pathname);
        if (!file.exists()) throw new FileNotFoundException("目标文件不存在");

        List<User> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s = null;
            while ((s = reader.readLine()) != null) {
                String[] userData = s.split(",");
                list.add(new User(Integer.parseInt(userData[0]), userData[1], userData[2], Integer.parseInt(userData[3])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    void sortByAgeToCSV(List<User> list, String dest) {
        if (list.isEmpty()) throw new IllegalArgumentException("传入的数组为空");
        if (dest == null || dest.trim().equals(" ")) throw new IllegalArgumentException("目标路径不正确");

        list.sort((u1, u2) -> u1.getAge() - u2.getAge());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {
            for (User temp : list) {
                writer.write(String.valueOf(temp.getNo()));
                writer.write(",");
                writer.write(temp.getName());
                writer.write(",");
                writer.write(temp.getGender());
                writer.write(",");
                writer.write(String.valueOf(temp.getAge()));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    List<User> getGenderInfo(List<User> list, boolean isMale) {
        return list.stream().filter(user -> user.getGender().equals("男") == isMale).collect(Collectors.toList());
    }
}

class User {
    private int no;
    private String name;
    private String gender;
    private int age;

    public User(int no, String name, String gender, int age) {
        this.no = no;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "no=" + no + ", name='" + name + '\'' + ", gender='" + gender + '\'' + ", age=" + age + '}';
    }
}