package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
        int floorAmount = 10;
        int entranceAmount = 3;
        int flatNumber = 40;
        getFlatLocation(floorAmount, entranceAmount, flatNumber);
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flatQuantityOnOneFloor = 4;
        //количество квартир - этажи * подъезды * 4
        int flatAmount = floorAmount * entranceAmount * flatQuantityOnOneFloor;
        if ((flatAmount < flatNumber) || flatNumber < 0 || entranceAmount < 0 || floorAmount < 0) {
            return ("Такой квартиры не существует");
        }

        //количество квартир в одном подъезде - этажи * 4
        int flatAmountInOneEntrance = floorAmount * flatQuantityOnOneFloor;
        //номер подъезда - номер квартиры / количество квартир в одном подъезде
        int entranceNumber = (flatNumber - 1) / flatAmountInOneEntrance + 1;
        // номер этажа - номер квартиры % количество квартир в одном подъезде / 4 + 1
        int floorNumber = (flatNumber - 1) % flatAmountInOneEntrance / flatQuantityOnOneFloor + 1;

        String result = flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж";
        return switch (flatNumber % flatQuantityOnOneFloor) {
            case 0 -> result + ", справа от лифта, вправо";
            case 1 -> result + ", слева от лифта, влево";
            case 2 -> result + ", слева от лифта, вправо";
            case 3 -> result + ", справа от лифта, влево";
            default -> result;
        };
    }
}