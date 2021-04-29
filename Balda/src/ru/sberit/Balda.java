package ru.sberit;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Balda {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        int pointsFirst = 0;
        int pointsSecond = 0;
        var sc = new Scanner(System.in);
        System.out.println("Введите исходное слово для начала игры: ");
        var initialWord = sc.nextLine();
        var letters = new HashSet<Character>();
        var wordsMade = new LinkedHashSet<String>();

        for (int i = 0; i < initialWord.length(); i++) {
            letters.add(initialWord.charAt(i));
        }
        System.out.println("По очереди вводите слова, которые можно составить из букв слова \"" + initialWord + "\"");
        System.out.println("Отправьте пустое слово, чтобы завершить игру");

        System.out.print("1: ");
        String wordAttempt = sc.nextLine();
        while (!wordAttempt.isEmpty() && !wordAttempt.isBlank()) {
            if (!ifWordAttemptOk(wordAttempt.toCharArray(), letters)) {
                System.out.println(ANSI_RED + "Слово \"" + wordAttempt + "\" не подходит!" + ANSI_RESET);
            }
            else if (wordsMade.contains(wordAttempt)) {
                System.out.println(ANSI_RED + "Слово \"" + wordAttempt + "\" уже было!" + ANSI_RESET);
            }
            else {
                System.out.println("Ок!");
                pointsFirst++;
                wordsMade.add(wordAttempt);
            }
            System.out.print("2: ");
            wordAttempt = sc.nextLine();
            if (!ifWordAttemptOk(wordAttempt.toCharArray(), letters)) {
                System.out.println(ANSI_RED + "Слово \"" + wordAttempt + "\" не подходит!" + ANSI_RESET);
            }
            else if (wordsMade.contains(wordAttempt)) {
                System.out.println("ANSI_RED + Слово \"" + wordAttempt + "\" уже было!" + ANSI_RESET);
            }
            else if (wordAttempt.isEmpty() || wordAttempt.isBlank()) {
                System.out.println("Победа игрока 1!");
                break;
            }
            else {
                System.out.println("Ок!");
                pointsSecond++;
                wordsMade.add(wordAttempt);
            }
            System.out.print("1: ");
            wordAttempt = sc.nextLine();
            if (wordAttempt.isEmpty() || wordAttempt.isBlank()) {
                System.out.println("Победа игрока 2!");
                break;
            }
        }
        System.out.println("Конец игры. Первый игрок составил " + pointsFirst + " слов(а)");
        System.out.println("Второй - " + pointsSecond + " слов(а). Слова: ");
        System.out.println(String.join(", ", wordsMade));
    }

    public static boolean ifWordAttemptOk (char[] lettersNew, HashSet<Character> letters) {
        for (var letter : lettersNew) {
            if (letters.contains(letter) == false)
                return false;
        }
        return true;
    }
}
