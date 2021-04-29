package com.zoo;

import com.zoo.animal.Cat;
import com.zoo.animal.Lemur;
import com.zoo.exception.tooOldException;

public class Application {

    public static void main(String[] args) throws tooOldException {
        var zoo = new Zoo();
        var enclosureLemurs = new Enclosure("Лемуры");
        zoo.addEnclosure(enclosureLemurs);

        try {
            var lemur = new Lemur("Лемурка", 16);

            try {
                enclosureLemurs.addAnimal(lemur);
                enclosureLemurs.addAnimal(lemur);
            } catch (IllegalArgumentException e) {
                System.err.println("Ошибка при наполнении вальера лемурами: " + e.getMessage());
            }

            lemur.raiseTail();
            lemur.collectAvocados();
            try {
                lemur.move(125); }
            catch (tooOldException e) {
                System.err.println(e.getMessage());
            }
            lemur.play("прятки");
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }


        var enclosureCats = new Enclosure("Кошачьи");
        zoo.addEnclosure(enclosureCats);

        try {
            var cat = new Cat("Мурка", 10, "розовый");
            cat.say();
            cat.catchMice();
            cat.pet();
            try {
                cat.move(); }
            catch (tooOldException e) {
                System.err.println(e.getMessage());
            }
            enclosureCats.addAnimal(cat);
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            var catMatilda = new Cat("Матильда", 4, "белый");
            try { enclosureCats.addAnimal(catMatilda); }
            catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
            var catIzolda = new Cat("Изольда", 11, "серый");
            try { enclosureCats.addAnimal(catIzolda); }
            catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
            var catZarapka = new Cat("Царапка", 5, "черный");
            try { enclosureCats.addAnimal(catZarapka); }
            catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        var enclosureThree = new Enclosure("Совы");
        try { zoo.addEnclosure(enclosureThree); }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }


    }
}


