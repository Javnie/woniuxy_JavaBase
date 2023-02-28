package com.woniuxy.day004;

import java.util.Scanner;

/**
 * 控制台分别输入年份和月份，遵循日历的格式打印出该年该月的日历信息
 * 注：1990年1月1日为星期一
 */
public class CalendarPrint {
    public static void main(String[] args) {
        //输入年份和月份
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

        int accountOfDays = 0;
        for (int i = 1990; i < year; i++) {
            if (isLeapYear(i))
                accountOfDays += 366;
            else
                accountOfDays += 365;
        }
        for (int i = 1; i < month; i++) {
            accountOfDays += accountOfDays(year, i);
        }

        //这种写法避免了周日的特殊情况
        //哪怕上个月最后一天是周日 --> 0  在计算本月第一天时 + 1 --> 1
        int lastDateOfWeek = accountOfDays % 7;

        //打印抬头
        System.out.print("周一\t周二\t周三\t周四\t周五\t周六\t周日");
        System.out.println();
        //为第一天前面的日子留空白
        for (int i = 0; i < lastDateOfWeek; i++) {
            System.out.print("\t");
        }
        //打印日历
        for (int i = 1; i <= accountOfDays(year, month); i++) {
            System.out.print(i + "\t");
            //周日时换行技巧
            if ((accountOfDays + i) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 || year % 3200 == 0 && year % 172800 == 0;
    }

    public static int accountOfDays(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
    }
}