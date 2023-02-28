package com.woniuxy.day013;

/**
 * 利用接口做参数，写个计算器，能完成加减乘除运算。
 * （1）定义一个接口Computable含有一个方法int computer(int n, int m)
 */
@FunctionalInterface
public interface Computable {
    int computer(int n, int m) throws Exception;
}
