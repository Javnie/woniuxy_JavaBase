package com.woniuxy.day018;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Company {
    private int id; //l公司编号
    private String name;//公司名
    private String boss;//公司老板
    private int year; //公司创立年份

    public Company(int id, String name, String boss, int year) {
        this.id = id;
        this.name = name;
        this.boss = boss;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", boss='" + boss + '\'' +
                ", year=" + year +
                '}';
    }
}

public class StreamDemo {
    public static void main(String[] args) {
        List<Company> list = new ArrayList<Company>();
        list.add(new Company(1, "阿里巴巴", "马云", 1999));
        list.add(new Company(2, "淘宝", "马云", 2003));
        list.add(new Company(3, "华为", "任正非", 1987));
        list.add(new Company(4, "小米", "雷军", 2010));
        list.add(new Company(5, "雷人科技", "邓强", 2018));
        list.add(new Company(6, "蜗牛学苑", "邓强", 2015));
        list.add(new Company(7, "腾讯", "马化腾", 1998));
        list.add(new Company(8, "百度", "李彦宏", 2000));
        //此处开始答题
        //1、找出马云创建的公司,并输出
        list.stream()
                .filter(company -> company.getBoss().equals("马云"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //2、邓强创建了几家公司?
        System.out.println("----------");
        long num = list.stream()
                .filter(company -> company.getBoss().equals("邓强"))
                .count();
//        System.out.println(num);
        //3、马云历次创建公司的最早年份
        System.out.println("----------");
        int year = list.stream()
                .filter(company -> company.getBoss().equals("马云"))
                .sorted(((o1, o2) -> o1.getYear() - o2.getYear()))
                .collect(Collectors.toList())
                .get(0)
                .getYear();
//        System.out.println(year);
        //4、给所有公司按创建年份降序输出
        System.out.println("----------");
        list.stream()
                .sorted((o1, o2) -> o2.getYear() - o1.getYear())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //5、把所有老板名字收集到一个集合中,且不可重复
        System.out.println("----------");
        List<String> names = list.stream()
                .map(company -> company.getBoss())
                .distinct()
                .collect(Collectors.toList());
//        names.forEach(System.out::println);
    }
}
