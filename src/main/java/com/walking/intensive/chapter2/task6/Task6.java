package com.walking.intensive.chapter2.task6;

public class Task6 {
    public static void main(String[] args) {
        int a = 10, b = 100;
        System.out.println("Наибольший общий делитель " + a + " и " + b + " : " + getGreatestCommonDivisor(a, b));
        System.out.println("Наименьшее общее кратное " + a + " и " + b + " : " + getLeastCommonMultiple(a, b));
    }

    static int getGreatestCommonDivisor(int a, int b) { //НОД
        if (a % b == 0) {
            return b;
        }
        if (b % a == 0) {
            return a;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a; //я думал, стоит ли при НОД 1 писать, что это взаимно простые числа, и решил, что вроде это лишнее по условиям задачи
    }

    static int getLeastCommonMultiple(int a, int b) { //НОК
        return a * b * getGreatestCommonDivisor(a, b);
    }
}