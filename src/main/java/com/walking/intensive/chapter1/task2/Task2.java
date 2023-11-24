package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
        int floor = 10;
        int entrance = 3;
        int flatNumber = 41;
        System.out.println(getFlatLocation(floor, entrance, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        if (flatNumber > (floorAmount * entranceAmount * 4) || flatNumber < 0){
            return "Такой квартиры не существует";
        }

        int flatPerEntrance = 4 * floorAmount;
        int entrance = (flatNumber - 1) / flatPerEntrance + 1;
        int floor = ((flatNumber - 1) % flatPerEntrance) / 4 + 1;

        String s = switch (flatNumber % 4) {
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "справа от лифта, влево";
            default -> "справа от лифта, вправо";
        };

        return String.format("%d кв - %d подъезд, %d этаж, %s", flatNumber, entrance, floor, s);
    }
}