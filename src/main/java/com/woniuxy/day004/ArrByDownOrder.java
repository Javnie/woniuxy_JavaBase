package com.woniuxy.day004;

/**
 * 冒泡排序（降序）
 */
public class ArrByDownOrder {
    public static void main(String[] args) {
        int[] arr = {4, 7, 5, 9, 40, 6, 70, 64, 31};

        byDownOrder(arr);
        for (int temp : arr) {
            System.out.print(temp + "\t");
        }
    }

    public static void byDownOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
