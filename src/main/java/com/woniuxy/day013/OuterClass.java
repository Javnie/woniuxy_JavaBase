package com.woniuxy.day013;

public class OuterClass {
    class InnerClass01 {
        void test() {
            System.out.println("InnerClass01");
        }
    }

    static class InnerClass02 {
        static void test() {
            System.out.println("InnerClass02");
        }
    }

    public static void main(String[] args) {
        OuterClass.InnerClass01 oi1 = new OuterClass().new InnerClass01();
        OuterClass.InnerClass02 oi2 = new OuterClass.InnerClass02();

        oi1.test();
//        oi2.test();

        new OuterClass.InnerClass02().test();
        InnerClass02.test();
    }
}
