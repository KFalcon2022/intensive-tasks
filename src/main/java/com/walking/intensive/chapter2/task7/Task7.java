package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {

    public static void main(String[] args) {
        int numPair = getFriendlyPair(1000000);
        System.out.println(numPair);
    }

    static int getFriendlyPair(int n) {
        for (int i = n; i >= 1; i--) {

            if(getNumbers(getNumbers(i)) == i ){
                return i;
            }
        }

        return 0;
    }

    static int getNumbers(int x) {
        if(x == 6 || x == 28){
            return 0;
        }

        int numbers = 0;

        for (int i = 1; i < x - 1; i++) {

            if (x % i == 0) {
                numbers += i;
            }
        }

        return numbers;
    }
}