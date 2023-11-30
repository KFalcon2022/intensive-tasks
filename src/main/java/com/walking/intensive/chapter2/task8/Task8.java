package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {

    }

    static double getHappyTicketChance(int ticketNumber){
        int positiveresults = 0;
        for (int i = 0; i <= 999_999; i++)
        {
            if (isHappyTicket(i)) {
                positiveresults++;
            }
        }
        return positiveresults/1_000_000d;
    }

    static boolean isHappyTicket (int ticketNumber) {
        String stringTicketNumber = Integer.toString(ticketNumber);
        while (stringTicketNumber.length() < 6) {
            stringTicketNumber = "0" + stringTicketNumber;
        }
        return  (stringTicketNumber.charAt(0) + stringTicketNumber.charAt(1) + stringTicketNumber.charAt(2) == stringTicketNumber.charAt(3) + stringTicketNumber.charAt(4) + stringTicketNumber.charAt(5));
    }
}