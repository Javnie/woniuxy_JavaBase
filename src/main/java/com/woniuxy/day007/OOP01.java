package com.woniuxy.day007;

/**
 * Oriented-Object Programming
 *
 * 声明一个代表电脑的类，并实例化
 */
public class OOP01 {
    public static void main(String[] args) {
        Computer c1 = new Computer("DELL", "G3", 7000);
        Computer c2 = new Computer("APPLE", "MacBook Air 2020", 6000);

        System.out.println(c1);
        System.out.println(c2);
    }
}

class Computer {
    private String brand;
    private String model;
    int price;

    public Computer(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "this is a computer of " + brand + "'s " + model + " with a price at " + price;
    }
}
