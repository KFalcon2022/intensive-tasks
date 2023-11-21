package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        String location = getFlatLocation(10, 3, 88);
        System.out.println(location);

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        final int flatsPerFloor = 4;
        int totalFlats = floorAmount * entranceAmount * flatsPerFloor;

        if (flatNumber < 1 || flatNumber > totalFlats) {
            return "Такой квартиры нет";
        }

        int flatIndex = flatNumber - 1;

        int entrance = flatIndex / totalFlats + 1;
        int floor = (flatIndex % totalFlats) / flatsPerFloor + 1;

        String positionDescription = switch (flatIndex % flatsPerFloor) {
            case 0 -> "слева от лифта, влево";
            case 1 -> "слева от лифта, вправо";
            case 2 -> "справа от лифта, влево";
            case 3 -> "справа от лифта, вправо";
            default -> "";
        };

        return String.format("%d кв - %d подъезд, %d этаж, %s", flatNumber, entrance, floor, positionDescription);
    }
}