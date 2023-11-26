package com.walking.intensive.chapter2.task6;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNOD(40, 60));
        System.out.println(getNOK(40, 60));
    }

    public static int getNOK(int a, int b) {
        return (a * b) / getNOD(a, b);
    }

    public static int getNOD(int a, int b) {
        if (b == 0)
            return a;
        else
            return getNOD(b, a % b);
    }
}
