package com.woniuxy.day003;

/**
 * 5、将数组倒置（基于原数组）
 */
public class Exercise05 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44};

        reverse02(arr1);
        System.out.println("倒置后的数组1为：");
        for (int temp : arr1) {
            System.out.print(temp + "\t");
        }

        System.out.println();
        reverse02(arr2);
        System.out.println("倒置后的数组2为：");
        for (int temp : arr2) {
            System.out.print(temp + "\t");
        }
    }

    public static void reverse01(int[] arr) {
        int tempFir = 0;
        int tempLast = 0;
        int indexOfStop = arr.length / 2;

        for (int i = 0; i < indexOfStop; i++) {
            tempFir = arr[i];
            tempLast = arr[arr.length - i - 1];

            arr[i] = tempLast;
            arr[arr.length - i - 1] = tempFir;
        }
    }

    public static void reverse02(int[] arr) {
        int temp = 0;
        int indexOfStop = arr.length / 2;

        for (int i = 0; i < indexOfStop; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
