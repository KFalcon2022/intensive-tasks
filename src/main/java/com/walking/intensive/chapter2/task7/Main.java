package com.walking.intensive.chapter2.task7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(friendNumber(1000000));
        System.out.println(friendNumber(300));
    }

    static int friendNumber(int N) {
        if (N < 0 || N > 1000000) {
            System.out.println("Число вне диапазона");
            return 0;
        }
        for (int i = N; i >= 1; i--) {
            if (calculateNumber(calculateNumber(i)) == i) {
                return i;
            }
        }
        return 0;
    }

    static int calculateNumber(int cycle) {
        int number = 0;
        for (int i = 1; i < cycle; i++) {
            if (cycle % i == 0 && number != i) {
                number += i;
            }

        }
        return number;
    }

}