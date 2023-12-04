package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("А "));
        System.out.println(isPalindrome("Муза! Ранясь шилом опыта, ты помолишься на разум."));
        System.out.println(isPalindrome("Муза, ранясь шилом опыта, ты помолишься на разумы"));
    }

    static boolean isPalindrome(String inputString) {
        StringBuilder firstLine = new StringBuilder(inputString.toLowerCase());
        StringBuilder secondLine = new StringBuilder(inputString.toLowerCase());

        firstLine = correctionLine(firstLine);
        secondLine = correctionLine(secondLine);
        secondLine.reverse();
        // обрабатываем вариант, при котором введена одна буква, но имеются пробелы и прочие символы
        if (firstLine.length() < 2) {
            return false;
        }

        return firstLine.compareTo(secondLine) == 0;
    }

    static StringBuilder correctionLine(StringBuilder s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                result.append(s.charAt(i));
            }
        }

        return result;
    }
}