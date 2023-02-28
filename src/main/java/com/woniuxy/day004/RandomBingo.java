package com.woniuxy.day004;

import java.util.Scanner;

/**
 * 随机数生成0~10的整数 [0,10] ，键盘输入数字进行判断：大、小、Bingo
 *
 * TIP: 将目标数范围数量乘在随机数上(*)，然后再比较多了/少了范围，进行加减数量(+/-)
 */
public class RandomBingo {
    public static void main(String[] args) {
//        //随机数区间校验
//        for (int i = 0; i < 50; i++) {
//            int random = (int) ((Math.random() * 11)); //[0,11) => [0,10]
//            System.out.println("本次随机数生成为：" + random);
//        }

        int goal = (int) ((Math.random() * 11)); //[0,11) => [0,10]

        Scanner scanner = new Scanner(System.in);
        int getNum = scanner.nextInt();

        while (true) {
            if (getNum == goal) {
                System.out.println("BINGO!");
                break;
            } else if (getNum > goal) {
                System.out.println("oops..猜大了..");
                getNum = scanner.nextInt();
            } else {
                System.out.println("oops..猜小了..");
                getNum = scanner.nextInt();
            }
        }

    }
}
