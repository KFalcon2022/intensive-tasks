package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance());
    }

    static int getDigitsSum(int n){
        String strN = String.valueOf(n);
        int result=0;
        for (int i=0; i<strN.length(); i++){
            result += Integer.parseInt(String.valueOf(strN.charAt(i)));
        }
        return result;
    }

    static double getHappyTicketChance() {
        double[] probabilities = new double[28];
        double result = 0;
        for (int i=0; i<=999; i++){
            probabilities[getDigitsSum(i)]++;
        }
        for (int i=0; i<=13; i++){
            result += 2*Math.pow(probabilities[i]/1000, 2);
        }
        return result;
    }
}