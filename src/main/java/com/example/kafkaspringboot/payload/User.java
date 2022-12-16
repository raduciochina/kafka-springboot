package com.example.kafkaspringboot.payload;

public class User {
    private int id;
    private String name;
    private String dept;
    private Long salary;

    public User() {
    }

    public User(int id, String name, String dept, Long salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}

