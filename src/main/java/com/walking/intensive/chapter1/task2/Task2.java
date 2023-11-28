package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

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
        //количество квартир - этажи * подъезды * 4
        int flatAmount = floorAmount * entranceAmount * 4;
        if ((flatAmount < flatNumber) || flatNumber < 0) {
            return ("Такой квартиры не существует");
        }

        //количество квартир в одном подъезде - этажи * 4
        int flatAmountInOneEntrance = floorAmount * 4;
        //номер подъезда - номер квартиры / количество квартир в одном подъезде
        int entranceNumber = (flatNumber - 1) / flatAmountInOneEntrance + 1;
        // номер этажа - номер квартиры % количество квартир в одном подъезде / 4 + 1
        int floorNumber = (flatNumber - 1) % flatAmountInOneEntrance / 4 + 1;

        String result = flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж";
        return switch (flatNumber % 4) {
            case 0 -> result + ", справа от лифта, вправо";
            case 1 -> result + ", слева от лифта, влево";
            case 2 -> result + ", слева от лифта, вправо";
            case 3 -> result + ", справа от лифта, влево";
            default -> result;
        };
    }
}