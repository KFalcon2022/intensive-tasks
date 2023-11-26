package com.walking.intensive.chapter2.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Значение максимального дружественного числа: ");
        int maxValue = sc.nextInt();

        System.out.println("Наибольшее число из пары дружественных чисел не более числа " + maxValue + ": " + getMaxFriendlyNumber(maxValue));
    }

    public static int getMaxFriendlyNumber(int maxValue) {
        int firstNumber = 2;
        int memory = 0;

        while (firstNumber < Integer.MAX_VALUE) {
            int sum1 = 0;
            int sum2 = 0;

            for (int i = 1; i < firstNumber; i++) {

                if (firstNumber % i == 0) {
                    sum1 += i;
                }
            }

            if(sum1 < maxValue){
                memory = sum1;
                firstNumber++;
                continue;
            }
            else{
                sum1 = memory;
                firstNumber--;
            }

            int secondNumber = sum1;

            for (int j = 1; j < secondNumber; j++) {

                if (secondNumber % j == 0) {
                    sum2 += j;
                }
            }

            if ((sum2 == firstNumber) && (firstNumber != secondNumber)) {
                return Math.max(sum1, sum2);
            }
            firstNumber--;
        }
        return 0;
    }
}