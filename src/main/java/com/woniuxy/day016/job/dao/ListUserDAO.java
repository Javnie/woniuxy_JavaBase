package com.woniuxy.day016.job.dao;

import com.woniuxy.day016.job.user.User;
import com.woniuxy.day016.job.user.UserData;

import java.util.List;
import java.util.stream.Collectors;

public class ListUserDAO implements UserDAO {
    private List<User> users = UserData.users;

    @Override
    public void add(User user) {
        if (user == null) throw new IllegalArgumentException("用户数据为空");
        if (users.contains(user)) throw new RuntimeException("已存在相同的用户，无法添加");

        else users.add(user);
    }

    @Override
    public User getById(int id) {
        if (id < 0) throw new IllegalArgumentException("用户编号不正确");
        if (users.isEmpty()) throw new RuntimeException("已存储的数据为空");

        Object[] objects = users.stream()
                .filter(user -> user.getId() == id)
                .toArray();
        if (objects.length == 0) throw new RuntimeException("对应编号的用户不存在");
        else return (User) objects[0];
    }

    @Override
    public List<User> getByName(String name) {
        if (name == null || name.trim().equals(" ")) throw new IllegalArgumentException("用户姓名不正确");
        if (users.isEmpty()) throw new RuntimeException("已存储的数据为空");

        List<User> list = users.stream()
                .filter(user -> user.getName().equals(name))
                .collect(Collectors.toList());
        if (list.isEmpty()) throw new RuntimeException("对应姓名的用户不存在");
        else return list;
    }

    @Override
    public void updateById(User user) {
        if (user == null) throw new IllegalArgumentException("用户数据为空");
        if (users.isEmpty()) throw new RuntimeException("已存储的数据为空");

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                if (user.getName() == null) user.setName(users.get(i).getName());
                if (user.getBirthdate() == null) user.setBirthdate(users.get(i).getBirthdate());
                if (user.getRegtime() == null) user.setRegtime(users.get(i).getRegtime());
                users.set(i, user);
                break;
            }
        }
    }

    @Override
    public void deleteById(int id) {
        if (id < 0) throw new IllegalArgumentException("用户编号不正确");
        if (users.isEmpty()) throw new RuntimeException("已存储的数据为空");

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) users.remove(i);
            return;
        }
        throw new RuntimeException("对应编号的用户不存在");
    }
}
