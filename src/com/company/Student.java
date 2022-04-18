package com.company;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() throws MyException {
        if(age<0){
            throw new MyException();
        }
        return age;
    }

    public void setAge(int age) throws MyException {
        if(age<0){
            throw new MyException();
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
