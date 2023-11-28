package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam ??..!:^"));
    }

    static boolean isPalindrome(String inputString){
        inputString = inputString.replaceAll("[^A-Za-z0-9]", "");
        StringBuilder sbReverse = new StringBuilder(inputString.replaceAll("[^A-Za-z0-9]", "")).reverse();
        return inputString.equalsIgnoreCase(sbReverse.toString());
    }
}