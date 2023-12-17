package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 * Дано 3 переменных: количество этажей в доме, количество подъездов и номер нужной квартиры. На этаже 4 квартиры. Нумерация квартир возрастает по часовой стрелке. Напишите программу, которая указывает подъезд, этаж и расположение нужной квартиры на этаже.
 * Примеры:
 * 1 кв – 1 подъезд, 1 этаж, слева от лифта, влево
 * 2 кв – 1 подъезд, 1 этаж, слева от лифта, вправо
 * 3 кв – 1 подъезд, 1 этаж, справа от лифта, влево
 * 4 кв – 1 подъезд, 1 этаж, справа от лифта, вправо
 * Если такой квартиры в доме нет, укажите это в решении.
 */
public class Task2 {
    public static void main(String[] args) {

        int flatNumber = 5;
        int floorAmount = 2;
        int entranceAmount = 2;
        final int NUMBER_OF_APARTMENTS_PER_FLOOR = 4;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber, NUMBER_OF_APARTMENTS_PER_FLOOR));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber, int NUMBER_OF_APARTMENTS_PER_FLOOR) {

        if ((flatNumber < 1) || (flatNumber > (floorAmount * entranceAmount * 4))) {
            return ("Такой квартиры не существует");
        }

        int entranceNumber = (int) Math.ceil((double) flatNumber / (floorAmount * NUMBER_OF_APARTMENTS_PER_FLOOR));

        int floorNumber = (int) Math.ceil((double) flatNumber / NUMBER_OF_APARTMENTS_PER_FLOOR);

        if (floorNumber > floorAmount) {
            if (floorNumber % floorAmount == 0) {
                floorNumber = floorAmount;
            } else {
                floorNumber %= floorAmount;
            }
        }

        String apartmentPosition = null;
        if ((flatNumber % NUMBER_OF_APARTMENTS_PER_FLOOR) == 0) {
            apartmentPosition = "слева от лифта, влево";
        }
        if ((flatNumber % NUMBER_OF_APARTMENTS_PER_FLOOR) == 1) {
            apartmentPosition = "слева от лифта, вправо";
        }
        if ((flatNumber % NUMBER_OF_APARTMENTS_PER_FLOOR) == 2) {
            apartmentPosition = "справа от лифта, влево";
        }
        if ((flatNumber % NUMBER_OF_APARTMENTS_PER_FLOOR) == 3) {
            apartmentPosition = "справа от лифта, вправо";
        }

        return (flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + apartmentPosition);
    }
}