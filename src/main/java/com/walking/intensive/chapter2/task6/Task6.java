package com.walking.intensive.chapter2.task6;

public class Task6 {
    public static void main(String[] args) {

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
}