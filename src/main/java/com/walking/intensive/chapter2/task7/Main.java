package com.walking.intensive.chapter2.task7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(friendNumber(1000000));
    }

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

}