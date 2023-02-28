package com.woniuxy.day002;

import java.util.Scanner;

/**
 * 2，计算整型数组中偶数的数量与奇数的数量之差
 */
public class Day002c {
    public static void main(String[] args) {
        System.out.println("请输入数组的数量：");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (true) {
            if (num <= 0) {
                System.out.println("数组数量输入有误，请重新输入");
                num = scanner.nextInt();
            } else {
                break;
            }
        }
        int[] arr = new int[num];

        System.out.println("请依次输入数据：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int evenNum = 0;
        int oddNum = 0;

        for (int temp : arr) {
            if (temp % 2 == 0) {
                evenNum++;
            }else {
                oddNum++;
            }
        }

        int actualNum = evenNum - oddNum;

//        if (actualNum < 0) {
//            actualNum = (-actualNum);
//        }

        actualNum=actualNum>=0?actualNum:-actualNum;

        System.out.println("---------------");
        System.out.printf("数组中偶数的数量与奇数的数量之差为：%d", actualNum);
    }
}
