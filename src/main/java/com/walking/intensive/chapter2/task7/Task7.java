package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(1000000));
    }

    public static int getSumOfDivisors(int n) {
        if (n < 2) {
            return 0;
        }

        int sum = 1; // 1 всегда делитель
        int sqrtN = (int) Math.sqrt(n);

        for (int factor = 2; factor <= sqrtN; factor++) {
            if (n % factor == 0) {
                sum += factor;
                int pairedFactor = n / factor;
                if (pairedFactor != factor) { // Исключить корень квадратный n, если n - полный квадрат
                    sum += pairedFactor;
                }
            }
        }

        return sum;
    }

    static int getFriendlyPair(int m) {
        int maxSum = 0;
        int result = 0;
        for (int i = m - 1; i > 0; i--) {
            int sumOfDivisiors = getSumOfDivisors(i);
            if (i == getSumOfDivisors(sumOfDivisiors) && (i + sumOfDivisiors > maxSum) && Math.max(i, sumOfDivisiors) < m) {
                maxSum = m + sumOfDivisiors;
                result = Math.max(i, sumOfDivisiors);
            }
        }
        return result;
    }
}