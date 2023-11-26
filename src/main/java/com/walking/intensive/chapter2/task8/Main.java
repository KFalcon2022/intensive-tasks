package com.walking.intensive.chapter2.task8;

public class Main {
    public static void main(String[] args) {
        System.out.println(probabilityOfWin());

    }

    static double probabilityOfWin() {
        int winCount = 0;

// a*100000+b*10000+c*1000+d*100+e*10+f

        for (int i = 0; i < 1000000; i++) {
            int a = i / 100000;
            int b = (i / 10000 - 10 * a);
            int c = (i / 1000 - 100 * a - 10 * b);
            int d = (i / 100 - 1000 * a - 100 * b - 10 * c);
            int e = (i / 10 - 10000 * a - 1000 * b - 100 * c - 10 * d);
            int f = i % 10;
            if ((a+b+c)==(d+e+f)) {
                winCount++;
            }
        }


        System.out.println(winCount);
        return (double) winCount/ 1000000;
    }
}