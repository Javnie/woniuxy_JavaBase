package com.woniuxy.day012;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 随机生成 10 个[1,100]之间的整数，放到 List 集合中，遍历显示，找出前 3 名最大值，
 * 删除它们
 */
public class RandomTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100) + 1;
            list.add(random);
        }

        for (Integer temp : list) {
            System.out.printf(temp + "\t");
        }

//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = 0; j < list.size() - 1 - i; j++) {
//                if (list.get(j) < list.get(j + 1)) {
//                    int temp = list.get(j);
//                    list.set(j, list.get(j + 1));
//                    list.set(j + 1, temp);
//                }
//            }
//        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println();
        for (Integer temp : list) {
            System.out.printf(temp + "\t");
        }

        for (int i = 0; i < 3; i++) {
            list.remove(0);
        }

        System.out.println();
        for (Integer temp : list) {
            System.out.printf(temp + "\t");
        }
    }
}
