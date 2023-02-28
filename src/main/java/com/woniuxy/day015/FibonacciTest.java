package com.woniuxy.day015;

/**
 * 任务2：斐波拉栔数列：1,1，2，3,5,8,13,21,34    计算给定位置的数是多少，输入6，返回8
 */
public class FibonacciTest {
    public static void main(String[] args) {
        System.out.println(new FibonacciTest().fibonacci(8));
    }

    int fibonacci(int num) {
        if (num == 1 || num == 2) return 1;
        else return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
