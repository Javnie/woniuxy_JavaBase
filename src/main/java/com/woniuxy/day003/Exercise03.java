package com.woniuxy.day003;

/**
 * 3、求2/1,3/2,5/3,8/5,13/8...数列的前10项之和
 * <p>
 * METHOD-2：分母等于上一个分子，分子等于前两个分子相加 --> done!
 */
public class Exercise03 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        double[] numerator = new double[10];  //分母
        double[] denominator = new double[10];    //分子

        numerator[0] = 2;
        numerator[1] = 3;

        denominator[0] = 1;
        denominator[1] = 2;

        for (int i = 2; i < 10; i++) {
            numerator[i] = numerator[i - 1] + numerator[i - 2];
            denominator[i] = denominator[i - 1] + denominator[i - 2];
        }

        double account = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = numerator[i] / denominator[i];
            account += arr[i];
        }

        System.out.println("计算和的结果为：" + account);
        System.out.println("四舍五入结果为：" + Double.parseDouble(String.format("%.2f", account)));

        System.out.println("--------------------");
        addTen();

    }

    public static void addTen() {
        double[] arr = new double[10];
        double temp = 0;
        double account = 0;

        double denominator = 2;  //分子 denominator
        double numerator = 1;    //分母 numerator

        for (int i = 0; i < 10; i++) {
            arr[i] = denominator / numerator;
            account += arr[i];

            temp = denominator;
            denominator = denominator + numerator;
            numerator = temp;
        }

        System.out.println("计算和的结果为：" + account);
        System.out.println("四舍五入结果为：" + Double.parseDouble(String.format("%.2f", account)));
    }
}
