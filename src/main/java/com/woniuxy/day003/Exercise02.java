package com.woniuxy.day003;

/**
 * 2、计算1-100之间的整数之和，当和达到500时终止，输出此时的整数多少
 */
public class Exercise02 {
    public static void main(String[] args) {
        int account = 0;

        for (int i = 1; i <= 100; i++) {
            account += i;
            if (account >= 500) {
                System.out.println("算术和已达到500，此时的整数为：" + i);
                break;
            }
        }
    }
}
