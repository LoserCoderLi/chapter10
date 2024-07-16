package com.ljh.final_;

public class FinalExercixe01 {
}

class Circle{
    private double radius;
//    // 一开始初始化
//    private final double PI = 3.14;

//    //代码块初始化
//    private final double PI;
//    {
//        PI = 3.14;
//    }
    // 构造函数初始化
        private final double PI;
    public Circle(double radius) {
        PI = 3.14;

        this.setRadius(radius);
    }

    public double getS(){
        return radius * radius * PI;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
