package com.woniuxy.day013;

import java.io.Serializable;

/**
 * 声明用户类，具有姓名与年龄，实现Comparable接口，其逻辑是先比较年龄，年龄一样则比较姓名的长度
 */
public class User implements Comparable<User>, Serializable {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getName() + "-->" + this.getAge();
    }

    @Override
    public int compareTo(User o) {
        if (this.getAge() > o.getAge()) return 1;
        else if (this.getAge() < o.getAge()) return -1;
        else return this.getName().length() - o.getName().length();
    }
}
