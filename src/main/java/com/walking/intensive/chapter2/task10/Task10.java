package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        Task10 task10 = new Task10();
        System.out.println(task10.isPalindrome("Муза! Ранясь шилом опыта, ты помолишься на разум."));
        // В условии не было static, по этому я не стал дописывать static, а сделал вызов метода через объект.
    }

    boolean isPalindrome(String inputString) {
        String cleanStr = inputString.replaceAll("[^а-яА-Я]", "")
                .toLowerCase();

        for (int i = 0; i < cleanStr.length() / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(cleanStr.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}