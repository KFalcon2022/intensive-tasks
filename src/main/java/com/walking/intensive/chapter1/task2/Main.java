package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    final static int FLAT_COUNT_AT_FLOOR = 4;

    public static void main(String[] args) {
        int FLOOR_AMOUNT = 4;
        int ENTRANCE_AMOUNT = 2;
        int maxFlatNumber = FLOOR_AMOUNT * ENTRANCE_AMOUNT * FLAT_COUNT_AT_FLOOR;
        for (int i = 0; i <= maxFlatNumber; i++) {
            System.out.println(getFlatLocation(FLOOR_AMOUNT, ENTRANCE_AMOUNT, i));
        }
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        if (floorAmount * FLAT_COUNT_AT_FLOOR * entranceAmount >= flatNumber && flatNumber > 0) {
            int flatAmountAtEntrance = floorAmount * FLAT_COUNT_AT_FLOOR;
            for (int entranceNumber = 1; entranceNumber < entranceAmount + 1; entranceNumber++) {
                for (int floorNumber = 1; floorNumber < floorAmount + 1; floorNumber++) {
                    int currentMaxFLatNumberAtFloor = (entranceNumber - 1) * flatAmountAtEntrance + floorNumber * FLAT_COUNT_AT_FLOOR;

                    if (currentMaxFLatNumberAtFloor >= flatNumber)
                        return flatNumber + " кв – " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + getFlatPosition(flatNumber);
                }
            }
        }
        return "Такой квартиры в доме нет";
    }

    static String getFlatPosition(int flatNumber) {
        return switch (flatNumber % FLAT_COUNT_AT_FLOOR) {
            case 0 -> "вправо от лифта, вправо";
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            default -> "вправо от лифта, влево";
        };
    }
}