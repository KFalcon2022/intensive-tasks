package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

    int floorAmount = 2;
    int entranceAmount = 3;
    int flatNumber = 23;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
}

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int flatCountInFloor = 4;
        int flatCountInHouse = flatCountInFloor * floorAmount * entranceAmount;
        int flatCountInEntrance = flatCountInFloor * floorAmount;

        if (flatNumber > flatCountInHouse || flatNumber <= 0) {
            return "Такой квартиры в этом доме нет";
        }

        int entrance = (flatNumber - 1) / flatCountInEntrance + 1;
        int floor = ((flatNumber - 1) % flatCountInEntrance) / flatCountInFloor + 1;

        String direction;
        String sideFromElevator;

        if (flatNumber % 2 == 0) {
            direction = "вправо";
        } else {
            direction = "влево";
        }

        if (flatNumber % 2 != 0 && (flatNumber + 1) % 4 == 0 || flatNumber % 4 == 0) {
            sideFromElevator = "справа от лифта";
        } else {
            sideFromElevator = "слева от лифта";
        }
        return String.format("%d подъезд, %d этаж, %s, %s",
                entrance, floor, sideFromElevator, direction);
    }
}