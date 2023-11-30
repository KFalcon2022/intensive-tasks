package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static final int MAX_NUMBER = 1000000;
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(100));

    }

    static int getSumOfDivisorsNumber(int number) {
        int SumOfDivisorsNumber = 0;
        if (number >= MAX_NUMBER || number < 0) {
            System.out.println("Invalid number input. Try again");
        }
        for (int i = 1; i <= number ; i++) {
            if (number % i == 0) {
                if(number / i == number) {
                    continue;
                }
                SumOfDivisorsNumber += number / i;
            }
        }
        return SumOfDivisorsNumber;
    }

    static int getFriendlyPair(int m){
        // Ваш код
        int greaterPairNumber = 0;
        int lowerPairNumber = 0;
        int sumOfGreaterPairNumber = 0;
        int sumOfLowerPairNumber = 0;
        for (int i = 1; i < m; i++) {
            sumOfGreaterPairNumber = getSumOfDivisorsNumber(i);
            for (int j = 0; j <m; j++) {
                if(getSumOfDivisorsNumber(i) == getSumOfDivisorsNumber(j) & i != j) {
                    greaterPairNumber = i;
                    lowerPairNumber = j;
            }
           }
        }
        System.out.println("first number: " + greaterPairNumber + " second number: " + lowerPairNumber );
        System.out.println("Sum of first number: " + getSumOfDivisorsNumber(97) + " sum of second number: " + getSumOfDivisorsNumber(89) );
        return greaterPairNumber;
        }
}