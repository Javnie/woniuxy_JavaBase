package com.woniuxy.day002;

import java.util.Scanner;

/**
 * 输出最高成绩
 */
public class Day002b {
    public static void main(String[] args) {
        System.out.println("请输入学生总人数：");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (true) {
            if (num <= 0) {
                System.out.println("学生人数输入有误，请重新输入");
                num = scanner.nextInt();
            } else {
                break;
            }
        }
        int[] arr = new int[num];

        System.out.println("请依次录入学生成绩：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

//        int max = Integer.MIN_VALUE;
//        for (int temp : arr) {
//            if (temp >= max) {
//                max = temp;
//            }
//        }

        int max = arr[0];
        for (int temp : arr) {
            if (temp >= max) {
                max = temp;
            }
        }

        System.out.println("---------------");
        System.out.printf("学生成绩中最高分数为：%d分", max);
    }
}
