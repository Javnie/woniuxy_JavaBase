package com.woniuxy.day002;

import java.util.Scanner;

/**
 * 排序 undone
 */
public class Day002d {
    public static void main(String[] args) {
        System.out.println("请输入学生总人数：");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (true) {
            if (num <= 0) {
                System.out.println("学生人数输入有误，请重新输入");
                num = scanner.nextInt();
            } else {
                break;
            }
        }
        int[] arr = new int[num];

        System.out.println("请依次录入学生成绩：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max=0;
        int[] arrByOrder=new int[arr.length];



        System.out.println("---------------");
        System.out.println("由高至低对分数排序结果为：");
        for(int i=0;i<arrByOrder.length;i++){
            if(i==arrByOrder.length)
                System.out.print(arrByOrder[i]);
            else
                System.out.printf(arrByOrder[i]+"\t");
        }
    }
}
