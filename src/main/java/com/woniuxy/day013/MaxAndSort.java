package com.woniuxy.day013;

import java.util.*;

/**
 * 使用Collections.max方法及sort方法完成求最大用户及排序
 */
public class MaxAndSort {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        list.add(new User("Tom", 18));
        list.add(new User("Alex", 20));
        list.add(new User("Jack", 18));
        list.add(new User("Green", 20));

        System.out.println(Collections.min(list, new UserComparator()));
        System.out.println("----------");

        Collections.sort(list, new UserComparator());
        list.forEach(System.out::println);
    }
}

class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge() > o2.getAge()) return -1;
        else if (o1.getAge() < o2.getAge()) return 1;
        else return o2.getName().length() - o1.getName().length();
    }
}
