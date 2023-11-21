package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество подъездов: ");
        int entrancesQuantity = scanner.nextInt();

        System.out.print("Введите количество этажей: ");
        int floorsQuantity = scanner.nextInt();

        System.out.print("Введите номер квартиры: ");
        int apartNumber = scanner.nextInt();

        scanner.close();

        int roomsPerFloor = 4;

        if ((apartNumber < 1) || (apartNumber > (roomsPerFloor * floorsQuantity * entrancesQuantity))) {
            System.out.println("Такой квартиры в доме нет");
            return;
        }

        String apartLoc = null;
        switch (apartNumber % roomsPerFloor) {
            case 0 -> apartLoc = "Справа от лифта, вправо";
            case 1 -> apartLoc = "Слева от лифта, влево";
            case 2 -> apartLoc = "Слева от лифта, вправо";
            case 3 -> apartLoc = "Справа от лифта, влево";
        }

        int entranceNum = apartNumber / (roomsPerFloor * floorsQuantity);

        if (apartNumber % (roomsPerFloor * floorsQuantity) != 0) {
            entranceNum++;
        }

        int floorNum = apartNumber / roomsPerFloor - (entranceNum - 1) * floorsQuantity;

        if (apartNumber % roomsPerFloor != 0) {
            floorNum++;
        }

        System.out.println(apartNumber + " кв - " + entranceNum + " подъезд, " + floorNum + " этаж, " + apartLoc);
    }
}
