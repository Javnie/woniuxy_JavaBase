package com.woniuxy.day013;

interface Interface01 {
    void test();
}

interface Interface02 {
    void test(int num);
}

interface Interface03 {
    int test(int num);
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Interface01 i1 = (() -> System.out.println("Interface01"));
        Interface02 i2 = ((num -> System.out.println("Interface02" + num)));
        Interface03 i3 = ((num -> num++));
    }

}
