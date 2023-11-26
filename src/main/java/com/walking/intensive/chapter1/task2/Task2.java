package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */

public class Task2 {
    public static void main(String[] args) {
        // String result = getFlatLocation(6, 8, 328);
        // System.out.println(result);
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flatPerFloor = 4;
        int flatTotal = floorAmount * flatPerFloor * entranceAmount;
        int flatsPerEntrance = floorAmount * flatPerFloor;

        if (flatNumber <= flatTotal && flatNumber > 0) {
            int entrance = (flatNumber - 1) / flatsPerEntrance + 1;
            int floor = ((flatNumber - 1) % (floorAmount * flatPerFloor)) / flatPerFloor + 1;
            int flatPosition = (flatNumber - 1) % flatPerFloor;

            String flatLocation = switch (flatPosition) {
                case 0 -> "слева от лифта, влево";
                case 1 -> "слева от лифта, вправо";
                case 2 -> "справа от лифта, влево";
                case 3 -> "справа от лифта, вправо";
                default -> "";
            };

            return String.format("%d кв - %d подъезд, %d этаж, %s", flatNumber, entrance, floor, flatLocation);

        } else {
            return "Такой квартиры нет";
        }
    }
}