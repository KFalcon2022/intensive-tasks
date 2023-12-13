package main.java.com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {

    }

    static double getHappyTicketChance(int ticketNumber) {
        int happyTicketQuantity = 0;

        for (int i = 0; i <= 999999; i++) {
            int sumNumsOneThree = (i / 100000) + (i % 100000 / 10000) + (i % 10000 / 1000);
            int sumNumsFourSix =  i % 1000 / 100 + i % 100 / 10 + i % 10;
                if (sumNumsOneThree == sumNumsFourSix) {
                    happyTicketQuantity++;
                }
            }
        return (double) happyTicketQuantity / Math.pow(10, 6);
    }
}