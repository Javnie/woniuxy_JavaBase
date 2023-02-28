package com.woniuxy.day004;

/**
 * 冒泡排序(升序)
 */
public class ArrByUpperOrder {
    public static void main(String[] args) {
        int[] arr = {4, 7, 5, 9, 40, 6, 70, 64, 31};

        byUpperOrder(arr);
        for (int temp : arr) {
            System.out.print(temp + "\t");
        }
    }

    public static void byUpperOrder(int[] arr) {
        //外循环次数为length-1 -->表示需要更改的数有多少个，剩1个数不用动
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环次数为length-1-i -->表示交换动作，交换动作本身为length-1，需要再减去已经确定的数i
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
