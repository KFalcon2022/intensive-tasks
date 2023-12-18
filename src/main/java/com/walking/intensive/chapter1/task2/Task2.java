package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.println(getFlatLocation(-10, -3, 40));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        final int FLATS_ON_THE_FLOOR = 4;
        int totalFlatQty = floorAmount * FLATS_ON_THE_FLOOR * entranceAmount;

        if (floorAmount <= 0 || entranceAmount <= 0
                || flatNumber <= 0 || flatNumber > totalFlatQty) {
            return "Такой квартиры не существует";
        }

        int setEntrance = 1 + (int) Math.floor((double) flatNumber / (floorAmount * FLATS_ON_THE_FLOOR + 1));

        int maxFlatInCurrentEntrance = setEntrance * floorAmount * FLATS_ON_THE_FLOOR;

        int setFloor = floorAmount;

        while (maxFlatInCurrentEntrance - 3 > flatNumber) {
            setFloor = setFloor - 1;
            maxFlatInCurrentEntrance = maxFlatInCurrentEntrance - FLATS_ON_THE_FLOOR;
        }

        String leftOrRight = "";
        switch (flatNumber % FLATS_ON_THE_FLOOR) {
            case 1 -> leftOrRight = ", слева от лифта, влево";
            case 2 -> leftOrRight = ", слева от лифта, вправо";
            case 3 -> leftOrRight = ", справа от лифта, влево";
            case 0 -> leftOrRight = ", справа от лифта, вправо";
        }

        return flatNumber + " кв - " + setEntrance + " подъезд, " + setFloor + " этаж" + leftOrRight;
    }
}