package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество этажей в здании: ");
        int floorAmount = scanner.nextInt();

        System.out.print("Введите количество подъездов в здании: ");
        int entranceAmount = scanner.nextInt();

        System.out.print("Введите нужную квартиру: ");
        int flatNumber = scanner.nextInt();

        scanner.close();

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int apartmentsEntranceCount = floorAmount * 4;
        int apartmentsCount = apartmentsEntranceCount * entranceAmount;
        int entrancesCount = (flatNumber - 1) / apartmentsEntranceCount + 1;
        final int apartmentsQuantityFloor = 4;
        String message;


        if (flatNumber > apartmentsCount) {
            return message = "err";
        }

        int floorCount;

        if (flatNumber % apartmentsQuantityFloor == 0) {
            floorCount = (flatNumber / apartmentsQuantityFloor) - floorAmount * (entrancesCount - 1);
        } else {
            floorCount = (flatNumber / apartmentsQuantityFloor + 1) - floorAmount * (entrancesCount - 1);
        }

        String location = switch (flatNumber % apartmentsQuantityFloor) {
            case (0) -> "справа от лифта, вправо";
            case (1) -> "слева от лифта, влево";
            case (2) -> "слева от лифта, вправо";
            case (3) -> "справа от лифта, влево";
            default -> "";
        };

        return message = entrancesCount + " подъезд, " + floorCount + " этаж, " + location;
    }
}

