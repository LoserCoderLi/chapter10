package com.ljh.innerclass_;

public class InnerClass {
    public static void main(String[] args) {


    }
}

class Other{

    // 属性
    private int age;

    // 代码块
    {
        System.out.println("other class...");
    }

    // 构造器
    public Other(int age) {
        this.setAge(age);
    }

    // 方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 内部类
    class Inner{

    }


}
