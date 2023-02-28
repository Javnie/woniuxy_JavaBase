package com.woniuxy.day003;

/**
 * 判断整型是否存在与整型数组中
 */
public class IntArrExist {
    public static void main(String[] args) {
        int[] arr = {-98, -7, -6, 10, 6, 74, 100};
        int goal = -7;

        boolean exist = false;
        for (int temp : arr) {
            if (temp == goal) {
                exist = true;
                break;
            }
        }

        if (exist) {
            System.out.printf("目标数【%d】存在于整型数组中", goal);
        } else {
            System.out.printf("目标数【%d】不存在于整型数组中", goal);
        }
    }
}
