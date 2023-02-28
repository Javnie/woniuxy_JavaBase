package com.woniuxy.day003;

/**
 * 遍历字符串中的字符，并且统计其中的元音字母的个数
 */
public class StringJob01 {
    public static void main(String[] args) {
        String str = "soundalikes";

        int account = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            System.out.print(temp + "\t");
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                account++;
            }
        }

        System.out.println();
        System.out.println("元音字母的个数为：" + account);

        //Thus the length of the substring is endIndex-beginIndex.
        //sub- 自下而上地
        System.out.println(str.substring(0, 5));        //sound
        System.out.println(str.substring(6)); //likes
    }
}
