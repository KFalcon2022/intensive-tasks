package com.walking.intensive.chapter2.task8;

public class Main {
    public static void main(String[] args) {
        System.out.println(getProbability());
    }

    public static double getProbability() {
        double luckyWariants = 0;
        double allWariants = 1;
        for (int i = 0; i < 1000000; i++) {
            if (isTicketLucky(i)) {
                luckyWariants += 1;
            }
            allWariants += 1;
        }
        return luckyWariants / allWariants * 100;
    }

    public static boolean isTicketLucky(int ticket) {
        int firstsum = 0;
        int secondsum = 0;

        for (int i = 0; i < 3; i++) {
            firstsum = firstsum + ticket % 10;
            ticket = ticket / 10;
        }

        for (int i = 0; i < 3; i++) {
            secondsum = secondsum + ticket % 10;
            ticket = ticket / 10;
        }
        return firstsum == secondsum;
    }
}