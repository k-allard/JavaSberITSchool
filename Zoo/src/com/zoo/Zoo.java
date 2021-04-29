package com.zoo;
import com.zoo.animal.Animal;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Enclosure> enclosureList;
    private Integer maxSize;

    public Zoo() {
        this.enclosureList = new ArrayList<>();
        this.maxSize = 2;
    }

    public void addEnclosure(Enclosure newEnclosure) throws IllegalArgumentException {
        if (enclosureList.size() + 1 > maxSize)
            throw new IllegalArgumentException("Вольеров слишком много!");
        this.enclosureList.add(newEnclosure);
        newEnclosure.setZoo(this);
        System.out.println("Вольер " + newEnclosure.getEnclosureName() + " добавлен в зоопарк");
    }

    public void deleteEnclosure(Enclosure enclosureToDelete) {
        this.enclosureList.remove(enclosureToDelete);
    }

    public void printAllEnclosures() {
        for (Enclosure en : enclosureList) {
            en.printAllAnimals();
        }
    }
}
