package com.woniuxy.day006;

import java.util.HashSet;

/**
 * 1、编写方法判断 3 个整数是否能构成一个三角形的边长。
 * 2、 编写方法计算两个整型数组中所有数据之和。
 * 3，编写方法获取两个字符串数组中都存在的元素的数量。
 */
public class WeekTest {
    public static void main(String[] args) {
        System.out.println(method03a(new String[]{"apple", "apple", "orange", "apple"}, new String[]{"orange", "apple"}));
        System.out.println(method03b(new String[]{"apple", "apple", "orange", "apple"}, new String[]{"orange", "apple"}));
    }

    static boolean method01(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return false;
        return a + b > c && a + c > b && b + c > a;
    }

    static int method02(int[] arr1, int[] arr2) {
        int account = 0;

        for (int temp : arr1) {
            account += temp;
        }
        for (int temp : arr2) {
            account += temp;
        }
        return account;
    }

    static int method03a(String[] arr1, String[] arr2) {
        //自我遍历检查是否有重复数据
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i].equals(arr1[j])) {
                    arr1[i] = null;
                    break;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i].equals(arr2[j])) {
                    arr2[i] = null;
                    break;
                }
            }
        }

        int account = 0;
        for (int i = 0; i < arr1.length; i++) {
            String temp = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (temp != null) {
                    if (temp.equals(arr2[j])) {
                        account++;
                        break;
                    }
                }
            }
        }
        return account;
    }

    //该方法使用两个 HashSet 来存储两个字符串数组中的元素。
    //然后，使用 retainAll 方法找出两个 HashSet 中都存在的元素。最后，返回这个集合的大小即为所求。
    static int method03b(String[] arr1, String[] arr2) {
        HashSet<String> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();

        for (String temp : arr1) {
            hs1.add(temp);
        }
        for (String temp : arr2) {
            hs2.add(temp);
        }

        hs1.containsAll(hs2);
        return hs1.size();
    }
}
