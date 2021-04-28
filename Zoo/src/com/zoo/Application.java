package com.zoo;

import com.zoo.animal.Cat;
import com.zoo.animal.Lemur;
import com.zoo.exception.tooOldException;

public class Application {

    public static void main(String[] args) throws tooOldException {
        try {
            var cat = new Cat("Мурка", 10, "розовый");
            cat.setName("Гав");
            System.out.println(cat.getName());
            System.out.println(cat.getColor());
            cat.say();
            cat.catchMice();
            cat.pet();
            try {
                cat.move(); }
            catch (tooOldException e) {
                System.out.println(e.getMessage());
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        var lemur = new Lemur("Manya", 16);

        lemur.raiseTail();
        lemur.collectAvocados();
        try {
            lemur.move(125); }
        catch (tooOldException e) {
            System.out.println(e.getMessage());
        }
        lemur.play("прятки");
        var enclosure = new Enclosure();

    }
}


