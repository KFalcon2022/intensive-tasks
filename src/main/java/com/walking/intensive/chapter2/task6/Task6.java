package com.walking.intensive.chapter2.task6;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("НОК: " + getSmallestCommonMultiple(12, 18));
        System.out.println("НОД: " + getGreatestCommonDivisor(12, 18));
        System.out.println("НОД по Евклиду: " + getEuclidCommonDivisor(12, 18));
    }

    public static int getSmallestCommonMultiple(int first, int second) throws IllegalArgumentException {

        if (first == 0 || second == 0) {
            throw new IllegalArgumentException("Значение чисел не может быть равно 0.");
        }

        int modfirst = Math.abs(first);
        int modsecond = Math.abs(second);
        int max = Math.max(modfirst, modsecond);

        while (max % modfirst != 0 || max % modsecond != 0) {
            max++;
        }
        return max;
    }

    public static int getGreatestCommonDivisor(int first, int second) throws IllegalArgumentException {

        if (first == 0 || second == 0) {
            throw new IllegalArgumentException("Значение чисел не может быть равно 0.");
        }

        int modfirst = Math.abs(first);
        int modsecond = Math.abs(second);
        return modfirst * modsecond / getSmallestCommonMultiple(modfirst, modsecond);
    }

    public static int getEuclidCommonDivisor(int first, int second) throws IllegalArgumentException {

        if (first == 0 || second == 0) {
            throw new IllegalArgumentException("Значение чисел не может быть равно 0.");
        }

        int modfirst = Math.abs(first);
        int modsecond = Math.abs(second);

        while (modfirst % modsecond != 0) {
            modfirst = modfirst % modsecond;
            modsecond = modfirst + modsecond - (modfirst = modsecond);
        }
        return modsecond;
    }
}
