package com.woniuxy.day015;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ThreadSafe {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        int num = 10000;
        CountDownLatch cdl = new CountDownLatch(num);

        for (int i = 0; i < num; i++) {
            new Thread(() -> {
                list.add("");
            }).start();
            cdl.countDown();
        }

        cdl.await();
        System.out.println(list.size());
    }
}
