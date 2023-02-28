package com.woniuxy.day013;

/**
 * （2）设计四个类分别实现此接口，完成加减乘除运算。
 */
public class Divided implements Computable {
    @Override
    public int computer(int n, int m) throws Exception {
        if (m == 0) throw new Exception("被除数不能为0");

        return n / m;
    }
}
