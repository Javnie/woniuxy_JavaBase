package com.woniuxy.day009;

import java.util.ArrayList;
import java.util.List;

public class EggSwitch {
    public static void main(String[] args) {
        Basket b1 = new Basket(new ChickenEgg());
        Basket b2 = new Basket(new DuckEgg());

        System.out.println("交换之前的情况：");
        System.out.print("BASKET 1:\t");
        System.out.println(b1.getEgg());
        System.out.print("BASKET 2:\t");
        System.out.println(b2.getEgg());

        Egg temp = b1.getEgg();
        b1.setEgg(b2.getEgg());
        b2.setEgg(temp);

        System.out.println("交换之后的情况：");
        System.out.print("BASKET 1:\t");
        System.out.println(b1.getEgg());
        System.out.print("BASKET 2:\t");
        System.out.println(b2.getEgg());
    }
}

class Basket {
    private Egg egg;

    public Basket(Egg egg) {
        this.egg = egg;
    }

    public Egg getEgg() {
        return egg;
    }

    public void setEgg(Egg egg) {
        this.egg = egg;
    }
}

class Egg {
    public Egg() {
    }
}

class ChickenEgg extends Egg {
    public ChickenEgg() {
    }

    //@Override
    public String toString() {
        return "chicken's egg";
    }
}

class DuckEgg extends Egg {
    public DuckEgg() {
    }

    //@Override
    public String toString() {
        return "duck's egg";
    }
}