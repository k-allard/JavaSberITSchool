package ru.sberit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your arithmetic expression:");
        Scanner sc = new Scanner(System.in);
        int firstArg = sc.nextInt();
        char operation = sc.next().charAt(0);
        int secondArg = sc.nextInt();

        if (operation == '+')
            System.out.println(firstArg + secondArg);
        else if (operation == '-')
            System.out.println(firstArg - secondArg);
        else if (operation == '*')
            System.out.println(firstArg * secondArg);
        else if (operation == '/')
            System.out.println(firstArg / secondArg);
        else
            System.out.println("Error\nOnly [+, -, *, /] operations are possible");
    }
}