package com.woniuxy.day013;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试方法中将若干用户实例存储到List中，实现:
 * 使用打擂台的方式找出最大的用户
 * 进行排序
 */
public class UserTest {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        list.add(new User("Tom", 18));
        list.add(new User("Alex", 20));
        list.add(new User("Jack", 18));
        list.add(new User("Green", 20));

        User temp = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(temp) > 0) temp = list.get(i);
        }
        System.out.println(temp);

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) < 0) {
                    User user = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, user);
                }
            }
        }

        System.out.println("----------");
        list.forEach(System.out::println);
//        list.forEach(n -> System.out.println(n));

    }
}
