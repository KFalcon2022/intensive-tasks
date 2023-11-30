package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {

        int floorAmount = 5;
        int entranceAmount = 3;
        int flatNumber = 20;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        if ((floorAmount * 4 * entranceAmount < flatNumber) || flatNumber < 0) {
            return "Такой квартиры не существует";
        }

        int entranceNumber = (int) Math.ceil((double) flatNumber / (floorAmount * 4));
        int floorNumber;

        if (flatNumber % (floorAmount * 4) == 0) {
            floorNumber = floorAmount;
        } else {
            floorNumber = (int) Math.ceil((double) (flatNumber % (floorAmount * 4)) / 4);
        }

        switch (flatNumber % 4) {
            case 0:
                return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, "
                        + "справа от лифта, вправо";
            case 1:
                return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, "
                        + "слева от лифта, влево";
            case 2:
                return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, "
                        + "слева от лифта, вправо";
            case 3:
                return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, "
                        + "справа от лифта, влево";
        }
        return null;
    }
}