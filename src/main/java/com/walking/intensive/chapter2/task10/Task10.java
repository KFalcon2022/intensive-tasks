package com.walking.intensive.chapter2.task10;

/**
 * ???????: <a href="https://geometry-math.ru/homework/Java-palindrome.html">??????</a>
 */
public class Task10 {
    public static void main(String[] args) {

        String str1 = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        String str2 = "О Муза! Ранясь шилом опыта, ты помолишься на разум.";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }

    static boolean isPalindrome(String inputString) {

        int indexLeftLetter = 0;
        boolean noLettersInString = true;
//Проверка на наличие букв в строке, для недопущения ошибки при пустой, либо строке только из символов.
// Как сопутствующее - поиск индекса первой буквы.
        while (indexLeftLetter < inputString.length() && noLettersInString) {

            if (Character.isLetter(inputString.charAt(indexLeftLetter++))) {
                noLettersInString = false;
            }
        }

        if (noLettersInString) {
            return false;
        }
// Конец проверки.
        indexLeftLetter--;
        int indexRightLetter = inputString.length() - 1;

        while (indexLeftLetter <= indexRightLetter) {

            while (!Character.isLetter(inputString.charAt(indexLeftLetter))) {
                indexLeftLetter++;
            }

            while (!Character.isLetter(inputString.charAt(indexRightLetter))) {
                indexRightLetter--;
            }

            if (Character.toLowerCase(inputString.charAt(indexLeftLetter)) != Character.toLowerCase(inputString.charAt(indexRightLetter))) {
                return false;
            }

            indexLeftLetter++;
            indexRightLetter--;
        }
        return true;
    }
}