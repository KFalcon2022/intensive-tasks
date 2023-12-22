package com.walking.intensive.chapter2.task10;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Муза! Ранясь шилом опыта, ты помолишься на разум"));
    }

    static boolean isPalindrome(String inputString) {

        if (inputString.length() < 2){
            return false;
        }

        //Многоэтажное получилось решение. Ниже есть решение традиционным методом.
        CharacterIterator forward = new StringCharacterIterator(inputString);
        CharacterIterator backward = new StringCharacterIterator(inputString);

        //Не уверен насчет верности выбранного способа инициализации, но (в отличие от присвоения 0) выглядит
        //понятнее, хотя и «масло масляное».
        char c1 = forward.first();
        char c2 = backward.last();

        while (forward.getIndex() < backward.getIndex()) {

            while (!Character.isLetter(c1)) {
                c1 = forward.next();
            }

            while (!Character.isLetter(c2)) {
                c2 = backward.previous();
            }

            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }
            c1 = forward.next();
            c2 = backward.previous();
        }

        return true;

/*        //Классический подход
        int start = 0;
        int end = inputString.length() - 1;

        while (start < end) {

            while (!Character.isLetter(inputString.charAt(start))) {
                start++;
            }

            while (!Character.isLetter(inputString.charAt(end))) {
                end--;
            }

            if (Character.toLowerCase(inputString.charAt(start)) != Character.toLowerCase(inputString.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }
        return true;
        */
    }
}