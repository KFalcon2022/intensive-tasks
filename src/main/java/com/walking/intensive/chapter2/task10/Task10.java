package src.main.java.com.walking.intensive.chapter2.task10;

import java.util.Locale;
import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фразу: ");
        String inputString = scanner.nextLine();

        scanner.close();

        if (isPalindrome(inputString)) {
            System.out.println("Это палиндром!");
        } else {
            System.out.println("Это не палиндром =(");
        }
    }

    public static boolean isPalindrome(String inputString) {
        return doClean(inputString).equals(invertString(doClean(inputString)));
    }

    public static String doClean(String inputString) {
        return inputString.replaceAll("\\p{Punct}", "").replaceAll("\\s", "").toLowerCase();
    }

    public static String invertString(String inputString) {
        String invertedString = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            invertedString += inputString.charAt(i);
        }

        return invertedString;
    }
}