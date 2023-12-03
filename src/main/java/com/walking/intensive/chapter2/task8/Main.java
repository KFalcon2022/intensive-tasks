package com.walking.intensive.chapter2.task8;

public class Main {
    public static void main(String[] args) {
        System.out.println(getChanceHappyTicket(0));

    }

    public static double getChanceHappyTicket(int tickets){

        return  (double) getCountHappyTicket(tickets) / 999_999;
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
            return (number / 1000) == getTotal1000(number);
        }

        if (number < 100_000){
           return (number / 10000 + number / 1000 % 10) == getTotal1000(number);
        }

        if (number < 1_000_000){
            return getTotalFirst1000(number) == getTotal1000(number);
        }

        return false;

    }

    public static int getTotal1000(int number){

        return (number / 100 % 10 + number / 10 % 10 + number % 10);
    }

    public static int getTotalFirst1000(int number){

        return (number / 100000 + number / 10000 % 10 + number / 1000 % 10);
    }

}