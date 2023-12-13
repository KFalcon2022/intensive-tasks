package com.walking.intensive.chapter2.task10;




/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        //System.out.println(isPalindrome("Муза! Ранясь шилом опыта, ты помолишься на разум."));
        System.out.println(isPalindrome("А"));
    }

    public static StringBuilder getClearSentence(String dirtySentence) {
        StringBuilder clearSentence = new StringBuilder();

        for (int i = 0; i < dirtySentence.length(); i++) {
            if (Character.isLetter(dirtySentence.charAt(i))) {
                clearSentence.append(Character.toLowerCase(dirtySentence.charAt(i)));
            }
        }
        return clearSentence;
    }

    static boolean isPalindrome(String inputString) {

        for (int i = 0; i <= getClearSentence(inputString).length() - 1; i++) {

            if (getClearSentence(inputString).charAt(i) != getClearSentence(inputString)
                    .charAt((getClearSentence(inputString).length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }
}