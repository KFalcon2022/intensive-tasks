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
        int lastIndex = inputString.length() - 1;

        for (int i = 0, j = lastIndex; i <= lastIndex; i++, j--) {
            if (getCharByIndex(inputString, i, true) != getCharByIndex( inputString, lastIndex - i, false)) {

                return false;
            }
        }

        return true;
    }

    public static char getCharByIndex(String str, int index, boolean isStart) {
        if (isRussianLetter(str.charAt(index))) {

            if (isUpperCase(str.charAt(index))) {
                return toLowerCase(str.charAt(index));
            }

            return str.charAt(index);
        }
        if(isStart) {
            index++;

            return getCharByIndex(str, index, true);
        }
        index--;

        return getCharByIndex(str, index, false);
    }

    public static boolean isRussianLetter(char simbol) {
        if (simbol >= 192 && simbol <= 223) {
            return true;
        }

        return false;
    }

    public static boolean isUpperCase(char simbol) {
        if (simbol >= 192 && simbol <= 223) {
            return true;
        }

        return false;
    }
    public static char toLowerCase(char simbol) {
        if (isUpperCase(simbol)) {

            return (char) (simbol + 32);
        }

        return simbol;
    }
}
