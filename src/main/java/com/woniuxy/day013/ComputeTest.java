package com.woniuxy.day013;

/**
 * （4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。
 */
public class ComputeTest {
    public static void main(String[] args) {
        UseCompute uc = new UseCompute();

        try {
            System.out.println(uc.useCom(new Plus(), 1, 1));
            System.out.println(uc.useCom(new Minus(), 1, 1));
            System.out.println(uc.useCom(new Times(), 1, 1));
            System.out.println(uc.useCom(new Divided(), 1, 1));
//            System.out.println(uc.useCom(new Divided(), 1, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
