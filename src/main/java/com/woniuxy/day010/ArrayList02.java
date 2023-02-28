package com.woniuxy.day010;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * //实现一个方法，接收List<String>,返回其中长度大于2的数据
 *
 * 对List<String>的数据按照长度进行降序排序
 */
public class ArrayList02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("0");
        list.add("00");
        list.add("99");
        list.add("000");
        list.add("0000");

        for (String temp : returnNum(list)) {
            System.out.println(temp);
        }

        System.out.println("----------");
        sort(list);
        for (String temp : list) {
            System.out.println(temp);
        }
    }

    static List<String> returnNum(List<String> list) {
        List<String> result = new ArrayList<>();

        for (String temp : list) {
            if (temp.length() > 2) result.add(temp);
        }

        return result;
    }

    static List<String> sort(List<String> list) {
        list.sort(new Comparator<String>() {
            @Override
            //负整数会交换两个的位置 o1代表前面的 o2代表后面的
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;// 前面的更大，不交换，所以返回1
                if (o1.length() < o2.length()) return -1;// 后面的更大，交换，所以返回-1
                else return 0;
            }
        });

        return list;
    }
}

