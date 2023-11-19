package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        String location = getFlatLocation(1, 1, 4);
        System.out.println(location);

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flatsPerFloor = 4;
        int totalFlats = floorAmount * entranceAmount * flatsPerFloor;

        if (flatNumber < 1 || flatNumber > totalFlats) {
            return "Такой квартиры нет";
        }

        int flatIndex = flatNumber - 1;
        int flatsPerEntrance = floorAmount * flatsPerFloor;

        int entrance = flatIndex / flatsPerEntrance + 1;
        int floor = (flatIndex % flatsPerEntrance) / flatsPerFloor + 1;
        String[] positions = {
                "слева от лифта, влево", "слева от лифта, вправо",
                "справа от лифта, влево", "справа от лифта, вправо"};
        String positionDescription = positions[flatIndex % flatsPerFloor];

        return String.format("%d кв - %d подъезд, %d этаж, %s",flatNumber, entrance, floor, positionDescription);
    }
}