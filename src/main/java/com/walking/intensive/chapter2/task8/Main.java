package com.walking.intensive.chapter2.task8;

public class Main {
    public static void main(String[] args) {

        System.out.println(getChanceHappyTicket(0));

    }

    public static double getChanceHappyTicket(int tickets){

        return  (double) getCountHappyTicket(tickets) / 1_000_000;
    }

    public static int getCountHappyTicket(int tickets){

        int count = 0;

        for (int i = 1000; i < 1_000_000; i++){
            if (isTotalEqual(i)){
                count ++;
            }
        }

        return count;
    }

    public static boolean isTotalEqual(int number){

        if (number < 10_000){
            return (number / 1000) == (number / 100 % 10 + number / 10 % 10 + number % 10);
        }

        if (number < 100_000){
           return (number / 10000 + number / 1000 % 10) == (number / 100 % 10 + number / 10 % 10 + number % 10);
        }

        if (number < 1_000_000){
            return (number / 100000 + number / 10000 % 10 + number / 1000 % 10) == (number / 100 % 10 + number / 10 % 10 + number % 10);
        }

        return false;

    }
}