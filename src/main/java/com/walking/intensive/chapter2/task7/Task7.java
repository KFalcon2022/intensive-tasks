package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        int m = 15000;

        if (m < 2) {
            System.out.println("Число должно быть больше 1.");
            return;
        }

        if (getFriendlyPair(m) == 0) {
            System.out.println("Дружественных чисел меньше заданного нет.");
        } else {
            System.out.println("Максимально близкое дружественное число, меньше или равное заданному: " + getFriendlyPair(m));
        }
    }

    static int getFriendlyPair(int m) {

        while (m != 0 && !(m == getSumDividers(getSumDividers(m)) && getSumDividers(m) < m)) {
            m--;
        }

        return m;
    }

    static int getSumDividers(int n) {

        int sumDividers = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumDividers += i;
            }
        }

        return sumDividers;
    }
}