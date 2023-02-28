package com.woniuxy.day005;

/**
 * 计算一个整数数组中，奇数的数量与偶数数量之差
 *
 * TRICK: Math.abs() --> absolute value 绝对值
 */
public class ArrMeth01 {
    public static void main(String[] args) {
        System.out.println("奇数的数量与偶数数量之差为：" + numMinus(new int[]{1, 2, 3, 4, 5}));
    }

    static int numMinus(int[] arr) {
        int num = 0;

        for (int temp : arr) {
            if (temp % 2 == 0)
                num++;
        }
        return Math.abs(arr.length - num * 2);
    }
}
