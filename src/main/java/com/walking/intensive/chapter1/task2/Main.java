package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(getFlatLocation(2, 2, 1));
    }


    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        final int FLATS_PER_FLOOR = 4;
        int entrance = 1 + (flatNumber / (floorAmount * FLATS_PER_FLOOR));
        int floor = 1 + flatNumber / FLATS_PER_FLOOR;

        if ((flatNumber % (floorAmount * FLATS_PER_FLOOR)) == 0) {
            entrance -= 1;
        }

        if ((flatNumber % FLATS_PER_FLOOR) == 0) {
            floor -= 1;
        }

        if (floor > floorAmount) {
            floor = floor - floorAmount * (entrance - 1);
        }

        if (flatNumber <= 0 || entranceAmount < entrance) {
            return "Такой квартиры в доме нет";
        }

        int position = flatNumber % FLATS_PER_FLOOR;

        switch (position) {
            case (1):
                return entrance + " подъезд, " + floor + " этаж, слева от лифта, влево";
            case (2):
                return entrance + " подъезд, " + floor + " этаж, слева от лифта, вправо";
            case (3):
                return entrance + " подъезд, " + floor + " этаж, справа от лифта, влево";
        }
         return entrance + " подъезд, " + floor + " этаж, справа от лифта, вправо";
    }
}