package com.zoo.animal;

import com.zoo.exception.tooOldException;

public class Lemur extends Animal {

    public Lemur() {
        super(null, null);
    }

    public Lemur(String name, Integer age) {
        super(name, age);
        if (age <= 0 || age > 100)
            throw new IllegalArgumentException("Возраст должен быть положительным и не больше 100");
        System.out.println("Лемур " + name + ", " + age + " создан");
    }

    @Override
    public void say() {
        System.out.println(this.getName() + ": Вискаса мне! И авокадо");
    }

    @Override
    public void move(float meters) throws tooOldException {
        if (age > 15 && meters > 100) {
            throw new tooOldException("Лемур " + name + " слишком стар чтобы туда идти");
        } else {
            System.out.println(this.getName() + ": Прыг-скок по ветке на " + meters + " метров");
        }
    }

    @Override
    public void move() throws tooOldException {
        if (age > 20) {
            throw new tooOldException("Лемур " + name + " слишком стар чтобы туда идти");
        } else {
            System.out.println(this.getName() + ": Прыг-скок по ветке");
        }
    }

    public void collectAvocados () {
        System.out.println(this.getName() + ": *собирает авокадо*");
    }

    public void raiseTail () {
        System.out.println(this.getName() + ": *поднял хвост трубой*");
    }
}
