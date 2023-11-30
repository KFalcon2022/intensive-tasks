package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(1000000));
//        System.out.println(getSumFactorsNumber());
    }

    static int getFriendlyPair(int m) {
        int maxNumber = 0;
        int maxSum = 0;
        int sum1;
        int sum2 = 0;
        for (int i = m - 1; i > 0; i--) {
            sum1 = getSumFactorsNumber(i);
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
                if (j != n / j) {
                    sumFactorsNumber +=  n / j;
                }
            }
        }
        return sumFactorsNumber;
    }
}