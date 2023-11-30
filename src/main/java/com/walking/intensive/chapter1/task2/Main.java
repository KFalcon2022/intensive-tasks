package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getFlatLocation(9, 4, 36));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flatsOnFloor = 4;

        if ((floorAmount * flatsOnFloor * entranceAmount < flatNumber) || flatNumber < 0) {
            return "Такой квартиры не существует";
        }

        int actualFloor = ((flatNumber - 1) / (flatsOnFloor)) % floorAmount + 1;
        int actualEntrance = (flatNumber - 1) / (entranceAmount * floorAmount) + 1;

        switch (flatNumber % flatsOnFloor) {
            case 0:
                return flatNumber + " кв - " + actualEntrance + " подъезд, " + actualFloor + " этаж, "
                        + "справа от лифта, вправо";
            case 1:
                return flatNumber + " кв - " + actualEntrance + " подъезд, " + actualFloor + " этаж, "
                        + "слева от лифта, влево";
            case 2:
                return flatNumber + " кв - " + actualEntrance + " подъезд, " + actualFloor + " этаж, "
                        + "слева от лифта, вправо";
            case 3:
                return flatNumber + " кв - " + actualEntrance + " подъезд, " + actualFloor + " этаж, "
                        + "справа от лифта, влево";
        }
        return null;
    }
}