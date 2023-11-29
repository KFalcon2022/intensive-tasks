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

        // счетчик чисел от 1 до m для поиска дружественных пар
        for (int i = 1; i < m; i++) {
            int sumOfDivisorsI = sumOfDivisors(i); /* Расчёт суммы делителей числа и
            проверка, что сумма делителей меньше чем m и число не дружественно само себе*/
            if (sumOfDivisorsI < m && sumOfDivisorsI != i) {
                // провеверка, число i дружественное для sumOfDivisorsI
                if (i == sumOfDivisors(sumOfDivisorsI)) {
                    int pairSum = i + sumOfDivisorsI; /*Расчёт суммы дружественной пары
                    Обновление максимальных значений, если текущая сумма больше чем предидущая*/
                    if (pairSum > maxPairSum) {
                        maxPairSum = pairSum;
                        maxNumberInPair = Math.max(i, sumOfDivisorsI); // сохранение наибольшего числа из пары
                        friendOfMaxNumber = Math.min(i, sumOfDivisorsI); // сохранение наименьшего числа из пары
                    }
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
