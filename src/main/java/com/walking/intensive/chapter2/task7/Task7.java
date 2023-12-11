package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    static int numOne; //Для доступа и контроля из main
    static int numTwo;

    public static void main(String[] args) {
        System.out.println("getFriendlyPair() " + getFriendlyPair(1000000));
    }

    static int getFriendlyPair(int m) {
        numOne = 0;
        numTwo = -1;

        for (int i = 200; i <= m; i++) {
            int getSum_i = getSum(i);
            int j = getSum(getSum_i);
            //if (i + j > m) break;
            if (getSum(getSum(i)) == i && getSum(i) != i) {
                //if (i + getSum(i) > m) {
                if (i + getSum(i) > 1000000) {
                    break;
                } else {
                    numOne = i;
                    numTwo = getSum(i);
                }
            }
        }
        if (numOne == 0 && numTwo == -1) {
            System.out.println("Дружественных чисесл на интервале от 1 до " + m + " нет.");
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
        if (Math.sqrt(num) % 1 == 0)
            counter += Math.sqrt(num);
        return counter;
    }
}