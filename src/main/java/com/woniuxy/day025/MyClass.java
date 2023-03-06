package com.woniuxy.day025;

public class MyClass implements MyInterface{
    @Override
    public void test1() {
        System.out.println("this is test1");
    }

    @Override
    public void test2(int num) {
        System.out.println("this is test2");
    }

    @Override
    public int test3(int n1, int n2) {
        System.out.println("this is test3 and the result is:");
        return n1+n2;
    }

    @Override
    public String test4() {
        return "现在你所看到的是test4";
    }
}
