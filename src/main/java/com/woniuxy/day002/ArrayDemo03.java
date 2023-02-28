package com.woniuxy.day002;

import java.math.BigDecimal;

/**
 * 精度计算调用BigDecimal
 * BigDecimal(Str str)
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        BigDecimal[] arr = new BigDecimal[10];

        for (int i = 0; i < 10; i++) {
            String str = String.format("%.2f", Math.random() * 10);
            arr[i] = new BigDecimal(str);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        BigDecimal account = new BigDecimal("0");
        for (int i = 0; i < arr.length; i++) {
            account = account.add(arr[i]);
        }

        System.out.println("整型数组的数据合计为：" + account);
        System.out.println("----------");
        System.out.println("整形数组的平均数为：" + (account.divide(new BigDecimal(arr.length))));
    }
}
