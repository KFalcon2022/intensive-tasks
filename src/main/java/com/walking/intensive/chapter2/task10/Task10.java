package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String inputString = "Was/.' it a cat7654 I saw?";
        System.out.println(isPalindrome(inputString));

    }

    static boolean isPalindrome(String inputString) {
        String modifiedString = "";
        String modifiedStringReverse = "";

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isLetter(ch)) {
                modifiedStringReverse += Character.toString(ch);
                modifiedString = Character.toString(ch) + modifiedString;
            }
        }

        if (modifiedString.equalsIgnoreCase(modifiedStringReverse)) {
            return true;
        }

        return false;
    }
}