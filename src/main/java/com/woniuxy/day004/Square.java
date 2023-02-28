package com.woniuxy.day004;

/**
 * 绘制一个空心正方形
 */
public class Square {
    public static void main(String[] args) {
        drawSquare(5);
    }

    public static void drawSquare(int a) {
        for (int i = 0; i < a; i++) {
            if (i == 0 || i == a - 1) {
                for (int j = 0; j < a; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = 1; j < a - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
