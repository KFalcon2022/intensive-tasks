package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(getFlatLocation(4, 4, 44));
    }

    static String outcome = "";

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int flatAmount = floorAmount * entranceAmount * 4;
        int flatsInEntrance = floorAmount * 4;
        int positionOnFloor = flatNumber % 4;

        if (0 < flatNumber && flatAmount >= flatNumber) {
            outcome += (flatNumber + " кв - ");
        } else {
            return outcome = "Несуществующая квартира";
        }

        outcome += (((flatNumber - 1) / flatsInEntrance + 1) + " подъезд, " +
                (((flatNumber - 1) % flatsInEntrance) / 4 + 1) + " этаж, ");
        switch (positionOnFloor) {
            case (1):
                return outcome += ("слева от лифта, влево");
            case (2):
                return outcome += ("слева от лифта, вправо");
            case (3):
                return outcome += ("справа от лифта, влево");
            case (0):
                return outcome += ("справа от лифта, вправо");
        }
         return "Ошибка";
    }
}