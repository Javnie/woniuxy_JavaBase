package com.woniuxy.day004;

import java.util.Scanner;

/**
 * 给定一个正整数，分别累加各位数上的数字，得出结果 1234=10
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("输入数据有误，请重新输入");
            num = scanner.nextInt();
        } else {
            System.out.println("该数据各位数之和为：" + addUp(num));
        }
    }

    public static int addUp(int num) {
        int account = 0;

        do {
            account += num % 10;  //取个位数
            num /= 10;            //再砍数字大小(如果只剩个位数，就会砍成0)
        } while (num > 0);

        return account;
    }
}
