package com.woniuxy.day012;

/**
 * 声明用户操作类 (UserOpr),该类有两个静态方法：
 * getCall 接受 User 类型的参数。然后根据 User 的年龄范围返回该用户的称呼
 * （<18, 称为少年 ，19 -49 ，称为成年 ,50 及以 上称为老年 ）。
 * compare 比较两个 User 的年龄，第一个 User 年长返回 1，第二个年长返回-1，同年龄返回 0
 */
public class UserOpr {
    static String getCall(User user) throws Exception {
        if (user == null) throw new Exception("用户不能为空");
        if (user.getAge() < 0) throw new Exception("用户的年龄有误，不能为负数");

        if (user.getAge() < 18) return "少年";
        else if (user.getAge() < 49) return "成年";
        else return "老年";
    }

    static int compare(User u1, User u2) throws Exception {
        if (u1 == null || u2 == null) throw new Exception("用户不能为空");
        if (u1.getAge() < 0 || u2.getAge() < 0) throw new Exception("用户的年龄有误，不能为负数");

        if (u1.getAge() > u2.getAge()) return 1;
        else if (u1.getAge() < u2.getAge()) return -1;
        else return 0;
    }
}
