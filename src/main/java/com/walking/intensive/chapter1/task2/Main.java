package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {

    public static final int FLATS_PER_FLOOR = 4;

    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(1,4,5));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int totalFlats = entranceAmount * floorAmount * FLATS_PER_FLOOR;

        if (flatNumber > totalFlats || flatNumber < 1) {
            return "Квартиры с таким номером в этом доме нет.";
        }

        String direction;
        if (flatNumber % 4 == 1) {
            direction = "слева от лифта, влево";
        } else if (flatNumber % 4 == 2) {
            direction = "слева от лифта, вправо";
        } else if (flatNumber % 4 == 3) {
            direction = "справа от лифта, влево";
        } else {
            direction = "справа от лифта, вправо";
        }

        int entranceNum = (int) Math.ceil(flatNumber / (double)(FLATS_PER_FLOOR * floorAmount));
        int floorNum = (int) Math.ceil(entranceNum / (double)FLATS_PER_FLOOR);


        return String.format("%d подъезд, %d этаж, %s", entranceNum, floorNum, direction);
    }
}