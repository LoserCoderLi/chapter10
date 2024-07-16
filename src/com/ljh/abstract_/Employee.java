package com.ljh.abstract_;

public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public abstract void work();

    public Employee(String name, int id, double salary) {
        this.setName(name);
        this.setId(id);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
