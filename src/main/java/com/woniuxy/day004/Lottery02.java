package com.woniuxy.day004;

/**
 * 双色球：双色球投注区分为红球号码区和蓝球号码区，红球号码范围为01～33，蓝球号码范围为01～16；
 * 每期从33个红球中开出6个号码，从16个蓝球中开出1个号码作为中奖号码
 *
 * 本次代码需使用整型数组 int[]
 */
public class Lottery02 {
    public static void main(String[] args) {
        //新建存储双色球结果的数组
        int[] arr = new int[7];

        //红球
        for (int i = 0; i < 6; i++) {
            int red = (int) (Math.random() * 33 + 1);

            if (!ifContained(arr, red)) {
                arr[i] = red;
            }
        }

        //蓝球
        arr[6] = (int) (Math.random() * 16 + 1);

        //输出红球
        System.out.println("本次双色球的结果为：");
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + "-");
        }
        //输出蓝球
        System.out.println("->" + arr[6]);
    }

    public static boolean ifContained(int[] arr, int num) {
        boolean flag = false;

        for (int temp : arr) {
            if (num == temp) flag = true;
        }
        return flag;
    }
}
