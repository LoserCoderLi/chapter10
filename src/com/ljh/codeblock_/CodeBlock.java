package com.ljh.codeblock_;

public class CodeBlock {
    public static void main(String[] args) {
        Move move = new Move("nihaolihuanying");
        Move move1 = new Move("tangrenjietanan", 25);
    }
}

class Move{
    private String name;
    private double price;
    private String director;

    // 下面三个构造器里面有重复的部分，冗余
    // 引入代码块
    // 在调用构造器的时候，会先执行代码块的内容

    {
        System.out.println("电影屏幕打开了。。。");
        System.out.println("广告开始了。。。");
        System.out.println("电影正式开始了。。。");
    }
    public final void say(){

    }

    public final void say(int a){

    }


    public Move(String name) {
        System.out.println("public Move(String name) 被调用了");

        this.name = name;
    }

    public Move(String name, double price) {
        System.out.println("public Move(String name, double price) 被调用了");

        this.name = name;
        this.price = price;
    }

    public Move(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}