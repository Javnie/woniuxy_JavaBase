package com.woniuxy.day008;

import java.util.Scanner;

public class StudentDAOTest {
    static StudentDAO studentDAO = new StudentDAO();
    static Scanner scanner = new Scanner(System.in);
    Student student;

    static void testAdd() {
        String s;
        do {
            Student student = new Student();
            System.out.print("姓名：");
            student.setName(scanner.next());
            System.out.print("年龄：");
            student.setAge(scanner.nextInt());
            System.out.print("性别：");
            student.setGender(scanner.next().charAt(0));
            student.setStudying(scanner.nextBoolean());
            studentDAO.add(student);
            System.out.print("是否继续增加？（y/n）");
            s = scanner.next();
        } while (s.equals("y"));
    }

    public static void main(String[] args) {
        boolean isRunning = true;
        System.out.println("欢迎使用蜗牛后台管理系统");
        while (isRunning) {
            System.out.println();
            System.out.println("请选择菜单");
            System.out.println("1：查询所有的员工");
            System.out.println("2：增加新员工");
            System.out.println("3：修改新员工");
            System.out.println("4：删除新员工");
            System.out.println("5：指定位置新增员工");
            System.out.println("6：输出在读学员数量");
            System.out.println("7：输出男女学员差值");
            System.out.println("-1：退出系统");
            int opr = scanner.nextInt();
            switch (opr) {
                case 1:
                    studentDAO.printStudents();
                    break;
                case 2:
                    testAdd();
                    break;
                case 3:
                    break;
                case 5:
                    testAddWithIndex();
                    break;
                case 6:
                    System.out.println("目前在读学员人数为：" + studentDAO.numOfStudying() + "人");
                    break;
                case 7:
                    System.out.println("男女学员人数差值为：" + studentDAO.dvOfGender() + "人");
                    break;
                case -1:
                    isRunning = false;
            }
        }
    }

    private static void testAddWithIndex() {
        String s;
        do {
            Student student = new Student();
            System.out.print("请输入增加的位置（从0开始）");
            int index = scanner.nextInt();
            System.out.print("姓名：");
            student.setName(scanner.next());
            System.out.print("年龄：");
            student.setAge(scanner.nextInt());
            System.out.print("性别：");
            student.setGender(scanner.next().charAt(0));
            System.out.print("是否在读：");
            student.setStudying(scanner.nextBoolean());
            studentDAO.add(index, student);
            System.out.print("是否继续增加？（y/n）");
            s = scanner.next();
        } while (s.equals("y"));
    }
}
