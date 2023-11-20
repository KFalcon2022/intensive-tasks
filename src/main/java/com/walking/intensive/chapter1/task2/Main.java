package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        String test1 = getFlatLocation(5, 2, 21);
        String test2 = getFlatLocation(5, 2, 41);
        System.out.println(test1);
        System.out.println();
        System.out.println(test2);
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        final int totalFlatFloor = 4;
        int totalFlatsEntrance = floorAmount * totalFlatFloor; // итого квартир в подъезде

        if (flatNumber < 1 || flatNumber > (entranceAmount * totalFlatsEntrance)) {
            return "Квартиры с таким номером в доме нет";
        }

        int entranceNumber;

        if (flatNumber % totalFlatsEntrance == 0) {
            entranceNumber = flatNumber / totalFlatsEntrance;
        } else {
            entranceNumber = flatNumber / totalFlatsEntrance + 1;
        }

        int floorNumber;

        if (flatNumber % totalFlatFloor == 0) {
            floorNumber = (flatNumber / totalFlatFloor) - floorAmount * (entranceNumber - 1);
        } else {
            floorNumber = (flatNumber / totalFlatFloor + 1) - floorAmount * (entranceNumber - 1);
        }

        String flatLocation = switch (flatNumber % totalFlatFloor) { // расположение относительно лифта
            case (0) -> "справа от лифта, вправо";
            case (1) -> "слева от лифта, влево";
            case (2) -> "слева от лифта, вправо";
            case (3) -> "справа от лифта, влево";
            default -> "";
        };

        return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + flatLocation;
    }
}