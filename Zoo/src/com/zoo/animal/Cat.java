package com.zoo.animal;

import com.zoo.exception.tooOldException;

public class Cat extends Animal {

    private String color;

    public Cat() {
        super(null, null);
    }

    public Cat(String name, Integer age, String color) throws IllegalArgumentException {
        super(name, age);
        if (age <= 0 || age > 100)
            throw new IllegalArgumentException("Возраст должен быть положительным и не больше 100");
        this.setColor(color);
        System.out.println("Кошка " + name + ", " + age + " создана");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat getInstance() {
        return this;
    }

    @Override
    public void say() {
        System.out.println(this.getName() + ": Мяяяяу");
    }

    @Override
    public void move(float meters) throws tooOldException {
        if (age > 10 && meters > 100) {
            throw new tooOldException("Киса " + name + " слишком стара чтобы туда идти");
        } else {
            System.out.println(this.getName() + ": Прыг-скок по шторе на " + meters + " метров");
        }
    }

    @Override
    public void move() throws tooOldException {
        if (age > 15) {
            throw new tooOldException("Киса " + name + " слишком стара чтобы туда идти");
        } else {
            System.out.println(this.getName() + ": Прыг-скок по шторе");
        }
    }

    public void catchMice () {
        System.out.println(this.getName() + ": *ловит мышей*");
    }

    public void pet () {
        System.out.println(this.getName() + ": Муууурррр *ласкается*");
    }
}
