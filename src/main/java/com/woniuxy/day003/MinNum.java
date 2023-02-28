package com.woniuxy.day003;

/**
 * 输出数组中的最小值
 */
public class MinNum {
    public static void main(String[] args) {
        int[] arr={-1,0,5,7,10,64,-98,-41};

        int minNum=arr[0];
        for (int temp : arr) {
            if(temp<=minNum){
                minNum=temp;
            }
        }

//        int minNum=Integer.MAX_VALUE;
//        for (int temp : arr) {
//            if(temp<=minNum){
//                minNum=temp;
//            }
//        }

        System.out.println("数组中最小值为："+minNum);
    }
}
