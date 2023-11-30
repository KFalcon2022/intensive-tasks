package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        int N = 1000; // границы поиска дружественных чисел
        int maxNumber = getFriendlyPair(N);
        System.out.println("Максимальное число дружественной пары: " + maxNumber);
    }

    static int getFriendlyPair(int m) {
        int maxPairSum = 0;
        int maxNumber = 0;
        int friendMax = 0;

        for (int i = 1; i < m; i++) {
            int sumOfDivisorsI = sumOfDivisors(i);
            if (sumOfDivisorsI < m && sumOfDivisorsI != i && i == sumOfDivisors(sumOfDivisorsI) && (i + sumOfDivisorsI) > maxPairSum) {
                maxPairSum = i + sumOfDivisorsI;
                maxNumber = Math.max(i, sumOfDivisorsI);
                friendMax = Math.min(i, sumOfDivisorsI);
            }
        }

        System.out.println("Другое число дружественной пары: " + friendMax);
        return maxNumber;
    }

    private static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}