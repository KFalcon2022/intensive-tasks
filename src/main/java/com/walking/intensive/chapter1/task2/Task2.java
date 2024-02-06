package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.println(getFlatLocation(9, 2, 41));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        if (floorAmount < 0 || entranceAmount < 0 || flatNumber < 0) {
            return "Такой квартиры не существует";
        }

        int flatValue = flatNumber;
        int quantityOfFlatsOnFloor = 4;

        if (floorAmount > 1) {
            flatValue = flatNumber - ((floorAmount - 1) * quantityOfFlatsOnFloor);
        }

        switch (flatValue) {
            case 1 -> {
                return flatNumber + " кв - " + entranceAmount + " подъезд, " + floorAmount + " этаж, слева от лифта, влево";
            }
            case 2 -> {
                return flatNumber + " кв - " + entranceAmount + " подъезд, " + floorAmount + " этаж, слева от лифта, вправо";
            }
            case 3 -> {
                return flatNumber + " кв - " + entranceAmount + " подъезд, " + floorAmount + " этаж, справа от лифта, влево";
            }
            case 4 -> {
                return flatNumber + " кв - " + entranceAmount + " подъезд, " + floorAmount + " этаж, справа от лифта, вправо";
            }
            default -> {
                return "Такой квартиры не существует";
            }
        }
    }
}