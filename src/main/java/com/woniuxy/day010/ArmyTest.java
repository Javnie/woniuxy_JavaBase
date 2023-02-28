package com.woniuxy.day010;

/**
 * 4、写一个主方法去测试以上程序。
 */
public class ArmyTest {
    public static void main(String[] args) {
        Army army = new Army(3);

        try {
            army.addWeapon(new Tank());
            army.addWeapon(new Flighter());
            army.addWeapon(new WarShip());
        } catch (Exception e) {
            e.printStackTrace();
        }

        army.moveAll();
        System.out.println("----------");
        army.attackAll();
    }
}
