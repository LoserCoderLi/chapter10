package com.ljh.static_;

public class ChildGame {
    public static void main(String[] args) {

        // 问题 count是独立于Child的变量，不符合OOP
        int count = 0;
        Child child = new Child("xiaoming");
//        count++;
        child.count++;
        Child child1 = new Child("xiaozhou");
//        count++;
        child1.count++;
        Child child2 = new Child("xiaohei");
//        count += 1;
        child2.count++;

        System.out.println("参加游戏的人数为:" + child.count);

    }
}

class Child{
    private String name;
    // 定义一个变量 count 是一个类变量（静态变量） static修饰
    public static int count;

    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name + "加入了游戏...");
    }
}