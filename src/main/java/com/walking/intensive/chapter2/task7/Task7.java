package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(1000000));
    }

    static int getFriendlyPair(int m) {
        int maxNumber = 0;
        int maxSum = 0;
        for (int i = m - 1; i > 0; i--) {
            int sum1 = getSumFactorsNumber(i);
            int sum2 = 0;
            if (maxSum < i + sum1) {
                sum2 = getSumFactorsNumber(sum1);
            }
            if (sum1 != i && sum2 == i && maxSum < sum1 + i && sum1 < m && sum2 < m) {
                maxSum = sum1 + i;
                maxNumber = Math.max(sum1, i);
            }
        }
        return maxNumber;
    }

    static int getSumFactorsNumber(int n) {
        int sumFactorsNumber = 1;
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                sumFactorsNumber += j;
                int divisionWithoutRemainder = n / j;
                if (j != divisionWithoutRemainder) {
                    sumFactorsNumber += divisionWithoutRemainder;
                }
            }
        }
        return sumFactorsNumber;
    }
}