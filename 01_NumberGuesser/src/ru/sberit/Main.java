package ru.sberit;

/*
 * Задача 1
 * Сгенерировано случайное целочисленное число (любой диапазон).
 * Необходимо написать программу, считывающую вводимое пользователем значение до тех пор,
 *   пока значение передаваемое в программу не совпадет со случайным значением.
 * Если введенное число больше или меньше случайного, программа дает подсказку (больше/меньше).
 * Комментарий: для генерации случайного числа можно использовать класс Random;
 */

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        long inputNum;
        int correctNum = rnd.nextInt(255);
        System.out.println("Can you guess what number i am thinking of?\n");
        int numOfAttempts = 1;
        inputNum = sc.nextLong();
        while (inputNum != correctNum) {
            if (inputNum < correctNum)
                System.out.println("NO\nMy number is greater than yours");
            else
                System.out.println("NO\nMy number is less than yours");
            System.out.println("Try again!\n");
            numOfAttempts++;
            inputNum = sc.nextLong();
        }
        System.out.println("YES\nOn the " + numOfAttempts + "-th try you guessed it!");
    }
}
