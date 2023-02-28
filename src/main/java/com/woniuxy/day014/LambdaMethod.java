package com.woniuxy.day014;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaMethod {
    public static void main(String[] args) {
        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8})
                .filter(new Methods()::method01)
                .map(new Methods()::method02);
//                .collect(Collectors.toList());

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(new Methods()::method01)
                .map(new Methods()::method02)
                .collect(Collectors.toList());

//        Arrays.stream(); --> 数组创建
//        Collection实例.stream(); --> Collection实例创建
//        Stream.of();     --> Stream类主动创建
    }
}
