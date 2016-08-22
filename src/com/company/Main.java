package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<Person,Pet> club = new HashMap<>();
    public static void main(String[] args) {
        Person persion = new Person("Petro","Popov",21);
        Pet pet = new Pet("Petty","Cat");
	    club.put(persion,pet);
        System.out.println(club);
    }
}
