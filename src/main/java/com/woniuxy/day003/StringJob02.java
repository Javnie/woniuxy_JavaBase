package com.woniuxy.day003;

/**
 * 声明字符串数组，里面存储的学员的姓名，找出姓张的单名的学员
 * <p>
 * String比较用equals(); char,int...可以用==
 */
public class StringJob02 {
    public static void main(String[] args) {
        String[] nameArr = {"张三", "张飞", "李四", "张金强"};

        boolean exist = false;

        System.out.print("符合条件的学员姓名为：");
//        for (int i = 0; i < nameArr.length; i++) {
//            if (nameArr[i].charAt(0) == '张') {
//                if (nameArr[i].length() == 2) {
//                    System.out.print(nameArr[i] + "\t");
//                    exist = true;
//                }
//            }
//        }

//        for (String temp : nameArr) {
//            if (temp.charAt(0) == '张' && temp.length() == 2) {
//                System.out.print(temp + "\t");
//                exist = true;
//            }
//        }

        for (String temp : nameArr) {
//          if (temp.substring(0, 1) == "张" && temp.length() == 2) {
            if (temp.substring(0, 1).equals("张") && temp.length() == 2) {
                System.out.print(temp + "\t");
                exist = true;
            }
        }

        if (!exist)
            System.out.print("无");

    }
}
