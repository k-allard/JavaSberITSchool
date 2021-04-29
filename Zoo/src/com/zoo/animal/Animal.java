package com.zoo.animal;

import java.util.Objects;

public abstract class Animal implements Movable {

    protected String name;
    protected Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public abstract void say();

    public void play() {
        System.out.println(this.getName() + ": играет!");
    }

    public void play(String gameName) {
        System.out.println(this.getName() + ": *играет в " + gameName + "*");
    }

    public void eatTrees() {
        System.out.println(this.getName() + ": ест деревья...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(age, animal.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
