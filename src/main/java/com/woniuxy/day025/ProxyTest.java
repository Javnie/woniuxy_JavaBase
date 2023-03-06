package com.woniuxy.day025;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        MyInterface myInterface=new MyClass();
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler(myInterface);

        //实例化ProxyInstance时需要强转至对应的Interface类型
        MyInterface o =(MyInterface) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), new Class[]{MyInterface.class}, myInvocationHandler);
        o.test1();
        o.test2(1);
        System.out.println(o.test3(1, 2));
        System.out.println(o.test4());
    }
}

class MyInvocationHandler implements InvocationHandler{
    private MyInterface myInterface;

    public MyInvocationHandler(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---这是invoke重写里的start---");
        Object o=method.invoke(myInterface,args);
        System.out.println("---这是invoke重写里的end---");
        return o;
    }
}
