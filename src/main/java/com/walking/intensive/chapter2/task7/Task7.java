package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(10000));
    }

    static int getFriendlyPair(int m) {
        int numOne = 0,
                numTwo = -1;

        for (int i = 200; i <= m; i++) {
            if (getSum(getSum(i)) == i && getSum(i) != i) {
                if (i + getSum(i) > 1000000) {
                    break;
                } else {
                    numOne = i;
                    numTwo = getSum(i);
                }
            }
        }

        if (numOne == 0 && numTwo == -1) {
            System.out.println("Дружественных чисел на интервале от 1 до " + m + " нет.");

            return 0;
        }

        return Math.max(numOne, numTwo);
    }
    static int getSum(int num) {
        int counter = 1;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                counter += i;
                counter += num / i;
            }
        }

        if (Math.sqrt(num) % 1 == 0) {
            counter += (int)Math.round(Math.sqrt(num));
        }

        return counter;
    }
}