package com.woniuxy.day011;

import java.util.HashMap;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int random = (int) (Math.random() * 10) + 1;
            map.putIfAbsent(random, 0);
            map.put(random, map.get(random) + 1);
        }

        for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey() + "-->" + temp.getValue());
        }
    }
}
