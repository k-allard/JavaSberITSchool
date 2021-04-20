package com.zoo;

public class Cat extends Animal {

    private String color;

    public Cat() {
        super(null, null);
    }

    public Cat(String name, Integer age, String color) {
        super(name, age);
        this.color = color;
    }

    public Cat getInstance() {
        return this;
    }

    public void say() {
        System.out.println("Мяу");
    }
}