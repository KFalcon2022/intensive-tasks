package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(findGCD(4,5));
        System.out.println(findLCM(4,5));
    }

    public static int findLCM(int num1, int num2) {
        int maxNum = Math.max(num1, num2);
        int lcm = maxNum;

        while (lcm % num1 != 0 || lcm % num2 != 0) {
            lcm += maxNum;
        }

        return lcm;
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }

    static int getNoc(int m, int n) {
        // Ваш код
        return 0;
    }

    static int getNod(int m, int n) {
        // Ваш код
        return 0;
    }

    static int getNodByEuclideanAlgorithm(int m, int n){
        // Ваш код
        return 0;
    }

}