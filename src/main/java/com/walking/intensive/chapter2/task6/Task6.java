package com.walking.intensive.chapter2.task6;

public class Task6 {
    public static void main(String[] args) {
        showNODandNOK(30, 18);
    }

    static int findNOD_Evklid(int a, int b) {
        if (b == 0) {
            return a;
        }

        return findNOD_Evklid(b, a % b);
    }

    static int findNok(int a, int b) {
        return a / findNOD_Evklid(a, b) * b;
    }

    static void showNODandNOK(int a, int b) {
        System.out.printf("Нод чисел %d и %d : %d  \n", a, b, findNOD_Evklid(a, b));
        System.out.printf("Нок чисел %d и %d : %d  ", a, b, findNok(a, b));
    }


}