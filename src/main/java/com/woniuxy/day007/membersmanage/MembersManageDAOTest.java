package com.woniuxy.day007.membersmanage;

import com.woniuxy.day008.Repository;

import java.util.Scanner;

/**
 * 尝试利用DAO对数据进行管理--> 3 Class
 */
public class MembersManageDAOTest {
    static Scanner scanner = new Scanner(System.in);
    static MemberManageDAO mmDAO = new MemberManageDAO();

    public static void main(String[] args) {
        boolean isRunning = true;

        System.out.println("  欢迎使用蜗牛后台管理系统  ");
        while (isRunning) {
            System.out.println("------请选择功能菜单------");
            System.out.println("--按【1】键  添加员工数据--");
            System.out.println("--按【2】键  添加指定数据--");
            System.out.println("--按【3】键  查找员工数据--");
            System.out.println("--按【4】键  删除员工数据--");
            System.out.println("--按【5】键  遍历员工数据--");
            System.out.println("--按【0】键  退出员工系统--");
            System.out.println("------------------------");

            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    //新增2个成员并启用键盘输入1个新成员
                    Member m1 = new Member("小明", true);
                    Member m2 = new Member("小红", false);
                    try {
                        mmDAO.add(m1);
                        mmDAO.add(m2);
                        mmDAO.add(inputBySC());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    //新增成员到指定索引位置
                    try {
                        mmDAO.add(new Member("小丽", false), 0);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    //查找“小亮”
                    try {
                        int index = mmDAO.search("小亮");
                        if (index == -1)
                            System.out.println("没有找到该员工");
                        else
                            System.out.println("该员工编号为：" + index + 1 + "号");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    //删除“小黑”
                    try {
                        if (mmDAO.delete("小黑"))
                            System.out.println("已成功删除该员工");
                        else
                            System.out.println("没有找到该员工，无法删除");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    //遍历数据
                    try {
                        mmDAO.list();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    isRunning = false;
            }
        }
    }

    static Member inputBySC() {
        System.out.println("请输入员工姓名：");
        String name = scanner.next();
        System.out.println("该员工性别为：男性（M）\t女性（F）");
        boolean isMale = scanner.next().equalsIgnoreCase("M");

        return new Member(name, isMale);
    }
}

