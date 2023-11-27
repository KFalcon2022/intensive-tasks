package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String palindrome1 = "А роза упала на лапу Азора";
        System.out.println(isPalindrome(palindrome1));

        String palindrome2 = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        System.out.println(isPalindrome(palindrome2));

        String palindrome3 = "Я - арка края";
        System.out.println(isPalindrome(palindrome3));

        System.out.println(isPalindrome("Это не палидром!"));
    }

    static boolean isPalindrome(String inputString) {
        String stringOne = cleanString(inputString);
        String stringTwo = cleanString(inputString);
        stringTwo = reverseString(stringTwo);

        return stringOne.equalsIgnoreCase(stringTwo);
    }

    static String reverseString(String string) {
        String result = "";
        int strLength = string.length();
        for (int i = 0; i < strLength; i++) {
            result += string.charAt(strLength - 1 - i);
        }
        return result;
    }

    static String cleanString(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                result += string.charAt(i);
            }
        }
        return result;
    }
}