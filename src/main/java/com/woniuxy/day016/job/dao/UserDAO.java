package com.woniuxy.day016.job.dao;

import com.woniuxy.day016.job.user.User;

import java.util.List;

/**
 * 声明接口 UserDAO
 */
public interface UserDAO {
    void add(User user);

    User getById(int id);

    List<User> getByName(String name);

    void updateById(User user);

    void deleteById(int id);
}
