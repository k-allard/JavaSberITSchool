package com.zoo;
import com.zoo.animal.Animal;

import java.util.ArrayList;

public class Enclosure {
    private ArrayList<Animal> animalList;
    private Integer maxSize;
    private Zoo zoo;

    public Enclosure() {
        this.animalList = new ArrayList<>();
        this.maxSize = 3;
        this.zoo = null;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public void addAnimal(Animal newAnimal) {
        if (checkIfExist(newAnimal) == true)
            throw new IllegalArgumentException("Такое животное в вольере уже есть");
        if (animalList.size() + 1 > maxSize)
            throw new IllegalArgumentException("Вольер полон!");
        if (zoo == null)
            throw new IllegalArgumentException("Несуществующий вольер");
        this.animalList.add(newAnimal);
    }

    public void deleteAnimal(Animal animalToDelete) {
        this.animalList.remove(animalToDelete);
    }

    public void printAllAnimals() {
        for (Animal a : animalList) {
            a.say();
        }
    }

    public boolean checkIfExist(Animal animal) {
        return (animalList.contains(animal));
    }
}
