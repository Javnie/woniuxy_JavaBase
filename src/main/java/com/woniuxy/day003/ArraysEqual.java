package com.woniuxy.day003;

/**
 * 判断两个整型数组是否相等，规则：长度相等，对应位置的元素相等
 */
public class ArraysEqual {
    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {2,6,-7};

        boolean equal = false;
        if (arr1.length == arr2.length)
            equal = true;

        if (equal) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal) {
            System.out.println("数组1和数组2相等");
        } else {
            System.out.println("数组1和数组2不相等");
        }
    }
}
