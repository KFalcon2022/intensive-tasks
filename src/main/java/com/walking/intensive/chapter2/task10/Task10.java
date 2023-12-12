package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Муза, ранясь шилом опыта, ты помолишься на разумы"));
    }

    static boolean isPalindrome(String inputString) {
        String stringCleared = "";

        for (int i = 0; i < inputString.length(); i++) {
            stringCleared += Character.isLetter(inputString.charAt(i)) ?
                    Character.toUpperCase(inputString.charAt(i)) :
                    "";
        }

        for (int i =0; i<stringCleared.length()/2-1; i++){
            if (stringCleared.charAt(i)!=stringCleared.charAt(stringCleared.length()-1-i)){
                return false;
            }
        }

        return true;
    }
}