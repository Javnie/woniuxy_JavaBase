package com.woniuxy.day010;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("刘明");
        list.add("刘明");
        list.add("刘明");
        list.add("刘明");
        list.add("刘星");

        for (String temp : list) {
            System.out.println(temp);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith("刘")) {
                list.remove(i--);
            }
        }
        System.out.println("----------");

        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
