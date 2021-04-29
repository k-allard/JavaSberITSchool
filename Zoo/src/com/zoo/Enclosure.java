package com.zoo;
import com.zoo.animal.Animal;

import java.util.ArrayList;

public class Enclosure {

    private ArrayList<Animal> animalList;
    private String enclosureName;
    private Integer maxSize;
    private Zoo zoo;

    public Enclosure(String name) {
        this.animalList = new ArrayList<>();
        this.maxSize = 3;
        this.zoo = null;
        this.enclosureName = name;
    }

    public String getEnclosureName() {
        return enclosureName;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public void addAnimal(Animal newAnimal) throws IllegalArgumentException {
        if (checkIfExist(newAnimal) == true)
            throw new IllegalArgumentException("Такое животное в вольере уже есть");
        if (animalList.size() + 1 > maxSize)
            throw new IllegalArgumentException("Вольер полон!");
        if (zoo == null)
            throw new IllegalArgumentException("Несуществующий вольер");
        this.animalList.add(newAnimal);
        System.out.println(newAnimal.getName() + " добавлен в вольер " + enclosureName);
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
