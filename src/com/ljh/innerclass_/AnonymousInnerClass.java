package com.ljh.innerclass_;

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Outer04 outer04 = new Outer04();
        outer04.method();

    }
}

class Outer04{// 外部类
    private int n1 = 10;// 属性
    public void method(){// 方法
        //基于接口的匿名内部类
        //1. 需求：想要使用IA接口，并创建对象
        //2. 传统实现：先写一个Tiger/Dog/Cat/Fish类，然后实现接口，然后创建这个类的对象
//        Tiger tiger = new Tiger();
//        tiger.cry();

        //3. 但是我只是使用一次，以后不会在使用，但是直接定义一个又一个的类比较浪费，也很繁琐
        //4. 可以使用匿名内部类来简化开发
        //5. tiger的编译类型？IA
        //6. tiger的运行类型？就是匿名内部类 XXX是和外部类的名称有关：XXX = Outer04$1
        /*
            在底层代码中的样子实际上是：
            class XXX implements IA{
                @Override
                public void cry() {
                    System.out.println("匿名内部类：老虎嗷嗷叫。。。");
                }
            }
         */
        //7. jdk底层在创建匿名内部类 Outer04$1 后，立刻马上就创建了 Outer04$1实例，
        //   并把地址返回给 tiger
        //8. 匿名内部类使用一次，就不能才使用了，但是！对象是可以继续被使用的。
        System.out.println("基于接口的匿名内部类:");
        IA tiger = new IA(){ // 匿名内部类！！！！！！
            @Override
            public void cry() {
                System.out.println("匿名内部类：老虎嗷嗷叫。。。");
            }
        };
        System.out.println("tiger的运行类型为:" + tiger.getClass());
        tiger.cry();

        IA cat = new IA(){ // 匿名内部类！！！！！！
            @Override
            public void cry() {
                System.out.println("匿名内部类：小猫喵喵叫。。。");
            }
        };
        System.out.println("cat的运行类型为:" + cat.getClass());
        cat.cry();

        System.out.println("");

        System.out.println("基于类的匿名内部类:");
        // 再写一个基于类的匿名内部类，上一个是基于接口的匿名内部类
        // 注意不能重写构造器
        Father father = new Father("lihua"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test类的内容");
            }
        };// 注意它后面有关大括号！！！

        // 我们输出一下这个father的运行类型
        // 理应为：Outer04$3
        // 是接着上一个基于接口实现的匿名内部类命名Outer$2的基础上，
        // 定义为Outer04$3
        System.out.println("father的运行类型为:" + father.getClass());// Outer04$2
        System.out.println("爸爸的名称:" + father.getName());
        father.test();

        // 如果没有大括号{} 运行类型应该是Father
        Father father1 = new Father("lihua");
        System.out.println("father1的运行类型为:" + father1.getClass());
        System.out.println("爸爸的名称:" + father.getName());
        father1.test();

        System.out.println("");

        System.out.println("基于抽象类的匿名内部类:");
        // 再写一个基于抽象类的匿名内部类
        Animal dog = new Animal() {
            @Override
            public void eat() {
                System.out.println("小狗爱吃肉骨头");
            }
        };
        dog.eat();
        System.out.println("dog的运行类型为:" + dog.getClass());

    }
}

// 传统方法
class Tiger implements IA{
    @Override
    public void cry() {
        System.out.println("传统方法：老虎嗷嗷叫。。。");
    }
}

interface IA{// 接口
    void cry();
}

class Father{// 类
    private String name;// 属性

    public String getName() {
        return name;
    }

    public Father(String name) {// 构造器
        this.name = name;
    }

    public void test(){// 方法
        System.out.println("原方法test()内容");
    }
}

abstract class Animal{// 抽象类
    abstract public void eat();
}