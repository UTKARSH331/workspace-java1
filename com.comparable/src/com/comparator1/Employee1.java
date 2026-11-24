package com.comparator1;
public class Employee1 {

    int id;
    String name;
    int age;
    double salary;
    String department;

    public Employee1(int id, String name, int age,
                    double salary, String department) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}