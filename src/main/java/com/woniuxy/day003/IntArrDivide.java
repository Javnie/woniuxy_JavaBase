package com.woniuxy.day003;

/**
 * 将整型数组中3的倍数除以3，更新原数组
 */
public class IntArrDivide {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,9,13,64,43,33};
        System.out.print("原数组为：");
        for (int temp : arr) {
            System.out.print(temp+"\t");
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%3==0)
                arr[i]/=3;
        }

//        for (int temp : arr) {
//            if(temp%3==0)
//                temp/=3;
//        }

        System.out.println();
        System.out.print("新数组为：");
        for (int temp : arr) {
            System.out.print(temp+"\t");
        }
    }
}
