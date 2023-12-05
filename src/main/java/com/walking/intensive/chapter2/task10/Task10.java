package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {

        String text = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        System.out.println(isPalindrome(text));

    }

    static boolean isPalindrome(String inputString) {

        String text = getReplaceAllText(inputString);

        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) != text.charAt(text.length() - 1 - i)){

                return false;
            }
        }

        return true;
    }

    public static String getReplaceAllText(String text){

        return text.replaceAll("\\p{Punct}|\\p{Space}", "").toLowerCase();
    }
}