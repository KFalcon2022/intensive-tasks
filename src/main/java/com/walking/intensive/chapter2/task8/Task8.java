package main.java.com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {

    }

    static double getHappyTicketChance(int ticketNumber) {
        int numsOfCoincidences = 0;

        for (int i = 0; i < 1000; i++) {
            int sumI = (i % 10) + (i % 100 - i % 10) + (i / 100);

            for (int j = 0; j < 1000; j++) {
                int sumJ = (j % 10) + (j % 100 - j % 10) + (j / 100);

                if (sumI == sumJ) {
                    numsOfCoincidences++;
                }
            }
        }
        return (double) numsOfCoincidences / Math.pow(10, 6);
    }
}
