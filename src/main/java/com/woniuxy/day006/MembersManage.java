package com.woniuxy.day006;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 员工管理系统
 *
 * 实现功能：
 * 1.添加员工数据
 * 2.查找员工数据
 * 3.删除员工数据
 * 4.遍历员工数据
 * 0.退出系统
 */
public class MembersManage {
    //初始化数组
    static int arrLen = 10;
    static int actualLen = 0;
    static String[] memArr = new String[arrLen];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("  欢迎使用蜗牛后台管理系统  ");
        while (isRunning) {
            System.out.println("------请选择功能菜单------");
            System.out.println("--按【1】键  添加员工数据--");
            System.out.println("--按【2】键  查找员工数据--");
            System.out.println("--按【3】键  删除员工数据--");
            System.out.println("--按【4】键  遍历员工数据--");
            System.out.println("--按【0】键  退出员工系统--");
            System.out.println("------------------------");

            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    add();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    list();
                    break;
                case 0:
                    isRunning = false;
            }
        }
    }

    static void add() {
        System.out.println("请输入要添加的员工姓名：");
//        String name = scanner.nextLine();
        String name = scanner.next();

        if (actualLen == arrLen) {
            arrLen = arrLen * 2;
            memArr = Arrays.copyOf(memArr, arrLen);
        }

        memArr[actualLen++] = name;
        System.out.println("员工姓名：" + name + " 添加成功");
    }


    static void search() {
        System.out.println("请输入要查找的员工姓名：");
        String name = scanner.next();

        boolean flag = false;
        for (int i = 0; i < actualLen; i++) {
            if (memArr[i].equals(name)) {
                System.out.println("找到该员工，其编号为：" + (i + 1));
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("未找到该员工");
        }
    }

    static void delete() {
        System.out.println("请输入要删除的员工姓名：");
        String name = scanner.next();

        int index = -1;
        for (int i = 0; i < actualLen; i++) {
            if (memArr[i].equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("未找到该员工");
        } else {
            for (int i = index; i < actualLen - 1; i++) {
                memArr[i] = memArr[i + 1];
            }
            actualLen--;
            System.out.println("删除成功");
        }
    }

    static void list() {
        System.out.println("员工姓名列表：");
        for (int i = 0; i < actualLen; i++) {
            System.out.println((i + 1) + "." + memArr[i]);
        }
    }
}
