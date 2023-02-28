package com.woniuxy.day004;

import java.util.ArrayList;

/**
 * 双色球：双色球投注区分为红球号码区和蓝球号码区，红球号码范围为01～33，蓝球号码范围为01～16；
 * 每期从33个红球中开出6个号码，从16个蓝球中开出1个号码作为中奖号码
 */
public class Lottery01 {
    public static void main(String[] args) {
        ArrayList<Integer> lotArr = new ArrayList<>();

        //红球
        while (true) {
            int red = (int) (Math.random() * 33 + 1);
            if (!lotArr.contains(red)) {
                lotArr.add(red);
            }
            if (lotArr.size() == 6) {
                break;
            }
        }

        //蓝球
        int blue = (int) (Math.random() * 16 + 1);
        lotArr.add(blue);

        //输出红球
        System.out.println("本次双色球的结果为：");
//        for (int i = 0; i < lotArr.size() - 1; i++) {
//            System.out.print(lotArr.get(i) + "-");
//        }

        //subList(), subString()等-sub系列的方法，都应该理解为for循环中的i=0, i<length
        //其中的length即为遍历的数量，所以当-sub系列方法中的startIndex==0时，endIndex也为【遍历的数量】
        for (Integer temp : lotArr.subList(0, lotArr.size() - 1)) {
            System.out.print(temp + "-");
        }

        //输出蓝球
        System.out.println("->" + lotArr.get(lotArr.size() - 1));
    }
}
