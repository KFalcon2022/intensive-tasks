package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(10, 3, -1));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flatAmount = 4 * floorAmount * entranceAmount;
        if (flatNumber > flatAmount || flatNumber <= 0) {
            return "Такой квартиры не существует";
        }
        int entranceNumber = (int) (Math.ceil((double) flatNumber / 4 / floorAmount));
        int floorNumber = ((int) (Math.ceil((double) flatNumber / 4))) % floorAmount;
        if (floorNumber == 0) {
            floorNumber = floorAmount;
        }
        String direction = "";
        switch (flatNumber % 4) {
            case (1):
                return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + "слева от лифта, влево";
                break;
            case (2):
                return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + "слева от лифта, вправо";
                break;
            case (3):
                return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + "справа от лифта, влево";
                break;
            case (0):
                return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + "справа от лифта, вправо";
                break;
        }

    }
}
