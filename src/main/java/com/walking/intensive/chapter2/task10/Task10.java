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

        System.out.println(isPalindrome("Это не палиндром!"));
    }

    static boolean isPalindrome(String inputString) {
        StringBuilder stringOne = new StringBuilder(inputString.toLowerCase());
        StringBuilder stringTwo = new StringBuilder(inputString.toLowerCase());

        stringOne = cleanString(stringOne);
        stringTwo = cleanString(stringTwo);
        stringTwo.reverse();

        return stringOne.compareTo(stringTwo) == 0;
    }

    static StringBuilder cleanString(StringBuilder string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                result.append(string.charAt(i));
            }
        }
        return result;
    }
}