package com.walking.intensive.chapter2.task10;

/**
 * ???????: <a href="https://geometry-math.ru/homework/Java-palindrome.html">??????</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String inputString = "Муза! Ранясь шилом опыта, ты помолишься на разум.";

        if (isPalindrome(inputString)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }

    static boolean isPalindrome(String inputString) {
        String letterString = "";

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetterOrDigit(inputString.charAt(i))) {
                letterString = letterString + inputString.charAt(i);
            }
        }
        String reverseLetterString = "";

        for (int i = 0; i < letterString.length(); i++) {
            reverseLetterString = letterString.charAt(i) + reverseLetterString;
        }

        return reverseLetterString.equalsIgnoreCase(letterString);
    }
}