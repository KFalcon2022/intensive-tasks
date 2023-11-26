package com.walking.intensive.chapter2.task6;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(primeFactorization(200356));
        System.out.println(greatestCommonDivisor(54, 24));
        System.out.println(greatestCommonDivisor(124, 1150));
        System.out.println(primeFactorization(80));
        System.out.println(primeFactorization(100));
        System.out.println(primeFactorization(256));
        System.out.println(highestCommonFactor(100, 256));
        System.out.println(highestCommonFactor(2560, 8051));
        System.out.println(highestCommonFactor(0, 0));


    }

    static int greatestCommonDivisor(int a, int b) {
        List<Integer> aPrimeList = primeFactorization(a);
        List<Integer> bPrimeList = primeFactorization(b);
        int gcd = 1;
        for (int i = 0; i < bPrimeList.size(); i++) {
            if (aPrimeList.contains(bPrimeList.get(i))) {
                gcd *= bPrimeList.get(i);
                // Если возникнет ситуация когда лист содержит два и более одинаковых значения подряд {..,2,2..} мы зануляем
                // первое найденое значение, чтобы он больше его не мог найти в методе contains
                aPrimeList.set(aPrimeList.indexOf(bPrimeList.get(i)), 0);
            }
        }
        return gcd;
    }

    static int highestCommonFactor(int a, int b) {
        Map<Integer, Integer> aPrimeMap = mapPrimeFactorization(a);
        Map<Integer, Integer> bPrimeMap = mapPrimeFactorization(b);
        int hcf = 1;
        // Сливаем 2 мапы в одну где ключ - простое число, значение - количество этих чисел
        for (Integer i : aPrimeMap.keySet()) {
            if (bPrimeMap.containsKey(i) && bPrimeMap.get(i) < aPrimeMap.get(i)) {
                bPrimeMap.put(i, aPrimeMap.get(i));
            }
            if (!bPrimeMap.containsKey(i)) {
                bPrimeMap.put(i, aPrimeMap.get(i));
            }
        }
        for (Integer i : bPrimeMap.keySet()) {
            hcf *= Math.pow(i, bPrimeMap.get(i));
        }
        return hcf;
    }

    static List<Integer> primeFactorization(int a) {
        boolean isChange;
        List<Integer> result = new ArrayList<>();
        int number = Math.abs(a);
        if (number == 0) {
            System.out.println("Вы пытаетесь разложить 0 на простые множители");
            return result;
        }
        do {
            isChange = false;
            if (number % 2 == 0) {
                result.add(2);
                number /= 2;
                isChange = true;
            } else {
                for (int i = 3; i <= Math.sqrt(number); i = i + 2) {
                    if (number % i == 0) {
                        result.add(i);
                        number /= i;
                        isChange = true;
                        break;
                    }
                }
            }
        } while (isChange);
        result.add(1);
        result.add(number);
        Collections.sort(result);
        return result;
    }

    static Map<Integer, Integer> mapPrimeFactorization(int a) {
        List<Integer> list = primeFactorization(a);
        Map<Integer, Integer> primeMap = new HashMap<>();
        for (Integer i : list) {
            if (primeMap.containsKey(i)) {
                primeMap.put(i, primeMap.get(i) + 1);
            } else {
                primeMap.put(i, 1);
            }
        }
        return primeMap;
    }


}