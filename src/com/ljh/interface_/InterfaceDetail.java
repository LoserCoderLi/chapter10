package com.ljh.interface_;

public class InterfaceDetail {
}

interface A{
    void say();
}

interface B{
    void say();
    void sayB();
}

class TestInterface implements A,B{

    @Override
    public void say() {

    }

    @Override
    public void sayB() {

    }
}
