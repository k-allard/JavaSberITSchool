package ru.sberit;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Balda {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Введите исходное слово для начала игры: ");
        var initialWord = sc.nextLine();
        var letters = new HashSet<Character>();
        var wordsMade = new LinkedHashSet<String>();

        for (int i = 0; i < initialWord.length(); i++) {
            letters.add(initialWord.charAt(i));
        }
        System.out.println("Введите как можно больше слов, которые можно составить из букв слова \"" + initialWord + "\"");
        System.out.println("Отправьте пустое слово, чтобы завершить игру");

        String wordAttempt = sc.nextLine();
        while (wordAttempt.isEmpty() == false && wordAttempt.isBlank() == false) {
            if (ifWordAttemptOk(wordAttempt.toCharArray(), letters) == false) {
                System.err.println("Слово \"" + wordAttempt + "\" не подходит");
                wordAttempt = sc.nextLine();
                continue;
            }
            if (wordsMade.contains(wordAttempt)) {
                System.err.println("Слово \"" + wordAttempt + "\" уже было");
                wordAttempt = sc.nextLine();
                continue;
            }
            System.out.println("Ок! +1");
            wordsMade.add(wordAttempt);
            wordAttempt = sc.nextLine();
        }
        System.out.println("Конец игры. Вы составили " + wordsMade.size() + " слов(а):");
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
