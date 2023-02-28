package com.woniuxy.day001;

import java.util.Scanner;

/**
 * 1、从键盘输入两个整数，分别输出他们加减乘除及求余的结果
 * 2、从键盘输入两个整数，输出他们的大小
 */
public class Day001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入【任务1】的整数1：");
        int num1 = scanner.nextInt();
        System.out.println("请输入【任务1】的整数2：");
        int num2 = scanner.nextInt();

        System.out.println("加法结果为：" + (num1 + num2));
        System.out.println("减法结果为：" + (num1 - num2));
        System.out.println("乘法结果为：" + (num1 * num2));
        if (num2 == 0) {
            System.out.println("整数2不能为零，除法计算出错");
        } else {
            System.out.println("除法结果为：" + (num1 / num2));
        }
        if (num2 == 0) {
            System.out.println("整数2不能为零，求余计算出错");
        } else {
            System.out.println("求余结果为：" + (num1 % num2));
        }


        System.out.println("-----------");

        System.out.println("请输入【任务2】的整数1：");
        int num3 = scanner.nextInt();
        System.out.println("请输入【任务2】的整数2：");
        int num4 = scanner.nextInt();

        if (num3 > num4) {
            System.out.printf("第一个输入的数字【%d】 > 第二个输入的数字【%d】", num3, num4);
        } else if (num3 < num4) {
            System.out.printf("第一个输入的数字【%d】 < 第二个输入的数字【%d】", num3, num4);
        } else {
            System.out.printf("第一个输入的数字【%d】 = 第二个输入的数字【%d】", num3, num4);
        }

    }
}
