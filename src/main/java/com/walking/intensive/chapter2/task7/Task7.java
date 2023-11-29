package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(12500));
    }

    static int getFriendlyPair(int m) {
        int maxNumber = 0, sum1 = 1, sum2 = 1;
        for (int i = m - 1; i > 0; i--) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    sum1 += j;
                    sum1 += i / j;
                }
            }
            for (int j = 2; j <= Math.sqrt(sum1); j++) {
                if (sum1 % j == 0) {
                    sum2 += j;
                    sum2 += sum1 / j;
                }
            }
            if (sum2 == i && i != sum1 && sum1 < m) {
                maxNumber = i;
                break;
            }
            sum2 = 1;
            sum1 = 1;
        }
        return maxNumber;
    }
}