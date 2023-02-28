package com.woniuxy.day011;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王麻子");
        map.put(4, "老谭");

        //1-遍历
        for (Integer temp : map.keySet()) {
            System.out.println("key=" + temp);
        }

        for (String temp : map.values()) {
            System.out.println("value=" + temp);
        }

        for (Map.Entry<Integer, String> temp : map.entrySet()) {
            System.out.println("key=" + temp.getKey() + "\tvalue=" + temp.getValue());
        }

        //2-添加
        map.put(5, "蜗牛学苑");
        //3-删除
        map.remove(4);
        //4-修改
        map.put(3, "王五");

        System.out.println("--------------------");
        for (Map.Entry<Integer, String> temp : map.entrySet()) {
            System.out.println("key=" + temp.getKey() + "\tvalue=" + temp.getValue());
        }
    }
}
