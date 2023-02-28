package com.woniuxy.day015;

/**
 * 任务1：计算指定整数的阶乘，输入4，返回24
 */
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(new FactorialTest().factorial(4));
    }

    int factorial(int num) {
        if (num != 1) num *= factorial(--num);
        return num;
    }

    public static int jieCheng(int num) {
        if (num < 1) throw new IllegalArgumentException("参数不能小于1");

        //递归结束的条件
        if (num == 1) return 1;

        return num * jieCheng(num - 1);
    }
}
