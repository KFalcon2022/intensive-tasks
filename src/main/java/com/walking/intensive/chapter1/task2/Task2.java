package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//получение значений
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество подъездов в доме: ");
        int entranceAmount = in.nextInt();
        System.out.print("Введите количество этажей в доме: ");
        int floorAmount = in.nextInt();
        System.out.print("Введите номер квартиры (от 1 до " + (4 * floorAmount * entranceAmount) + "): ");
        int flatNumber = in.nextInt();

        while (!isCheckFlat(flatNumber, floorAmount, entranceAmount)) {
            System.out.print("В доме нет квартиры с таким номером. Введите другой номер квартиры: ");
            flatNumber = in.nextInt();
        }
        in.close();

        System.out.println(getFlatLocation(flatNumber, floorAmount));
    }

    //проверка на наличие квартиры
    static boolean isCheckFlat(int flatNumber, int floorAmount, int entranceAmount) {
        if (flatNumber > 0 && flatNumber <= (4 * floorAmount * entranceAmount)) {
            return true;
        }
        return false;
    }

    //вывод расположения
    static String getFlatLocation(int flatNumber, int floorAmount) {
        int entrance = findNumberEntry(flatNumber, floorAmount);
        int floor = findNumberFloor(flatNumber, floorAmount, entrance);
        return entrance + " подъезд, " + floor + " этаж, " + getDisposition(flatNumber);
    }

    //определение подъезда
    static int findNumberEntry(int flatNumber, int floorAmount) {
        int entrance;
        if (flatNumber % (4 * floorAmount) != 0) {
            entrance = 1 + flatNumber / (4 * floorAmount);
        } else {
            entrance = flatNumber / (4 * floorAmount);
        }
        return entrance;
    }

    //определение этажа
    static int findNumberFloor(int flatNumber, int floorAmount, int entrance) {
        int floor;
        if (flatNumber % 4 == 0) {
            floor = (flatNumber - 4 * floorAmount * (entrance - 1)) / 4;
        } else {
            floor = 1 + (flatNumber - 4 * floorAmount * (entrance - 1)) / 4;
        }
        return floor;
    }

    //определение расположения
    static String getDisposition(int flatNumber) {
        int floorFlat = flatNumber % 4;
        switch (floorFlat) {
            case 1 -> {
                return "слева от лифта, влево";
            }
            case 2 -> {
                return "слева от лифта, вправо";
            }
            case 3 -> {
                return "справа от лифта, влево";
            }
            default -> {
                return "справа от лифта, вправо";
            }
        }
    }
}