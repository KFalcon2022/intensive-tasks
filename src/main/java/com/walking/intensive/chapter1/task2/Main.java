package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(getFlatLocation(3, 1, 25));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int maxFlatFloor = 4;
        if (flatNumber <= 0 || flatNumber > floorAmount * maxFlatFloor) {
            System.out.printf("Сожалеем в %d подезде, на этаже %d, нет квартиры %d, искомая ", entranceAmount, floorAmount, flatNumber);
        }
        int entrance = (flatNumber - 1) / (floorAmount * maxFlatFloor) + 1;
        int floor = ((flatNumber - 1) % (floorAmount * maxFlatFloor)) / maxFlatFloor + 1;

        String position = getString(flatNumber);

        return String.format("квартира %d расположена в %d подезде, на %d этаже , %s", flatNumber, entrance, floor, position);
    }

    private static String getString(int flatNumber) {
        String position = null;
        String floorPosition1 = "слева от лифта, влево";
        String floorPosition2 = "слева от лифта, вправо";
        String floorPosition3 = "справа от лифта, влево";
        String floorPosition4 = "справа от лифта, вправо";

        if (flatNumber % 4 == 1) {
            position = floorPosition1;
        } else if (flatNumber % 4 == 2) {
            position = floorPosition2;
        } else if (flatNumber % 4 == 3) {
            position = floorPosition3;
        } else if (flatNumber % 4 == 0) {
            position = floorPosition4;
        }
        return position;
    }
}