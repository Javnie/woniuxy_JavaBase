package com.woniuxy.day010;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 3, 2};

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int ret = 0;
                if (o2 > o1) {
                    ret = -1;
                } else if (o2 < o1) {
                    ret = 1;
                } else {//等于
                    ret = 0;
                }
                return ret;
            }
        });
        System.out.println(Arrays.toString(array));
    }

}