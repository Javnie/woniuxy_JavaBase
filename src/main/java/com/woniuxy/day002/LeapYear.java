package com.woniuxy.day002;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("请输入年份：");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();

        boolean isLeapYear1=year%4==0 && year%100!=0;
        boolean isLeapYear2=year%400==0;
        boolean isLeapYear3=year%3200==0 && year%172800==0;

        if(isLeapYear1||isLeapYear2||isLeapYear3){
            System.out.printf("【%d】年属于闰年",year);
        }else {
            System.out.printf("【%d】年不属于闰年",year);
        }
    }
}
