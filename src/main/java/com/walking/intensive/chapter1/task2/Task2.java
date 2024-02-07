package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static final int FLATS_QUANTITY = 4;

    public static void main(String[] args) {

        System.out.println(getFlatLocation(3, 2, 9));
        System.out.println(getFlatLocation(10, 3, 88));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        if (floorAmount < 1 || entranceAmount < 1 || flatNumber < 1) {
            return "Такой квартиры не существует";
        }

        int maxFlatNumber = entranceAmount * floorAmount * FLATS_QUANTITY;

        if (maxFlatNumber < flatNumber) {
            return "Такой квартиры не существует";
        }

        int floorValue = 0;
        int entranceValue = 0;
        int flatCount = 0;

        for (int i = 1; i <= entranceAmount; i++) {
            for (int j = 1; j <= floorAmount; j++) {
                for (int k = 1; k <= FLATS_QUANTITY; k++) {

                    flatCount++;
                    if (flatCount == flatNumber) {
                        floorValue = j;
                        entranceValue = i;
                        break;
                    }
                }
            }
        }

        int flatValue = flatNumber % 4;

        switch (flatValue) {
            case 1 -> {
                return flatNumber + " кв - " + entranceValue + " подъезд, " + floorValue + " этаж, слева от лифта, влево";
            }
            case 2 -> {
                return flatNumber + " кв - " + entranceValue + " подъезд, " + floorValue + " этаж, слева от лифта, вправо";
            }
            case 3 -> {
                return flatNumber + " кв - " + entranceValue + " подъезд, " + floorValue + " этаж, справа от лифта, влево";
            }
            case 0 -> {
                return flatNumber + " кв - " + entranceValue + " подъезд, " + floorValue + " этаж, справа от лифта, вправо";
            }
            default -> {
                return "Такой квартиры не существует";
            }
        }
    }
}
