package com.woniuxy.day010;

import java.util.Objects;

/**
 * 声明类User，有属性name和password
 * 找出两个User集合中同时出现的用户（name和password都相等）
 */
public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(password, user.password);
    }

    @Override
    public String toString() {
        return "用户名：" + getName() + "\t 密码：" + getPassword();
    }
}
