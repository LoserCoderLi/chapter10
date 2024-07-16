package com.ljh.innerclass_;

public class LocalInnerClass {
}

class Other02{
    private int n1 = 100;

    private void m2(){}

    public void m1(){// 方法

        // 局部内部类 是定义在外部类的局部位置，通常是在方法内
        class Inner02{// 局部内部类
            // 可以直接访问外部类的所有成员、包含私有的
            public void f1(){
                System.out.println("n1=" + n1);
                m2();
            }
        }

        class Inner03 extends Inner02{

        }

        // 外部类 在方法中 想要调用 内部类 需要先创建对象 才能再调用
        Inner02 inner02 = new Inner02();
        inner02.f1();

    }

    public void m3(){
        m1();
    }

}