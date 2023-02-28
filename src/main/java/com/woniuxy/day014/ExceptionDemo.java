package com.woniuxy.day014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 课堂任务：计算零个整型数组的商，结果存在整型数组中
 * {10,11,12,13,14,15} / {2,3,4}={5,3,3,13,14,15}
 * 异常：出现除以0的情况，抛异常，当除数与被除数相等时，抛异常
 * 声明方法，接收两个整型数组，结果就一个整型数组，建议抛出不同类型的异常(RuntimeException,Exception)
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        List<Integer> list01 = Arrays.asList(10, 11, 12, 13, 14, 15);
        List<Integer> list02 = Arrays.asList(2, 3, 4, 13);

//        try {
//            divide(list01, list02).forEach(i -> System.out.print(i + "\t"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        System.out.println("-----------");
        System.out.println(testReturn(list01, list02));

    }

    static List<Integer> divide(List<Integer> list01, List<Integer> list02) throws Exception {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < Math.max(list01.size(), list02.size()); i++) {
            if (i < Math.min(list01.size(), list02.size())) {
                if (list02.get(i) == 0) throw new Exception("除数不能为0");
                if (list01.get(i).equals(list02.get(i))) throw new RuntimeException("除数与被除数不能相同");

                res.add(list01.get(i) / list02.get(i));
            } else res.add(list01.get(i) == null ? list02.get(i) : (list01.get(i)));
        }
        return res;
    }

    static int testReturn(List<Integer> list01, List<Integer> list02) {


        try {
            divide(list01, list02).forEach(i -> System.out.print(i + "\t"));
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return 2;
        }
    }
}
