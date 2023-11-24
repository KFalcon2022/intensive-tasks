package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 * //учусь пушить в гит после обновления основного репазитория
 */
public class Task2 {
    public static void main(String[] args) {
        int floorAmount = 10;
        int entranceAmount = 3;
        int flatNumber = 88;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation( int floorAmount, int entranceAmount, int flatNumber) {
        int flatsPerFloor = 4;
        int totalFlatsPerEntrance = flatsPerFloor * floorAmount;
        int totalFlats = totalFlatsPerEntrance * entranceAmount;

        if (flatNumber < 1 || flatNumber > totalFlats) {
            return "Такой квартиры не существует";
        }

        int entrance = (flatNumber - 1) / totalFlatsPerEntrance + 1;
        int floorWithinEntrance = (flatNumber - 1) % totalFlatsPerEntrance;
        int floor = floorWithinEntrance / flatsPerFloor + 1;
        int flatPositionWithinFloor = floorWithinEntrance % flatsPerFloor;

        String position = switch (flatPositionWithinFloor) {
            case 0 -> "слева от лифта, влево";
            case 1 -> "слева от лифта, вправо";
            case 2 -> "справа от лифта, влево";
            case 3 -> "справа от лифта, вправо";
            default -> throw new IllegalStateException("Unexpected value: " + flatPositionWithinFloor);
        };

        return flatNumber + " кв - " + entrance + " подъезд, " + floor + " этаж, " + position;
    }
}