package org.codewithease.javatopics.commons;

public class Employee {
    private int age;
    private int id;
    private int salary;
    private String name;

    public Employee(int id,  String name,  int age,  int salary) {
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
