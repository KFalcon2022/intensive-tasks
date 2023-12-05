package com.walking.intensive.chapter2.task10;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-palindrome.html">ссылка</a>
 */
public class Task10 {
    public static void main(String[] args) {
        // Тестирование метода isPalindrome
        String testString = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        System.out.println("Is palindrome: " + isPalindrome(testString));
    }

    /**
     * Метод для проверки строки на палиндром.
     * Палиндром — это слово или фраза, которая читается одинаково в обоих направлениях,
     * игнорируя пробелы, знаки препинания и регистр.
     */
    public static boolean isPalindrome(String inputString) {
        // Проверка на null и пустую строку
        if (inputString == null || inputString.isEmpty()) {
            return false;
        }

        // Инициализация индексов для проверки с обоих концов строки
        int leftIndex = 0;
        int rightIndex = inputString.length() - 1;

        // Пропуск всех не буквенно-цифровых символов с левой стороны
        while (leftIndex < rightIndex && !Character.isLetterOrDigit(inputString.charAt(leftIndex))) {
            leftIndex++;
        }

        // Пропуск всех не буквенно-цифровых символов с правой стороны
        while (leftIndex < rightIndex && !Character.isLetterOrDigit(inputString.charAt(rightIndex))) {
            rightIndex--;
        }

        // Если индексы встретились или пересеклись, значит букв для проверки нет, строка не палиндром
        if (leftIndex >= rightIndex) {
            return false;
        }

        // Сброс индексов для основной проверки палиндрома
        leftIndex = 0;
        rightIndex = inputString.length() - 1;

        // Проверка на палиндром с движением к центру строки
        while (leftIndex < rightIndex) {
            // Получение и преобразование текущих символов к нижнему регистру для сравнения
            char currentLeftChar = inputString.charAt(leftIndex);
            char leftChar = Character.toLowerCase(currentLeftChar);
            char currentRightChar = inputString.charAt(rightIndex);
            char rightChar = Character.toLowerCase(currentRightChar);

            // Повторный пропуск всех не буквенно-цифровых символов
            while (leftIndex < rightIndex && !Character.isLetterOrDigit(currentLeftChar)) {
                leftIndex++;
                currentLeftChar = inputString.charAt(leftIndex);
                leftChar = Character.toLowerCase(currentLeftChar);
            }

            while (leftIndex < rightIndex && !Character.isLetterOrDigit(currentRightChar)) {
                rightIndex--;
                currentRightChar = inputString.charAt(rightIndex);
                rightChar = Character.toLowerCase(currentRightChar);
            }

            // Сравнение символов, если они не совпадают, строка не палиндром
            if (leftChar != rightChar) {
                return false;
            }

            // Переход к следующим символам для продолжения проверки
            leftIndex++;
            rightIndex--;
        }

        // Все символы совпали, строка является палиндромом
        return true;
    }
}