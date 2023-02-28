package com.woniuxy.day016;

import java.util.concurrent.TimeUnit;

public class ThreadSafe {
    public static void main(String[] args) {
        new Thread(ThreadSafe::method01).start();
        new Thread(ThreadSafe::method02).start();
    }

    static void method01() {
        try {
            synchronized (ThreadSafe.class) {
                System.out.println("method01");
                TimeUnit.SECONDS.sleep(2);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized static void method02() {
        try {
            System.out.println("method02");
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
