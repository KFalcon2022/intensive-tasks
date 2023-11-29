package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {

    public static void main(String[] args) {
        String inputString = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        System.out.println(isPalindrome(inputString));
    }

    public static boolean isPalindrome(String inputString) {
        String str = inputString.toLowerCase().replaceAll("[^а-я0-9]", "");
        int lastIndex = str.length() - 1;

        for(int i = 0, j = lastIndex; i <= lastIndex; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
