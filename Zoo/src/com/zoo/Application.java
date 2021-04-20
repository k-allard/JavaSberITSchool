package com.zoo;

public class Application {

    public static void main(String[] args) {
        var cat = new Cat();
        cat.setName("Гав");
        System.out.println(cat.getName());
        cat.say();
    }
}


