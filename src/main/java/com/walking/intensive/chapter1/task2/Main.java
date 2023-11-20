package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {


    public static void main(String[] args) {
        int floorAmount = 4;
        int entranceAmount = 2;
        int flatFloorCount = 4;
        int maxFlatNumber = floorAmount * entranceAmount * flatFloorCount;

        for (int i = 0; i <= maxFlatNumber; i++) {
            System.out.println(getFlatLocation(floorAmount, entranceAmount, i, flatFloorCount));
        }
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber, int flatFloorCount) {

        if (floorAmount * flatFloorCount * entranceAmount >= flatNumber && flatNumber > 0) {
            int flatAmountAtEntrance = floorAmount * flatFloorCount;

            int entranceNumber = (flatNumber - 1) / flatAmountAtEntrance + 1;
            int floorNumber = ((flatNumber - 1) % flatAmountAtEntrance) / flatFloorCount + 1;

            return flatNumber + " кв – " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + getFlatPosition(flatNumber, flatFloorCount);
        }
        return "Такой квартиры в доме нет";
    }

    static String getFlatPosition(int flatNumber, int flatFloorCount) {
        return switch (flatNumber % flatFloorCount) {
            case 0 -> "вправо от лифта, вправо";
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            default -> "вправо от лифта, влево";
        };
    }
}