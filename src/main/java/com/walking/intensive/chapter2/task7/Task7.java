package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {

        int maxFriendlyNumber = getFriendlyPair(1000000);

        System.out.println("Максимальное дружественное число: " + maxFriendlyNumber);
    }

    static int getFriendlyPair(int m) {
        int maxFriendlyNumber = 0;

        for (int num1 = 1; num1 < m; num1++) {
            int num2 = getSum(num1);

            if (num1 < num2 && num2 < m && getSum(num2) == num1) {
                maxFriendlyNumber = num2;
            }
        }

        return maxFriendlyNumber;
    }

    public static int getSum(int number) {
        int sum = 1;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                int divisor = number / i;
                if (divisor != i) {
                    sum += divisor;
                }
            }
        }

        return sum;
    }
}