package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String palindrome = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        System.out.println(isPalindrome(palindrome));
    }

    static boolean isPalindrome(String inputString) {
        int countChar = inputString.length();

        if (countChar < 2) {
            return false;
        }

        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < countChar; i++) {
            if (Character.isLetter(inputString.charAt(i))) {
                modifiedString.append(inputString.charAt(i));
            }
        }

        return modifiedString.toString().equalsIgnoreCase(modifiedString.reverse().toString());
    }
}