package com.woniuxy.day013;

/**
 * （3）设计一个类UseCompute，类中含有方法：public int useCom(Computable com, int one, int two)，
 * 此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
 */
public class UseCompute {
    public int useCom(Computable com, int one, int two) throws Exception {
        return com.computer(one, two);
    }
}
