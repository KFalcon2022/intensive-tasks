package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество этажей в доме: ");
        int floorAmount = scanner.nextInt();

        System.out.print("Введите количество подъездов в доме: ");
        int entranceAmount = scanner.nextInt();

        System.out.print("Введите номер квартиры: ");
        int flatNumber = scanner.nextInt();
        scanner.close();

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flatsFloor = 4;

        if ((floorAmount * entranceAmount * flatsFloor) < flatNumber || flatNumber < 1) {
            return "Такой квартиры в доме нет";
        }

        int entrance = (int) Math.ceil((double) flatNumber / flatsFloor / floorAmount);
        int floor = (int) Math.ceil((double) flatNumber / flatsFloor) - (entrance - 1) * floorAmount;

        String flatLocation = switch (flatNumber % flatsFloor) {
            case 0 -> "справа от лифта, вправо";
            case 3 -> "справа от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            default -> "слева от лифта, влево";
        };

        return flatNumber + " кв - " + entrance + " подъезд, " + floor + " этаж, " + flatLocation;
    }
}

