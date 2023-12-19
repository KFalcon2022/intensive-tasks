package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Муза! Ранясь шилом опыта, ты помолишься на разум"));
    }

    static boolean isPalindrome(String inputString) {

        String temporaryString = "";
        for (int i = 0; i < inputString.length(); i++) {

            if (Character.isLetterOrDigit(inputString.charAt(i))) {
                temporaryString += inputString.toLowerCase().charAt(i);
            }
        }

        //Прошу прощения за скобки, задания отправлялись разом и многие ошибки тоже.
        if (temporaryString.length() < 2) {
            return false;
        }
        int start = 0;
        int end = temporaryString.length() - 1;

        while (start < end) {
            char stepFwd = temporaryString.charAt(start++);
            char stepBack = temporaryString.charAt(end--);

            return stepFwd == stepBack;
        }

        return false;
    }
}