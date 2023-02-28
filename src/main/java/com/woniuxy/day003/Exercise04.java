package com.woniuxy.day003;

/**
 * 4、 将一个数组的奇数索引位拷贝到另一个数组中前半部分，偶数索引位数字拷贝到后半部分
 *
 * 补充switchLocation02()
 */
public class Exercise04 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};  //2,4,1,3,5    1->0 3->1 0->2 2->3 4->4
        int[] arr2 = {1, 2, 3, 4};     //2,4,1,3      1->0 3->1 0->2 2->3

        for (int temp : switchLocation01(arr1))
            System.out.print(temp + "\t");

        System.out.println();  //分割线

        for (int temp : switchLocation02(arr2))
            System.out.print(temp + "\t");
    }

    public static int[] switchLocation01(int[] arr) {
        int num = arr.length;     //原始数组中的长度
        int[] dest = new int[num];
        int j = 0;                //结果数组中的索引

        for (int i = 0; i < num; i++) {
            if (i % 2 != 0) {   //奇数索引
                dest[j++] = arr[i];
            }
        }

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {  //偶数索引
                dest[j++] = arr[i];
            }
        }
        return dest;
    }

    public static int[] switchLocation02(int[] arr) {
        int num = arr.length;
        int[] dest = new int[num];

        for (int i = 0; i < arr.length; i++) {
            //奇数索引位
            if (i % 2 != 0) {
                dest[i / 2] = arr[i];
            } else {
                //偶数索引位
                dest[(i + arr.length) / 2] = arr[i];
            }
        }
        return dest;
    }
}