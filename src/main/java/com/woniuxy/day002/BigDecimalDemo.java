package com.woniuxy.day002;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        String str1 = "1.6";
        String str2 = "1.7";

        BigDecimal bd1 = new BigDecimal(str1);
        BigDecimal bd2 = new BigDecimal(str2);

        System.out.println(str1 + "\t" + str2);

        System.out.println(bd1.add(bd2));
    }
}
