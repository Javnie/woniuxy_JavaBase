package com.woniuxy.day012;

import java.util.List;

/**
 * 实现方法，用于获取 List<Integer>中最大的数
 */
public class GetMax {
    Integer getMax(List<Integer> list) throws Exception {
        if (list == null) throw new Exception("List不能为空");

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list.get(0);
    }
}
