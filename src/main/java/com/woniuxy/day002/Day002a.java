package com.woniuxy.day002;

import java.util.Scanner;

/**
 * 1，统计成绩不及格的人数
 */
public class Day002a {
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

        int count = 0;
        for (int temp : arr) {
            if (temp < 60) {
                count++;
            }
        }

        System.out.println("---------------");
        System.out.printf("成绩不及格的人数为：%d人", count);
    }
}
