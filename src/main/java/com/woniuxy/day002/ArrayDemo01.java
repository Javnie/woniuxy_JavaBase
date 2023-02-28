package com.woniuxy.day002;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

//        for (int temp : arr) {
//            System.out.print(temp + "\t");
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if (i == arr.length - 1)
                System.out.println(arr[i]);
        }

//        int account = 0;
//        for (int i = 0; i < arr.length; i++) {
//            account = account + arr[i];
//        }
//        System.out.println("整型数组的数据合计为：" + account);

        int account = 0;
        for (int temp : arr) {
            account += temp;
        }
        System.out.println("整型数组的数据合计为：" + account);

        //int强转为double
        System.out.println("整形数组的平均数为："+(account*1.00)/arr.length);
    }
}
