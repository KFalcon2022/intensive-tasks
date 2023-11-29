package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
//Добираясь в школу на трамвае Вова проверяет, является ли купленный билет счастливым. Если является, то нужно загадать желание и съесть билетик.
//        Билет содержит 6 цифр, комбинации подбираются случайным образом от 000000 до 999999.
//        Билет считается счастливым, если сумма первых трех цифр равна сумме последних трех цифр.
//        Пример: 123411 – счастливый (1 + 2 + 3 = 4 + 1 + 1)
//        Найдите вероятность выпадения счастливого билета.
//        P.S. Вероятность – это отношение благоприятных исходов к числу всех исходов. Вероятность не может принимать значение больше 1.
public class Task8 {

    public static void main(String[] args) {
        System.out.println(getHappyTicketChance(999999));
    }

    static double getHappyTicketChance(int ticketNumber) {
        double counter = 0;
        for (int i = 0; i <= ticketNumber; i++) {
            if (isTicketHappy(i)) {
                counter++;
            }
        }
        return counter / ticketNumber * 100.00;

    }

    static boolean isTicketHappy(int ticketNumber) {
        int firstHalf = ticketNumber / 1000;
        int secondHalf = ticketNumber % 1000;
        return (firstHalf % 10 + (firstHalf % 100) / 10 + (firstHalf % 1000) / 100) == (secondHalf % 10 + (secondHalf % 100) / 10 + (secondHalf % 10000) / 100);
    }
}