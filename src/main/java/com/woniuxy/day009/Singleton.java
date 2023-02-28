package com.woniuxy.day009;

public class Singleton {
    //私有化构造方法
    private Singleton() {
    }

    //私有化静态实例
    private static Singleton instance; //创建与否取决于饿汉和懒汉

//    //公开方法
//    public synchronized static Singleton getInstance() {
//        if(instance==null)
//            instance=new Singleton();
//        return instance;
//    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}