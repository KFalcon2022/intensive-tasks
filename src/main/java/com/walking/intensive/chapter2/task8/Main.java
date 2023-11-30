package src.main.java.com.walking.intensive.chapter2.task8;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вероятность выпадения счастливого билета с в диапазоне номеров от 000000 до 999999: " + getSuccessProbability());
    }

    public static boolean isLuckyTicket(int ticketNumber) {
        boolean result = false;
        int divisor = 10;
        int firstHalfSum = 0;
        int secondHaldSum = 0;

        for (int i = 0; i <= 5; i++) {
            if (i < 3) {
                firstHalfSum += ticketNumber / (int) Math.pow(divisor, i) % divisor;
            } else {
                secondHaldSum += ticketNumber / (int) Math.pow(divisor, i) % divisor;
            }
        }

        if (firstHalfSum == secondHaldSum) {
            result = true;
        }

        return result;
    }

    public static float getSuccessProbability() {
        int ticketNumberLimit = 999999;
        int successCount = 0;

        for (int i = 0; i <= ticketNumberLimit; i++) {
            if (isLuckyTicket(i)) {
                successCount++;
            }
        }

        return (float) successCount / ticketNumberLimit;
    }
}