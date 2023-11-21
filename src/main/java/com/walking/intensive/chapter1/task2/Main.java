package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        Scanner house = new Scanner(System.in);

        System.out.println("Ведите количество этажей");
        int floorInHouse = house.nextInt();

        System.out.println("Ведите количество подъездов");
        int entranceInHouse = house.nextInt();

        System.out.println("Ведите номер искомой квартиры");
        int numberApt = house.nextInt();
        house.close();

        System.out.println(getFlatLocation(floorInHouse, entranceInHouse, numberApt));
    }
    static String getFlatLocation(int floorInHouse, int entranceInHouse, int numberApt) {

        int totalApt = floorInHouse * entranceInHouse * 4;
        int flatsInEntrance = floorInHouse * 4;
        if (numberApt > totalApt) {
            return "Такой квартиры в доме нет";
        }
        int placeAptInEntrance = numberApt % flatsInEntrance;
        int entranceNumber = numberApt / flatsInEntrance + (placeAptInEntrance == 0 ? 0 : 1);
        int placeAptInFloor = placeAptInEntrance % 4;
        int floorNumber = (placeAptInEntrance == 0 ? floorInHouse : placeAptInEntrance / 4) + (placeAptInFloor == 0 ? 0 : 1);

        String result = switch (placeAptInFloor) {
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "справа от лифта, влево";
            case 0 -> "справа от лифта, вправо";
            default -> "";
        };
        return numberApt + " - кв, " + entranceNumber + " - подъезд, " + floorNumber + " - этаж, " + result;
    }
}
