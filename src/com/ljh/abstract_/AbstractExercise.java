package com.ljh.abstract_;

public class AbstractExercise {

}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.setBonus(bonus);
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "正在工作。。。");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}


class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("员工" + getName() + "正在工作。。。");
    }
}
