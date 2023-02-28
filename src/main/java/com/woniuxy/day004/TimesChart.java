package com.woniuxy.day004;

/**
 * 编写一个九九乘法表
 */
public class TimesChart {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d×%d=%d\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
