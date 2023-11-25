package com.walking.intensive.chapter2.task6;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(primeFactorization(100));


    }

    static int greatestCommonDivisor(int a, int b) {


        return 0;
    }

    static int highestCommonFactor(int a, int b) {


        return 0;
    }

    static List<Integer> primeFactorization(int a) {
        List<Integer> result = new ArrayList<>();
        int number = Math.abs(a);
        do {
            if (number == 0) {
                System.out.println("Вы пытаетесь разложить 0 на простые множители");
                break;
            }
            if (number == 1) {
                result.add(1);
                break;
            }
            if (number % 2 == 0) {
                result.add(2);
                number /= 2;
            } else {
                for (int i = 3; i <= number; i = i + 2) {
                    if (number == i) {
                        result.add(i);
                        number /= i;
                        break;
                    }
                    if (number % i == 0) {
                        result.add(i);
                        number /= i;
                    }
                }
            }
        } while (number >= 1);
        Collections.sort(result);
        return result;
    }


}