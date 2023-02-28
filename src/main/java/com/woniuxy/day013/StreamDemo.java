package com.woniuxy.day013;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);

        List<Integer> res = list.stream().filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .collect(Collectors.toList());

        System.out.println(res);
        System.out.println("----------");

        //list使用的是lang -- Iterable -- forEach
        list.forEach(num -> System.out.print(num + "\t"));

        //Map使用的是自己的forEach
        System.out.println();
        map.forEach((num1, num2) -> System.out.println("key=" + num1 + "\t value=" + num2));
    }
}
