package com.woniuxy.day005;

/**
 * 计算两个整型数组之和
 *
 * TRICK: Math.max()
 */
public class ArrMeth02 {
    public static void main(String[] args) {
        for (int temp : arrAdded(new int[]{1, 2, 3, 4, 10}, new int[]{4, 3, 2, 1}))
            System.out.print(temp + "\t");
    }

    static int[] arrAdded(int[] arr1, int[] arr2) {
        int[] dest = new int[Math.max(arr1.length, arr2.length)];

        for (int i = 0; i < arr1.length; i++) {
            dest[i] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            dest[i] += arr2[i];
        }
        return dest;
    }
}
