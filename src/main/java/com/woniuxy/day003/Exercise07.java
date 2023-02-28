package com.woniuxy.day003;

/**
 * 7、判断一个整型数组是否包含另一个整型数组
 */
public class Exercise07 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3};
        if (isCovered(arr1, arr2)) {
            System.out.println("数组arr1包含数组arr2");
        } else {
            System.out.println("数组arr1不包含数组arr2");
        }

        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 4};
        if (isCovered(arr3, arr4)) {
            System.out.println("数组arr3包含数组arr4");
        } else {
            System.out.println("数组arr3不包含数组arr4");
        }
    }

    //此方法中默认 arr1.length >= arr2.length
    public static boolean isCovered(int[] arr1, int[] arr2) {
        boolean flag = false;

        //开始遍历arr1的数据，如果有满足等于arr2第一项的起始条件，则继续
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[0] == arr1[i]) {
                //继续判断arr2剩余数据是否全部在arr1中
                for (int j = 0; j < arr2.length; j++) {
                    if (arr2[j] == arr1[i++]) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }
}
