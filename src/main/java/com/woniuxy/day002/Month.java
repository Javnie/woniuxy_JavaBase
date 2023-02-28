package com.woniuxy.day002;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        while (true) {
            if (1 < month && month > 12) {
                System.out.println("月份输入有误，请重新输入");
                month = scanner.nextInt();
            } else {
                break;
            }
        }

        System.out.println("----------");

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.printf("%d年%d月的天数为：31天", year, month);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.printf("%d年%d月的天数为：30天", year, month);
        } else {
            boolean isLeapYear1 = year % 4 == 0 && year % 100 != 0;
            boolean isLeapYear2 = year % 400 == 0;
            boolean isLeapYear3 = year % 3200 == 0 && year % 172800 == 0;

            if (isLeapYear1 || isLeapYear2 || isLeapYear3) {
                System.out.printf("%d年%d月的天数为：29天", year, month);
            } else {
                System.out.printf("%d年%d月的天数为：28天", year, month);
            }
        }
    }
}
