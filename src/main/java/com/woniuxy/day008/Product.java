package com.woniuxy.day008;

import java.math.BigDecimal;

/**
 * 1，声明类：产品  Product，其中属性：产品编号，产品名称，商品数量，价格
 */
public class Product {
    private int no;
    private String name;
    private int num;
    private BigDecimal price;

    public Product() {
    }

    public Product(int no, String name, int num, BigDecimal price) {
        this.no = no;
        this.name = name;
        this.num = num;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "产品编号：" + getNo() + "  产品名称：" + getName() + "  产品数量：" + getNum() + "  产品价格：" + getPrice();
    }
}
