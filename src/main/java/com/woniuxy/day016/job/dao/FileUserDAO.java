package com.woniuxy.day016.job.dao;

import com.woniuxy.day016.job.user.User;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileUserDAO implements UserDAO {
    //目标文件
    File dest = new File("src\\main\\java\\com\\woniuxy\\day016\\job\\FileDoc\\dest.csv");

    @Override
    public void add(User user) {
        if (user == null) throw new IllegalArgumentException("用户数据为空");

        String birthdate = user.getBirthdate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        String regtime = user.getRegtime().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        String s = user.getId() + "," + user.getName() + "," + birthdate + "," + regtime;

        //如果文件不存在，直接添加
        if (!dest.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {
                writer.write(s);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //如果文件存在，则检查是否有相同的用户，如果没有相同的用户，直接添加，否则报错
            try (BufferedReader reader = new BufferedReader(new FileReader(dest))) {
                String temp = null;
                while ((temp = reader.readLine()) != null) {
                    String[] splits = temp.split(",");
                    if (user.getId() == Integer.parseInt(splits[0]))
                        throw new RuntimeException("已存在相同的用户，无法添加");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(dest, true))) {
                writer.write(s);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public User getById(int id) {
        if (id < 0) throw new IllegalArgumentException("用户编号不正确");
        if (!dest.exists()) throw new RuntimeException("目标文件为空");

        User result = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(dest))) {
            String temp = null;
            while ((temp = reader.readLine()) != null) {
                String[] splits = temp.split(",");
                if (id == Integer.parseInt(splits[0])) {
                    LocalDate birthdate = LocalDate.parse(splits[2], DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                    LocalDateTime regtime = LocalDateTime.parse(splits[3], DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
                    result = new User(id, splits[1], birthdate, regtime);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (result == null) throw new RuntimeException("对应编号的用户不存在");
        else return result;
    }

    @Override
    public List<User> getByName(String name) {
        if (name == null || name.trim().equals(" ")) throw new IllegalArgumentException("用户姓名不正确");
        if (!dest.exists()) throw new RuntimeException("目标文件为空");

        List<User> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(dest))) {
            String temp = null;
            while ((temp = reader.readLine()) != null) {
                String[] splits = temp.split(",");
                if (splits[1].equals(name)) {
                    LocalDate birthdate = LocalDate.parse(splits[2], DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                    LocalDateTime regtime = LocalDateTime.parse(splits[3], DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
                    result.add(new User(Integer.parseInt(splits[0]), splits[1], birthdate, regtime));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (result.isEmpty()) throw new RuntimeException("对应姓名的用户不存在");
        else return result;
    }

    @Override
    public void updateById(User user) {
        if (user == null) throw new IllegalArgumentException("用户数据为空");
        if (!dest.exists()) throw new RuntimeException("目标文件为空");

        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(dest))) {
            String temp = null;
            while ((temp = reader.readLine()) != null) {
                String[] splits = temp.split(",");
                if (user.getId() == Integer.parseInt(splits[0])) {
                    String name = user.getName() == null ? splits[1] : user.getName();
                    String birthdate = user.getBirthdate() == null ? splits[2] : user.getBirthdate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                    String regtime = user.getRegtime() == null ? splits[3] : user.getRegtime().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
                    list.add(user.getId() + "," + name + "," + birthdate + "," + regtime);
                } else list.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {
            for (String temp : list) {
                writer.write(temp);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        if (id < 0) throw new IllegalArgumentException("用户编号不正确");
        if (!dest.exists()) throw new RuntimeException("目标文件为空");

        List<String> list = new ArrayList<>();
        boolean exist = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(dest))) {
            String temp = null;
            while ((temp = reader.readLine()) != null) {
                String[] splits = temp.split(",");
                if (id == Integer.parseInt(splits[0])) {
                    exist = true;
                } else list.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!exist) throw new RuntimeException("对应编号的用户不存在");
        else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {
                for (String temp : list) {
                    writer.write(temp);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
