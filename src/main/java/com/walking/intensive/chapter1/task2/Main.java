package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество этажей: ");
        int floorAmount = scanner.nextInt();
        System.out.print("Введите количество парадных: ");
        int entranceAmount = scanner.nextInt();
        for (int i = 0; i <= (floorAmount * entranceAmount * 4); i++) {
            System.out.println(getFlatLocation(floorAmount, entranceAmount, i));
        }

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        String flatLocation = "";

        long totalFlats = 4L * floorAmount * entranceAmount;
        if (flatNumber > totalFlats || flatNumber <= 0) {
            return "Квартиры " + flatNumber + " в доме нет";
        }
        if (floorAmount <= 0 || entranceAmount <= 0) {
            return "Параметры дома заданы неверно";
        }

        long entranceNumber = entranceAmount - ((totalFlats - flatNumber) / (4L * floorAmount));
        long lastFlatInEntrance = entranceNumber * 4L * floorAmount;
        long floorNumber = floorAmount - ((lastFlatInEntrance - flatNumber) / 4);
        flatLocation += flatNumber + " кв – " + entranceNumber + " подъезд, " + floorNumber + " этаж, ";
        if ((flatNumber % 4 == 0) || ((flatNumber + 1) % 4 == 0)) {
            flatLocation += "справа от лифта, ";
        } else {
            flatLocation += "слева от лифта, ";
        }
        if (flatNumber % 2 == 0) {
            flatLocation += "вправо";
        } else {
            flatLocation += "влево";
        }

        return flatLocation;
    }
}