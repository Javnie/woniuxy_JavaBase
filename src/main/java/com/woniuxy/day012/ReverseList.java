package com.woniuxy.day012;

import java.util.List;

/**
 * 设计方法，实现 List<String>集合的反转
 */
public class ReverseList {
    List<String> reverseList(List<String> list) throws Exception {
        if (list == null) throw new Exception("List不能为空");

        for (int i = 0; i < list.size() / 2; i++) {
            String temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
        return list;
    }
}
