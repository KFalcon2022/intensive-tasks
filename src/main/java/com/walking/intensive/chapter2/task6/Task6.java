package com.walking.intensive.chapter2.task6;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(getHighestCommonFactor(40, 40));
        System.out.println(getGreatestCommonDivisor(1256, 2044));
        System.out.println(getHighestCommonFactor(-231, -140));
        System.out.println(getGreatestCommonDivisor(-231, -140));
        System.out.println(getGreatestCommonDivisor(-140, -231));
        System.out.println(getGreatestCommonDivisor(-2, -5));
        System.out.println(getGreatestCommonDivisor(-5, -2));

    }

    static int getGreatestCommonDivisor(int number1, int number2) {
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 > 0) {
            return getGreatestCommonDivisor(number2, number1 % number2);
        } else {
            return number1;
        }
    }

    static int getHighestCommonFactor(int number1, int number2) {
        return number1 * number2 / (getGreatestCommonDivisor(number1, number2));
    }
}