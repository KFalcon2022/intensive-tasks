package com.walking.intensive.chapter2.task10;

/**
 * ???????: <a href="https://geometry-math.ru/homework/Java-palindrome.html">??????</a>
 */
public class Task10 {
    public static void main(String[] args) {
        String inputString = "Муза!!! Ранясь шилом опыта, ты помолишься на разум!!!";

        if (isPalindrome(inputString)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }

    static boolean isPalindrome(String inputString) {
        if (inputString == "" || inputString == null) { // Проверим, есть ли смысл методу работать
            return false;
        }

        for (int i = 0, j = inputString.length() - 1; i < inputString.length() / 2 || j > inputString.length() / 2; i++, j--) { // Разбиваю строку пополам и иду по символам сразу с обоих концов
            if (!Character.isLetterOrDigit(inputString.charAt(i))) { // Если символ в первой половине не буква и не цифра,
                j++;                                                 // пропускаю эту итерацию, пропуская этот символ,
                continue;                                            // но не пропуская тот символ во второй половине, что должен был быть в прошлой итерации
            }

            if (!Character.isLetterOrDigit(inputString.charAt(j))) { // Аналогично предыдущей проверке, но для второй половины строки
                i--;
                continue;
            }

            if (inputString.toLowerCase().charAt(i) != inputString.toLowerCase().charAt(j)) { // И если буква или цифра с первой половины не совпадает с её отражением со второй половины, то это не палиндром
                return false;
            }
        }

        return true; // А если прошли все проверки, то палиндром! И обошлись без создания строк
    }
}