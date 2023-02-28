package com.woniuxy.day005;

/**
 * 编写一个方法，传入两个整型参数和一个字符串，将字符串传入数学运算符，返回结果
 */
public class ComputeMeth {
    public static void main(String[] args) {
        System.out.println(compute(1, 2, '-'));
    }

    static int compute(int a, int b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
            default:
                return 0;
        }
    }
}
