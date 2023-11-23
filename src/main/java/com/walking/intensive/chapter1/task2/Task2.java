package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе1

        System.out.println(getFlatLocation(2, 2, 5));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода
        int flatAmount = floorAmount * entranceAmount * 4;
        int flatsPerEntranceAmount = floorAmount * 4;
        int numberOfEntrance = (int) Math.ceil((double)flatNumber / flatsPerEntranceAmount);
        int numberOfFloor = (int) Math.ceil((flatNumber - (numberOfEntrance - 1) * flatsPerEntranceAmount) / 4.0);

        if (flatNumber > flatAmount || flatNumber <= 0) {
            return "Такой квартиры не существует";
        } else if (flatNumber == 1 || flatNumber % 4 == 1) {
            return flatNumber + " кв - " + numberOfEntrance + " подъезд, " + numberOfFloor + " этаж, " + "слева от лифта, влево";
        } else if (flatNumber == 2 || flatNumber % 4 == 2) {
            return flatNumber + " кв - " + numberOfEntrance + " подъезд, " + numberOfFloor + " этаж, " + "слева от лифта, вправо";
        } else if (flatNumber == 3 || flatNumber % 4 == 3) {
            return flatNumber + " кв - " + numberOfEntrance + " подъезд, " + numberOfFloor + " этаж, " + "справа от лифта, влево";
        } else
            return flatNumber + " кв - " + numberOfEntrance + " подъезд, " + numberOfFloor + " этаж, " + "справа от лифта, вправо";
    }
}