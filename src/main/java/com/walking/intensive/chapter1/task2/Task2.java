package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {

    public static void main(String[] args) {

        System.out.println(getFlatLocation(10, 3, 40));
        System.out.println(getFlatLocation(-10, -3, 40));
        System.out.println(getFlatLocation(10, 3, 121));
    }

    static int getFloor(int floorAmount, int flatNumber) {
        int setFloor = floorAmount;
        int maxFlat = getEntrance(floorAmount, flatNumber) * floorAmount * 4;
        while (maxFlat - 3 > flatNumber) {
            setFloor = setFloor - 1;
            maxFlat = maxFlat - 4;
        }
        return setFloor;
    }

    static int getEntrance(int floorAmount, int flatNumber) {
        int setEntrance = 1;

        while ((setEntrance * floorAmount * 4) < flatNumber) {
            setEntrance++;
        }
        return setEntrance;
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        if (floorAmount <= 0 || entranceAmount <= 0 || flatNumber <= 0) return "Такой квартиры не существует";

        int totalFlatQty = floorAmount * 4 * entranceAmount;

        if (flatNumber > totalFlatQty || flatNumber <= 0) {
            return "Такой квартиры не существует";
        }
        String leftOrRight = "";
        switch (flatNumber % 4) {
            case 1 -> leftOrRight = ", слева от лифта, вправо";
            case 2 -> leftOrRight = ", слева от лифта, влево";
            case 3 -> leftOrRight = ", справа от лифта, вправо";
            case 0 -> leftOrRight = ", справа от лифта, влево";
        }

        return flatNumber + " кв - " + getEntrance(floorAmount, flatNumber) + " подъезд, "
                + getFloor(floorAmount, flatNumber) + " этаж" + leftOrRight;
    }
}