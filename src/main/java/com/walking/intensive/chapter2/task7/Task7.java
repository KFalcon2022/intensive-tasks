package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(520));
    }

    static int getFriendlyPair(int m) {
        int maxFriendlySum = 0;
        int maxFriendlyNum = 0;

        for (int i = 2; i < m; i++) {
            int sum1 = getDivisorsSum(i);
            int sum2 = getDivisorsSum(sum1);

            if (i == sum2 && i != sum1 && sum1 < m) {
                if (sum1 > maxFriendlySum) {
                    maxFriendlySum = sum1;
                    maxFriendlyNum = i;
                }
            }
        }
        return maxFriendlyNum;
    }

    static int getDivisorsSum(int n) {
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }


}