package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {

    public static void main(String[] args) {
        int m = 130000;
        System.out.println("Нибольшее число из пары дружественных чисел: " + getFriendlyPair(m));
    }

    static int getFriendlyPair(int m){

        while (m >= 0 & m != getSumOfDivisors(getSumOfDivisors(m)) | getSumOfDivisors(m) >= m) {
            m--;
        }
        return m;
    }

    static int getSumOfDivisors(int m) {
        int sumOfDivisors = 0;
        for (int i = 1; i <= m / 2; i++) {
            if (m % i == 0) {
                sumOfDivisors +=  i;
            }
        }
        return sumOfDivisors;
    }
}