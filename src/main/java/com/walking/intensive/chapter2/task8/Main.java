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
            int b = (i / 10000 % 10);
            int c = (i / 1000 % 10);
            int d = (i / 100 % 10);
            int e = (i / 10 % 10);
            int f = i % 10;
            if ((a + b + c) == (d + e + f)) {
                winCount++;
            }
        }


        System.out.println(winCount);
        return (double) winCount / 1000000;
    }
}