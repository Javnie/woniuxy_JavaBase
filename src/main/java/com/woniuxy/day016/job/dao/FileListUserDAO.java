package com.woniuxy.day016.job.dao;

import com.woniuxy.day016.job.user.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileListUserDAO implements UserDAO {
    //目标文件
    File dest = new File("src\\main\\java\\com\\woniuxy\\day016\\job\\FileDoc\\dest.csv");
    List<String> list;

    public FileListUserDAO() {
        if (!dest.exists()) list = new ArrayList<>();
        else try (BufferedReader reader = new BufferedReader(new FileReader(dest))) {
            String temp = null;
            while ((temp = reader.readLine()) != null) {
                list.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(User user) {
        if (user == null) throw new IllegalArgumentException("用户数据为空");

        //如果文件不存在，直接添加
        if (!dest.exists()) {
            String birthdate = user.getBirthdate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
            String regtime = user.getRegtime().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
            String s = user.getId() + "," + user.getName() + "," + birthdate + "," + regtime;

            list.add(s);
        }

    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public List<User> getByName(String name) {
        return null;
    }

    @Override
    public void updateById(User user) {

    }

    @Override
    public void deleteById(int id) {

    }
}
