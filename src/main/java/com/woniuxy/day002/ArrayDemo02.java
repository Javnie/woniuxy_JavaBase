package com.woniuxy.day002;

/**
 * 精度计算调用BigDecimal
 * BigDecimal(Str str)
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        double[] arr = new double[10];

        for (int i = 0; i < 10; i++) {
            String str = String.format("%.2f", Math.random() * 10);
//            System.out.println("str=" + str);

            arr[i] = Double.parseDouble(str);
//            System.out.println("double=" + arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        double account = 0;
        for (double temp : arr) {
            account += temp;
        }

        System.out.println("整型数组的数据合计为：" + account);
        System.out.println("----------");
        System.out.println("整形数组的平均数为：" + account / arr.length);
    }
}
