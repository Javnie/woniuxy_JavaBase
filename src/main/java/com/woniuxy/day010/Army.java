package com.woniuxy.day010;

/**
 * 2、写一个类Army,代表一支军队:
 * 这个类有一个属性是Weapon数组w（用来存储该军队所拥有的所有武器）；
 * 该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量,并用这一大小来初始化数组w。
 * 该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。
 * 在这个类中还定义两个方法attackAll()和moveAll()，让w数组中的所有武器攻击和移动。
 */
public class Army {
    private Weapon[] w;
    private int actualLen;

    public Army(int num) {
        w = new Weapon[num];
    }

    void addWeapon(Weapon wa) throws Exception {
        //首先需要判断数组是否已经满了
        if (isFull()) throw new Exception("the array's full");
            //然后再加入wa
        else w[actualLen++] = wa;
    }

    void attackAll() {
        for (int i = 0; i < actualLen; i++) {
            w[i].attack();
        }
    }

    void moveAll() {
        for (int i = 0; i < actualLen; i++) {
            w[i].move();
        }
    }

    boolean isFull() {
        return actualLen == w.length;
    }
}
