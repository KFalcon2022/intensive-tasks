package com.walking.intensive.chapter2.task7;

public class Task7 {
    public static void main(String[] args) {
        int N = 1000; // граници поиска дружественных чисел
        System.out.println(getFriendlyPair(N)); // максимальное число с дружественной пары
    }

    static String getFriendlyPair(int m) {
        int maxPairSum = 0;
        int maxNumberInPair = 0;
        int friendOfMaxNumber = 0;

        // Перебор чисел от 1 до m для поиска дружеских пар
        for (int i = 1; i < m; i++) {
            // Вычисление суммы делителей числа i
            int sumOfDivisorsI = sumOfDivisors(i);

            /* Проверка, сумма делителей меньше m, не является ли число дружественным самому себе,
            и является ли дружеским числом для sumOfDivisorsI*/
            if (sumOfDivisorsI < m && sumOfDivisorsI != i && i == sumOfDivisors(sumOfDivisorsI)) {
                // Вычисление суммы дружеской пары
                int pairSum = i + sumOfDivisorsI;

                /* Обновление максимальной суммы и определение наибольшего и наименьшего числа в паре,
                если текущая сумма больше предыдущей максимальной суммы*/
                if (pairSum > maxPairSum) {
                    maxPairSum = pairSum;
                    maxNumberInPair = Math.max(i, sumOfDivisorsI); // Сохранение наибольшего числа из пары
                    friendOfMaxNumber = Math.min(i, sumOfDivisorsI); // Сохранение наименьшего числа из пары
                }
            }
        }

        return maxNumberInPair + ", " + friendOfMaxNumber; // Возвращение строки
    }

    private static int sumOfDivisors(int number) {
        int sum = 0;
        /* перебор возможных делителей числа number
         * (делитель любого числа никогда не может быть больше чем его половина, исключение - делителем можеть быть само число).*/
        for (int i = 1; i <= number / 2; i++) {
            // если number делитель, добавляем его к сумме
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
