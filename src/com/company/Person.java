package com.company;

/**
 * Created by Ulysses on 22.08.2016.
 */
public class Person {
    private String name;
    private String lName;
    private int age;

    public Person(String name, String lName, int age) {
        this.name = name;
        this.lName = lName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }
}
