package com.woniuxy.day007;

/**
 * 创建一个User数组，为其中的元素赋值，然后遍历输出
 */
public class OOP02 {
    public static void main(String[] args) {
        User[] users1 = new User[3];

        users1[0] = new User("小明", 18, "男");
        users1[1] = new User("小红", 20, "男");
        users1[2] = new User("小兰", 21, "女");
        for (User temp : users1) {
            System.out.println(temp);
        }

        System.out.println("--------------------");
        User[] users2 = new User[]{new User("小明", 18, "男"), new User("小红", 20, "男"), new User("小兰", 21, "女")};
        for (User temp : users2) {
            System.out.println(temp);
        }
    }
}

class User {
    private String name;
    private int age;
    private String gender;

    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "性别：" + gender + "\t年龄：" + age + "\t姓名：" + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
