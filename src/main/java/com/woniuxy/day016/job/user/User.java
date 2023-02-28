package com.woniuxy.day016.job.user;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 用户管理：用户包括（id，name，birthdate，regtime）
 */
public class User {
    private int id;
    private String name;
    private LocalDate birthdate;
    private LocalDateTime regtime;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.regtime = LocalDateTime.now();
    }

    public User(int id, String name, LocalDate birthdate, LocalDateTime regtime) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.regtime = regtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDateTime getRegtime() {
        return regtime;
    }

    public void setRegtime(LocalDateTime regtime) {
        this.regtime = regtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", regtime=" + regtime +
                '}';
    }
}
