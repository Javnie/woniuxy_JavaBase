package com.woniuxy.day008;

import java.math.BigDecimal;
import java.util.Scanner;

public class RepositoryTest {
    static Scanner scanner = new Scanner(System.in);
    //测试时自定义capacity
    static Repository repository = new Repository(2);

    public static void main(String[] args) {
        boolean isRunning = true;

        System.out.println("  欢迎使用蜗牛仓库管理系统  ");
        while (isRunning) {
            System.out.println("------请选择功能菜单------");
            System.out.println("--按【1】键  打印所有产品--");
            System.out.println("--按【2】键  产品入库操作--");
            System.out.println("--按【3】键  产品出库操作--");
            System.out.println("--按【4】键  查询指定产品--");
            System.out.println("--按【0】键  退出管理系统--");
            System.out.println("------------------------");

            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    try {
                        repository.printPro();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        repository.importPro(input());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    //使用产品编号进行出库操作
                    System.out.println("请输入产品编号：");
                    int no = scanner.nextInt();
                    System.out.println("请输入产品数量：");
                    int num = scanner.nextInt();
                    try {
                        if (repository.exportPro(no, num)) System.out.println("已成功取出");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //使用产品名称进行出库操作
                    System.out.println("请输入产品名称：");
                    String name = scanner.next();
                    System.out.println("请输入产品数量：");
                    num = scanner.nextInt();
                    try {
                        if (repository.exportPro(name, num)) System.out.println("已成功取出");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("请输入产品名称：");
                    name = scanner.next();
                    try {
                        if (repository.fuzzySearch(name).size() != 0) {
                            System.out.println("您所查询到的相关产品信息如下");
                            for (Product temp : repository.fuzzySearch(name)) {
                                System.out.println(temp);
                            }
                        } else System.out.println("抱歉，尚未找到相关产品");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    isRunning = false;
            }
        }
    }

    static Product input() {
        Product product = new Product();
        System.out.println("请输入产品编号：");
        product.setNo(scanner.nextInt());
        System.out.println("请输入产品名称：");
        product.setName(scanner.next());
        System.out.println("请输入产品数量：");
        product.setNum(scanner.nextInt());
        System.out.println("请输入产品价格：");
        product.setPrice(new BigDecimal(scanner.next()));
        return product;
    }
}