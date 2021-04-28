package com.zoo.animal;

import com.zoo.exception.tooOldException;

public class Lemur extends Animal {

    public Lemur() {
        super("Лемурка", 5);
    }

    public Lemur(String name, Integer age) {
        super(name, age);
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
