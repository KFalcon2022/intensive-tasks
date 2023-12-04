package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Муза! Ранясь шилом опыта, ты помолишься на разум."));
        System.out.println(isPalindrome("Горд дох, ход дрог."));
        System.out.println(isPalindrome("Никогда не говори никогда."));

    }

    static boolean isPalindrome(String inputString) {
        int start = 0;
        int end = inputString.length() - 1;

        boolean isTrue = true;

        while (start < end) {

            char fromStart = inputString.toLowerCase().charAt(start);
            char fromEnd = inputString.toLowerCase().charAt(end);

            if (Character.isLetter(inputString.toLowerCase().charAt(start)) && Character.isLetter(inputString.toLowerCase().charAt(end))) {

                if (fromStart != fromEnd) {
                    isTrue = false;
                }
                start++;
                end--;

            } else if (!Character.isLetter(fromStart)) {
                start++;
            } else {
                end--;
            }
        }
        return isTrue;
    }
}
