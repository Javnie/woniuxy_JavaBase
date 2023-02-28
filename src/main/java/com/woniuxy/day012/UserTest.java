package com.woniuxy.day012;

/**
 * 实现测试类，在 main 方法中实例化 User 对象并使用构造方法赋初值，然后输出
 * UserOpr 的 getCall 方法返回的结果及compare两个用户的比较结果。
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("小明", 18);
        User u2 = new User("小红", 60);

        try {
            System.out.println(UserOpr.getCall(u1));
            System.out.println(UserOpr.getCall(u2));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(UserOpr.compare(u1, u2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
