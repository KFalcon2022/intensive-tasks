package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 *
 * КУРСОВАЯ ЗАДАЧА - ДОМ
 *
 * Дано 3 переменных: количество этажей в доме, количество подъездов и номер нужной квартиры.
 * На этаже 4 квартиры.
 * Нумерация квартир возрастает по часовой стрелке.
 * Напишите программу, которая указывает подъезд, этаж и расположение нужной квартиры на этаже.
 *
 * Примеры:
 *
 * 1 кв – 1 подъезд, 1 этаж, слева от лифта, влево
 * 2 кв – 1 подъезд, 1 этаж, слева от лифта, вправо
 * 3 кв – 1 подъезд, 1 этаж, справа от лифта, влево
 * 4 кв – 1 подъезд, 1 этаж, справа от лифта, вправо
 *
 * Если такой квартиры в доме нет, укажите это в решении.
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе

        System.out.println(getFlatLocation(9, 12, 85));
        System.out.println(getFlatLocation(9, 12, 86));
        System.out.println(getFlatLocation(9, 12, 87));
        System.out.println(getFlatLocation(9, 12, 88));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        final int flatPerFloor = 4;
        int flatPerEntrance = flatPerFloor * floorAmount;
        int flatsQuantity = flatPerEntrance * entranceAmount;

        if(flatNumber > flatsQuantity || flatNumber <= 0) {
            return "Такой квартиры в доме нет.";
        }

        int entranceNumber = flatNumber / flatPerEntrance + 1;
        int flatInEntrance = flatNumber % flatPerEntrance;
        int floorNumber = 0;
        int flatOnFloor = 0;

        if(flatInEntrance % flatPerFloor == 0) {
            floorNumber = flatInEntrance / flatPerFloor;
            flatOnFloor = flatPerFloor;
        } else {
            floorNumber = flatInEntrance % flatPerFloor + 1;
            flatOnFloor = flatInEntrance % flatPerFloor;
        }

        String liftLocation = "";

        if(flatOnFloor > 2) {
            liftLocation = " справа от лифта,";
        } else {
            liftLocation = " слева от лифта,";
        }

        String floorLocation = "";

        if( flatOnFloor % 2 != 0) {
            floorLocation = " влево";
        } else {
            floorLocation = " вправо";
        }

        return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж,"
                + liftLocation + floorLocation;
    }
}
