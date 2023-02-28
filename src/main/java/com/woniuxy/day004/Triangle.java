package com.woniuxy.day004;

/**
 * 绘制一个倒三角形
 */
public class Triangle {
    public static void main(String[] args) {
        drawTriangle(10, 20);
    }

    public static void drawTriangle(int column, int row) {
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");    //第一部分的空格
            }
            for (int j = 0; j < (row - i * 2); j++) {
                System.out.print("*");    //第二部分的实体
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");    //第三部分的空格
            }
            System.out.println();
        }
    }
}
