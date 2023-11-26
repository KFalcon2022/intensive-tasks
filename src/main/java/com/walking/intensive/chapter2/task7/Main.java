package com.walking.intensive.chapter2.task7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //  System.out.println(friendNumber(1000000));
        // System.out.println(getDiviniterSum(284));
        System.out.println(primeFactorizationSet(2355));


    }

    //Не элегантное решение без массивов и прочего BRUTEFORCE!!!
    static int friendNumber(int N) {
        int m;
        int n;
        int temp;
        if (N < 0 || N > 1000000) {
            System.out.println("Число вне диапазона");
            return 0;
        }
        for (int i = N; i >= 1; i--) {
            m = i;
            n = 0;
            temp = 0;
            for (int j = 1; j < i; j++) {
                if (m % j == 0 && n != j) {
                    n += j;
                }
            }
            for (int j = 1; j < n; j++) {
                if (n % j == 0 && n != j) {
                    temp += j;
                }
            }
            if (temp == m) {
                return m;
            }

        }
        return 0;
    }

    // решение с блекджеком и сетами
    static Set<Integer> primeFactorizationSet(int a) {
        boolean isChange;
        Set<Integer> result = new TreeSet<>();
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
        return result;
    }

    static int getDiviniterSum(int a) {
        Set<Integer> set = primeFactorizationSet(a);
        Set<Integer> set2 = new TreeSet<>(set);
        Iterator<Integer> iter1 = set.iterator();
        Iterator<Integer> iter2 = set2.iterator();
        while (iter1.hasNext()) {
            while (iter2.hasNext()) {
                set.add(iter1.next() * iter2.next());
            }
        }
        System.out.println(set);
        return 0;


    }


}