package ru.sberit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter your string of ints: ");
        Scanner sc = new Scanner(System.in);
        String stringOfInts = sc.next();
        System.out.print("Enter position: ");
        int position = sc.nextInt();

        try {
            char foundInt = stringOfInts.charAt(position);
            System.out.println("Number at position [" + position + "] is " + foundInt);
        }
        catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.println("Error\nNumber at position [" + position + "] does not exist");
        }
    }
}