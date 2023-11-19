package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int floorAmount = 10;
        int entranceAmount = 2;
        int flatNumber = 45;
        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        if (flatNumber > (floorAmount * entranceAmount * 4)) {
            return "такой квартиры в доме нет";
        }

        int flatFloor;
        int flatEachEntrance = floorAmount * 4;
        int flatEntrance;
        String roomSideFromElevator;
        String roomSide;

        flatEntrance = countFloor(flatNumber, flatEachEntrance);

        int restFlats = flatNumber - (flatEntrance - 1) * 4 * floorAmount;

        flatFloor = countFloor(restFlats, 4);

        int roomSideCount = restFlats - (flatFloor - 1) * 4;

        if (roomSideCount == 1 || roomSideCount == 2) {
            roomSideFromElevator = "слева";
        } else roomSideFromElevator = "справа";

        if (roomSideCount % 2 == 0) {
            roomSide = "вправо";
        } else roomSide = "влево";

        return flatEntrance + " подъезд, " + flatFloor + " этаж, " + roomSideFromElevator + " от лифта, " + roomSide;
    }

    static int countFloor(int flatNumber, int flatEachEntrance) {
        if (flatNumber % flatEachEntrance > 0) {
            return flatNumber / flatEachEntrance + 1;
        } else return flatNumber / flatEachEntrance;
    }
}