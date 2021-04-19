package ru.sberit;

import java.util.Scanner;
//import java.lang.String;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter HEIGHT and WIDTH of a frame and a WORD to be placed in it:");

        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        String word = sc.next();
        if ((word.length() > width - 2) || height < 3) {
            System.out.println("Error");
            return;
        }
//верхняя граница
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

//пустые ряды над словом
        for (int i = 0; i < (height - 3) / 2; i++) {
            System.out.print('*');
            for (int j = 0; j < width - 2; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            System.out.print("\n");
        }

//ряд co словом
        System.out.print('*');
        int aroundWordSpaces = width - 2 - word.length();
        for (int i = 0; i < aroundWordSpaces / 2; i++) {
            System.out.print(' ');
        }
        System.out.print(word);
        for (int i = 0; i < aroundWordSpaces / 2; i++) {
            System.out.print(' ');
        }
        if (aroundWordSpaces % 2 != 0)
            System.out.print(' ');
        System.out.println("*");

//пустые ряды под словом
        for (int i = 0; i < (height - 3) / 2; i++) {
            System.out.print('*');
            for (int j = 0; j < width - 2; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            System.out.print("\n");
        }
        if (height % 2 == 0) {
            System.out.print('*');
            for (int j = 0; j < width - 2; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            System.out.print("\n");
        }

//нижняя граница
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
    }
}
