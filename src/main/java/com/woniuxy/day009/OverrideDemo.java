package com.woniuxy.day009;

public class OverrideDemo {
}

class Member {
    private int no;
    private String name;

    public Member(int no, String name) {
        this.no = no;
        this.name = name;
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

    //@Override
    public String toString() {
        return "该成员的信息为：" + getName() + getNo();
    }

//    @Override //Override by oneself
//    public boolean equals(Object obj) {
//        //首先进行自我判断
//        if(this==obj)
//            return true;
//        //然后进行类型判断
//        if(obj instanceof Member){
//            //向下转型后，再进行具体数据判断
//            Member m=(Member) obj;
//            return m.getNo()==this.getNo()&&m.getName().equals(this.getName());
//        }else return false;
//    }

    //@Override //checked at the last option --> 数据为空也满足判断
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return no == member.no && name.equals(member.name); //String的equals()
    }

//    @Override //unchecked at the last option
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Member member = (Member) o;
//        return no == member.no && Objects.equals(name, member.name); //Object的equals()
//    }
}