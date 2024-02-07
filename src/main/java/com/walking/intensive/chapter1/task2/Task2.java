package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static final int FLATS_QUANTITY = 4;

    public static void main(String[] args) {

        System.out.println(getFlatLocation(11, 2, 41));
        System.out.println(getFlatLocation(10, 3, 88));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        if (floorAmount < 0 || entranceAmount < 0 || flatNumber < 0) {
            return "Такой квартиры не существует";
        }

        int minFlatOnFloor = floorAmount * FLATS_QUANTITY - 3;
        int maxFlatOnFloor = floorAmount * FLATS_QUANTITY;

        if (flatNumber >= minFlatOnFloor && flatNumber <= maxFlatOnFloor) {

            int flatValue = flatNumber % 4;

            switch (flatValue) {
                case 1 -> {
                    return flatNumber + " кв - " + entranceAmount + " подъезд, " + floorAmount + " этаж, слева от лифта, влево";
                }
                case 2 -> {
                    return flatNumber + " кв - " + entranceAmount + " подъезд, " + floorAmount + " этаж, слева от лифта, вправо";
                }
                case 3 -> {
                    return flatNumber + " кв - " + entranceAmount + " подъезд, " + floorAmount + " этаж, справа от лифта, влево";
                }
                case 0 -> {
                    return flatNumber + " кв - " + entranceAmount + " подъезд, " + floorAmount + " этаж, справа от лифта, вправо";
                }
                default -> {
                    return "Такой квартиры не существует";
                }
            }
        }
        return "Такой квартиры не существует";
    }
}