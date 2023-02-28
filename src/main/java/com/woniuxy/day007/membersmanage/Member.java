package com.woniuxy.day007.membersmanage;

public class Member {
    private String name;
    private boolean isMale;

    public Member(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        String gender;
        if (isMale) gender = "男";
        else gender = "女";

        return "姓名：" + getName() + "\t 性别：" + gender;
    }
}
