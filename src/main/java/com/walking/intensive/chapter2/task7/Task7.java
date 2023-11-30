package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(300));
    }

    static int getFriendlyPair(int maxValueOfNumber) {
        for (int i = maxValueOfNumber; i > 1; i--) {
            int sumOfDivFirst = 0;
            int sumOfDivSecond = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sumOfDivFirst += j;
                }
            }

            for (int j = 1; j < sumOfDivFirst; j++) {
                if (sumOfDivFirst % j == 0) {
                    sumOfDivSecond += j;
                }
            }

            if (sumOfDivSecond == i) {
                return Math.max(sumOfDivSecond, sumOfDivFirst);
            }

        }
        return 0;
    }
}