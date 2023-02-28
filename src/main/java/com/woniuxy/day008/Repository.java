package com.woniuxy.day008;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * 声明类：仓库：Repository，其中属性：产品数组
 * 构造方法：两个，其中一个无参，存储产品种类默认10，另一个构造方法有一个参数，表示种类数
 * 盘点：打印出所有产品的信息
 * 入库：先去判断是否存在该产品，如果存在，直接更新数量，如果没有：仓库是否已满，如果慢了，没法入库，没有慢，新增产品
 * 出库：根据产品的名称及数量进行出库，查询产品是否存在，不存在没法出库，产品存在，判断库存是否足够，库存不够不允许出库，库存足够，直接减少该产品的数量
 * 查询：根据产品名查询所有的产品信息，支持模糊查找
 *
 * //   计算仓库中所有产品的总金额
 */
public class Repository {
    private static Product[] proArr;
    private static int actualLen;

    public static Product[] getProArr() {
        return proArr;
    }

    public static void setProArr(Product[] proArr) {
        Repository.proArr = proArr;
    }

    public static int getActualLen() {
        return actualLen;
    }

    public static void setActualLen(int actualLen) {
        Repository.actualLen = actualLen;
    }

    public Repository() {
        this(10);
    }

    public Repository(int capacity) {
        proArr = new Product[capacity];
    }

    void printPro() throws Exception {
        if (actualLen == 0) throw new Exception("the array's got no data");

        for (int i = 0; i < actualLen; i++) {
            System.out.println(proArr[i]);
        }
    }

    /**
     * @param product
     * @return the index of the input 'Product'. -1 when not found
     * @throws Exception 本方法没有对数组为空做判断
     */
    int traverse(Product product) throws Exception {
        if (product == null) throw new Exception("the input 'product' cannot be null");

        for (int i = 0; i < actualLen; i++) {
            if (proArr[i].getName().equals(product.getName())) return i;
        }
        return -1;
    }

    /**
     * @param name
     * @return the index of the input 'Product'. -1 when not found
     * @throws Exception
     */
    int traverse(String name) throws Exception {
        if (name == null) throw new Exception("the input 'name' cannot be null");
        if (actualLen == 0) throw new Exception("the array's got no data");

        for (int i = 0; i < actualLen; i++) {
            if (proArr[i].getName().equals(name)) return i;
        }
        return -1;
    }

    /**
     * @param no
     * @return the index of the input 'Product'. -1 when not found
     * @throws Exception
     */
    int traverse(int no) throws Exception {
        if (no < 0) throw new Exception("the input 'no' cannot be a negative number");
        if (actualLen == 0) throw new Exception("the array's got no data");

        for (int i = 0; i < actualLen; i++) {
            if (proArr[i].getNo() == no) return i;
        }
        return -1;
    }

    void importPro(Product product) throws Exception {
        int index = traverse(product);
        if (index != -1) proArr[index].setNum((proArr[index].getNum()) + product.getNum());
        else {
            if (actualLen == proArr.length) throw new Exception("the repository's full and thus importing failed!");
            else proArr[actualLen++] = product;
        }
    }

    boolean exportPro(String name, int num) throws Exception {
        if (num < 0) throw new Exception("the input 'num' cannot be a negative number");

        int index = traverse(name);
        if (index == -1) throw new Exception("the input 'name' does not exist");
        else {
            if (proArr[index].getNum() < num) throw new Exception("out of stock");
            else proArr[index].setNum(proArr[index].getNum() - num);
            return true;
        }
    }

    boolean exportPro(int no, int num) throws Exception {
        if (num < 0) throw new Exception("the input 'num' cannot be a negative number");

        int index = traverse(no);
        if (index == -1) throw new Exception("the input 'no' does not exist");
        else {
            if (proArr[index].getNum() < num) throw new Exception("out of stock");
            else proArr[index].setNum(proArr[index].getNum() - num);
            return true;
        }
    }

    ArrayList<Product> fuzzySearch(String name) throws Exception {
        if (name == null) throw new Exception("the input 'name' cannot be null");
        if (actualLen == 0) throw new Exception("the array's got no data");

        ArrayList<Product> result = new ArrayList<>();
        for (int i = 0; i < actualLen; i++) {
            if (proArr[i].getName().contains(name)) result.add(proArr[i]);
        }
        return result;
    }

    BigDecimal allPrice() {
        BigDecimal account = new BigDecimal("0");
        for (int i = 0; i < actualLen; i++) {
            account = account.add(new BigDecimal(proArr[i].getNum()).multiply(proArr[i].getPrice()));
        }
        return account;
    }
}