package com.woniuxy.day010;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出两个User集合中同时出现的用户（name和password都相等）
 */
public class UserTest {
    public static void main(String[] args) {
        List<User> l1 = new ArrayList<>();
        List<User> l2 = new ArrayList<>();

        l1.add(new User("小红", "123"));
        l1.add(new User("小明", "123"));
        l1.add(new User("小芳", "123"));
        l1.add(new User("小芳", "456"));

        l2.add(new User("小亮", "123"));
        l2.add(new User("小明", "1234"));
        l2.add(new User("小芳", "123"));
        l2.add(new User("小芳", "456"));

        for (User temp : doubleEmerge(l1, l2)) {
            System.out.println(temp);
        }
    }

    static List<User> doubleEmerge(List<User> l1, List<User> l2) {
        List<User> res = new ArrayList<>();

        for (User u1 : l1) {
            for (User u2 : l2) {
                if (u1.equals(u2)) {
                    res.add(u1);
                    break;
                }
            }
        }

        return res;
    }
}
