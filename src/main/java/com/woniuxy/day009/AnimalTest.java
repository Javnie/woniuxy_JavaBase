package com.woniuxy.day009;

import java.util.ArrayList;

/**
 * 设计Animal类，Dog类，.....,其中Animal有一个方法eat(),子类重写eat()，重写equals，类型一样
 * 测试代码，声明一个Animal数组，存储若干动物，不能加重复的，遍历所有的元素，访问其eat
 */
public class AnimalTest {
    static ArrayList<Animal> arr = new ArrayList<>();

    public static void main(String[] args) {
        Animal a1 = new Cat();
        //重复新建Cat
        Animal a2 = new Cat();
        Animal a3 = new Dog();
        Animal a4 = new Cow();
        Animal a5 = new Chicken();

        addInto(a1);
        addInto(a2);
        addInto(a3);
        addInto(a4);
        addInto(a5);

        for (Animal temp : arr) {
            temp.eat();
        }
    }

    static void addInto(Animal animal) {
        boolean flag = true;
        for (Animal temp : arr) {
            if (animal.equals(temp)) {
                flag = false;
                break;
            }
        }
        if (flag) arr.add(animal);
    }
}

abstract class Animal {
    public abstract void eat();

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == this.getClass();
    }

//    @Override
//    public boolean equals(Object obj) {
//      return obj.getClass() == Animal.class;
//    }

//    @Override
//    public boolean equals(Object obj) {
//      obj instanceof Animal;
//    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats meat.");
    }
}

class Cow extends Animal {
    @Override
    public void eat() {
        System.out.println("Cow eats grass.");
    }
}

class Chicken extends Animal {
    @Override
    public void eat() {
        System.out.println("Chicken eats bugs.");
    }
}