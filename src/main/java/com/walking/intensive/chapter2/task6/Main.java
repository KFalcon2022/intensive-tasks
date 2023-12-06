package com.walking.intensive.chapter2.task6;

public class Main {
    public static void main(String[] args) {

        System.out.println(getNoc(97, 13));
        System.out.println(getNod(97, 13));
    }

    static int getNoc(int m, int n) {

        if (isCorrectInput(m, n)){

            return 0;
        }

        return (m * n) / getNod(m, n);
    }

    static int getNod(int m, int n) {

        if (isCorrectInput(m, n)){

            return 0;
        }

        int valueA = Math.max(m, n);
        int valueB = Math.min(m, n);

        if (valueA % valueB == 0){

            return valueB;
        }

        while (true) {

           int factorFromAB = valueA / valueB;
           int remainDiv = valueA - (factorFromAB * valueB);

            if (valueA % valueB == 0) {

                return valueB;
            }
            valueA = valueB;
            valueB = remainDiv;
        }
    }

    public static boolean isCorrectInput(int m, int n) {
        return m < 1 || n < 1;
    }

}