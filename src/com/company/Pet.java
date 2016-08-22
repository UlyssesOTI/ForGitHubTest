package com.company;

/**
 * Created by Ulysses on 22.08.2016.
 */
public class Pet {
    private String name;
    private String lName;

    public Pet(String name, String lName) {
        this.name = name;
        this.lName = lName;
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

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
