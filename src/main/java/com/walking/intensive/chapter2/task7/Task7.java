package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        int n = 7000;
        System.out.printf("Для N = %d искомое число = %d", n, getFriendlyPair(n));
    }

    static int getFriendlyPair(int m) {
        for (int i = m - 1; i > 0; i--) {     //натуральные числа начинается от единицы, т.е i>0
            for (int j = m - 1; j > 0; j--) {
                if ((i != j) && isFriendlyPair(i, j)) {
                    System.out.println(i + "\n" + j);
                    return Math.max(i, j);
                }
            }
        }

        return 0;
    }

    static boolean isFriendlyPair(int a, int b) {
        int highNumber = Math.max(a, b);
        int lowNumber = Math.min(a, b);

        int nodSumForLowNumber = 0;
        int nodSumForHighNumber = 0;

        // далее условие "highNumber / 2 + 1"
        // 1.   Пополам потому что кратность самому себе начального числа не рассматривается в сумме по условиям,
        //      значит деленное пополам будет максимальным для каждого конкретного
        // 2.   А вдруг начальное число нечетное? тогда плюс один на всякий случай, потому что 11/2 = 5 округляет в меньшую сторону

        for (int i = 1; i < highNumber / 2 + 1; i++) {
            if (i < lowNumber && lowNumber % i == 0) {
                nodSumForLowNumber += i;
            }
            if (highNumber % i == 0) {
                nodSumForHighNumber += i;
            }
        }

        return (nodSumForLowNumber == highNumber) && (nodSumForHighNumber == lowNumber);
    }
}