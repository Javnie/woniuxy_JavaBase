package com.woniuxy.day026;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CgLibTest {
    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(MyClass.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("--start--");
                Object r = methodProxy.invokeSuper(o, objects);
                System.out.println("---end---");
                return r;
            }
        });

        MyClass o =(MyClass) enhancer.create();
        o.test1();
        System.out.println(o.test2(1, 2));
    }
}
