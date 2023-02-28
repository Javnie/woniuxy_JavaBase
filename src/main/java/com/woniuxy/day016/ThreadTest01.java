package com.woniuxy.day016;

public class ThreadTest01 {
    public static void main(String[] args) {
        //Thread的start()调用run方法()

        //new Thread() --> 重写Thread类的run()
        new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 10; i++) {
                        Thread.sleep((long) (Math.random() * 3000));
                        System.out.println(Thread.currentThread().getName() + "-->" + i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        //new Thread(Runnable target) --> 重写Runnable接口的run()
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    Thread.sleep((long) (Math.random() * 3000));
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new MyThread().start();

        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep((long) (Math.random() * 3000));
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep((long) (Math.random() * 3000));
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
