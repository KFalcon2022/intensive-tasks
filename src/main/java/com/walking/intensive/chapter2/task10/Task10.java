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
        int nextLastCharCounter = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char firstChar = Character.toLowerCase(inputString.charAt(i));

            if (!Character.isAlphabetic(firstChar)) {
                nextLastCharCounter--;
                continue;
            }

            for (int j = inputString.length() - 1 - i - nextLastCharCounter; j >= 0; j--) {
                char lastChar = Character.toLowerCase(inputString.charAt(j));

                if (!Character.isAlphabetic(lastChar)) {
                    nextLastCharCounter++;
                    continue;
                }

                if (firstChar != lastChar) {
                    return false;
                }

                break;
            }
        }

        return true;
    }
}