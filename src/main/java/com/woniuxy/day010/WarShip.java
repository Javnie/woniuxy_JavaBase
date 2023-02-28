package com.woniuxy.day010;

/**
 * 3、定义3个类：Tank,Flighter,WarShip都继承自Weapon,分别用不同的方式实现Weapon类中的抽象方法。
 */
public class WarShip extends Weapon {
    @Override
    void attack() {
        System.out.println("the 'WarShip' now sea-shooting for attack");
    }

    @Override
    void move() {
        System.out.println("the 'WarShip' now moving");
    }
}
