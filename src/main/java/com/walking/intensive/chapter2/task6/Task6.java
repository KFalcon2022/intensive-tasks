package com.walking.intensive.chapter2.task6;

public class Task6 {
    public static void main(String[] args) {
        int a = 18, b = 48;
        System.out.println("НОК: " + getNOK(a, b));
        System.out.println("НОД: " + getNOD(a, b));
    }

    static int getNOK(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (a * b) / getNOD(a, b);
    }

    static int getNOD(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        int biggest = Math.max(a, b);
        int lowest = Math.min(a, b);

        int remainder = biggest % lowest;
        if (remainder == 0) {
            return lowest;
        }
        return getNOD(lowest, remainder);
    }
}