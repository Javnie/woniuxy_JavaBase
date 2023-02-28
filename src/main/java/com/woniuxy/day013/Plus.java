package com.woniuxy.day013;

/**
 * （2）设计四个类分别实现此接口，完成加减乘除运算。
 */
public class Plus implements Computable {
    @Override
    public int computer(int n, int m) {
        return n + m;
    }
}
