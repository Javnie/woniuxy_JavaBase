package com.woniuxy.day004;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 从键盘输入成绩，直到输入-1时中止，并计算出平均成绩
 */
public class GradesCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请依次录入成绩：");

        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            } else if (grade < 0) {
                System.out.println("本次成绩输入有误，请重新输入");
            } else {
                arr.add(grade);
            }
        }

        int account = 0;
        for (Integer temp : arr) {
            account += temp;
        }
        if (arr.size() == 0) {
            System.out.println("没有录入成绩");
        } else {
            System.out.println("平均成绩为：" + (double) account / arr.size());
        }
        
    }
}
