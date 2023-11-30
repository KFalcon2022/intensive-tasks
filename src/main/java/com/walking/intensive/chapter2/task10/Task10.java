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
        int length = inputString.length();
        char firstChar, lastChar;
        int startIndex = 0;
        int endIndex = length - 1;

        while (startIndex < length) {
            firstChar = inputString.charAt(startIndex);
            lastChar = inputString.charAt(endIndex);

            if (isRussianLetter(firstChar)) {
                firstChar = toLowerCase(firstChar);
            } else {

                while (!isRussianLetter(firstChar) && startIndex < length - 1) {
                    startIndex++;
                    firstChar = inputString.charAt(startIndex);
                }

                if (isRussianLetter(firstChar)) {
                    firstChar = toLowerCase(firstChar);
                }
            }

            if (isRussianLetter(lastChar)) {
                lastChar = toLowerCase(lastChar);
            } else {

                while (!isRussianLetter(lastChar) && endIndex > 0) {
                    endIndex--;
                    lastChar = inputString.charAt(endIndex);
                }

                if (isRussianLetter(lastChar)) {
                    lastChar = toLowerCase(lastChar);
                }
            }

            if (isRussianLetter(firstChar) && isRussianLetter(lastChar)) {
                if (toLowerCase(firstChar) != toLowerCase(lastChar)) {
                    return false;
                }
            }

            startIndex++;
            if (endIndex > 0) {
                endIndex--;
            }
        }

        return true;
    }

    public static boolean isRussianLetter(char simbol) {

        return simbol >= 1040 && simbol <= 1103;
    }

    public static boolean isUpperCase(char simbol) {

        return simbol >= 1040 && simbol <= 1071;
    }
    public static char toLowerCase(char simbol) {
        if (isUpperCase(simbol)) {

            return (char) (simbol + 32);
        }

        return simbol;
    }
}
