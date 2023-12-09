package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {

    }

    static int getSumOfDenominators (int m) {
        int sumOfDenominators = 1;
        //int i;
        for (int i = 2; i <= (int) Math.floor(Math.sqrt(m)); i++) {
            if (m == Math.pow(i, 2)) {
                sumOfDenominators += i;
            } else if (m % i == 0) {
                sumOfDenominators += i + (m / i);
            }
        }
        return sumOfDenominators;
    }

    static int getFriendlyPair(int m){
        // Ваш код
        int maxFriendlyNumber = 1000000;
        int maxFoundNumber = 0;
        if (m < maxFriendlyNumber) {
            for (int i = 2; i < m; i++) {
                int maybeFriendlyPair = getSumOfDenominators(i);
                if ((getSumOfDenominators(maybeFriendlyPair) == i) && maybeFriendlyPair < maxFriendlyNumber && maybeFriendlyPair != i) {
                    int maxOfFriendlyPairs = Math.max(maybeFriendlyPair, i);
                    if (maxOfFriendlyPairs > maxFoundNumber) {
                        maxFoundNumber = maxOfFriendlyPairs;
                    }
                }
            }
        }
        return maxFoundNumber;
    }
}