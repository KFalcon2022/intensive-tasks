package com.walking.intensive.chapter2.task8;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Вероятность получения счастливого билета равна: " + getProbability() + "." + "\n" + "В процентах: " + getProbability() * 100 + "%.");
    }

    public static double getProbability() {
        int result = 0;

        for (int counter = 1; counter <= 999999; counter++) {
            if (getSum(counter) == 27) {
                result++;
            }
        }

        return result / 1000000.0;
    }

    private static int getSum(int counter) {
        if (counter / 10 < 1) {
            return counter;
        }

        return counter % 10 + getSum(counter / 10);
    }
}
