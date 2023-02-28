package com.woniuxy.day003;

/**
 * 6、计算两个整型数组之和，结果放在新数组中。示例如下：
 * {1,2,3}+{4,5,6}={5,7,9}
 * {1,2,3,4}+{4,5,6}={5,7,9,4}
 * {4,5,6}+{1,2,3,4}={5,7,9,4}
 */
public class Exercise06 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        for (int temp : addArray(arr1, arr2))
            System.out.print(temp + "\t");
        System.out.println("");

        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = {4, 5, 6};

        for (int temp : addArray(arr3, arr4))
            System.out.print(temp + "\t");
        System.out.println("");

        int[] arr5 = {4, 5, 6};
        int[] arr6 = {1, 2, 3, 4};

        for (int temp : addArray(arr5, arr6))
            System.out.print(temp + "\t");

    }

    public static int[] addArray(int[] arr1, int[] arr2) {
        int num = arr1.length >= arr2.length ? arr1.length : arr2.length;

        int[] dest = new int[num];

        int j = 0; //初始化dest中的索引
        for (int i = 0; i < arr1.length; i++) {
            dest[j++] += arr1[i];
        }

        j = 0;    //再次初始化dest中的索引
        for (int i = 0; i < arr2.length; i++) {
            dest[j++] += arr2[i];
        }

        return dest;
    }
}
