package com.woniuxy.day003;

/**
 * 将不重复的姓名保存到字符串数组中，给定一个姓名，找到该姓名出现的位置
 */
public class StringJob03 {
    public static void main(String[] args) {
        String[] nameArr = {"张三", "李四", "王五", "陈六", "杨七"};
        String goal = "陈六";

        for (int i = 0; i < nameArr.length; i++) {
            if (nameArr[i].equals(goal)) {
                System.out.println("目标姓名位于第" + (i + 1) + "个");
                break;
            }
        }
    }
}
