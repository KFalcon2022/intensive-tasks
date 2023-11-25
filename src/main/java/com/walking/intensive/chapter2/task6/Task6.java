package com.walking.intensive.chapter2.task6;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(primeFactorization(200356));
        System.out.println(greatestCommonDivisor(54,24));
        System.out.println(greatestCommonDivisor(124,1150));



    }

    static int greatestCommonDivisor(int a, int b) {
        List<Integer> aPrimeList = primeFactorization(a);
        List<Integer> bPrimeList = primeFactorization(b);
        int GCD = 1;
        for (int i = 0; i < bPrimeList.size(); i++) {
            if (aPrimeList.contains(bPrimeList.get(i))) {
                GCD*=bPrimeList.get(i);
                // Если возникнет ситуация когда лист содержит два и более одинаковых значения подряд {..,2,2..} мы зануляем
                // первое найденое значение, чтобы он больше его не мог найти в методе contains
                aPrimeList.set(aPrimeList.indexOf(bPrimeList.get(i)),0);
            }
        }


        return GCD;
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
                        break;
                    }
                }
            }
        } while (number >= 1);
        Collections.sort(result);
        return result;
    }


}