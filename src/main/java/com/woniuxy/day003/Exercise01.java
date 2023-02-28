package com.woniuxy.day003;

import java.util.Scanner;

/**
 * 1、从键盘输入一个3位数的整数，判断其是否是7的倍数或带有数字7
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个3位数的整数：");
        int num = scanner.nextInt();

        while (true) {
            if ((num < 1000 && num > 99) || (num > -1000 && num < -99)) {
                break;
            } else {
                System.out.println("输入有误，请重新输入");
                num = scanner.nextInt();
            }
        }

        if (num % 7 == 0) {
            System.out.println("【" + num + "】" + "是7的倍数");
        } else {
            System.out.println("【" + num + "】" + "不是7的倍数");
        }

        int hundredsPlace = num / 100;
        int tensPlace = (num - hundredsPlace * 100) / 10;
        int onesPlace = num - hundredsPlace * 100 - tensPlace * 10;

        if (hundredsPlace == 7 || tensPlace == 7 || onesPlace == 7) {
            System.out.println("【" + num + "】" + "带有数字7");
        } else {
            System.out.println("【" + num + "】" + "不带有数字7");
        }


    }
}
