package com.woniuxy.day001;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要判断的数字：");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("这个数字为偶数");
        } else {
            System.out.println("这个数字不为偶数");
        }
    }
}
