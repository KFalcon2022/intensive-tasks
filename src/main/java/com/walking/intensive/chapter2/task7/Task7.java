package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        int N = 1000000; // границы поиска дружественных чисел
        int maxNumber = getFriendlyPair(N);
        System.out.println("Максимальное число дружественной пары: " + maxNumber);
    }

    static int getFriendlyPair(int m) {
        int maxPairSum = 0;
        int maxNumber = 0;
        int friendMax = 0;

        for (int i = 1; i < m; i++) {
            int sumDivisorsI = sumDivisors(i);
            if (sumDivisorsI < m && sumDivisorsI != i && i == sumDivisors(sumDivisorsI) && (i + sumDivisorsI) > maxPairSum) {
                maxPairSum = i + sumDivisorsI;
                maxNumber = Math.max(i, sumDivisorsI);
                friendMax = Math.min(i, sumDivisorsI);
            }
        }

        System.out.println("Другое число дружественной пары: " + friendMax);
        return maxNumber;
    }

    private static int sumDivisors(int number) {
        int sum = 1;
        int sqrt = (int) Math.sqrt(number);

        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                sum += i;
                int d = number / i;
                if (d != i) {
                    sum += d;
                }
            }
        }

        return sum;
    }
}