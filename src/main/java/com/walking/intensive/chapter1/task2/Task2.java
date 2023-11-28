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

        while (isFlatNotExists(flatNumber, floorAmount, entranceAmount)) {
            System.out.print("В доме нет квартиры с таким номером. Введите другой номер квартиры: ");
            flatNumber = in.nextInt();
        }
        in.close();

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    //вывод расположения
    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        if (isFlatNotExists(flatNumber, floorAmount, entranceAmount)) {
            return "Такой квартиры не существует";
        }

        int entrance = findEntryNumber(flatNumber, floorAmount);
        int floor = findFloorNumber(flatNumber, floorAmount, entrance);
        return flatNumber + " кв - " + entrance + " подъезд, " + floor + " этаж, " + getDisposition(flatNumber);
    }

    //проверка на наличие квартиры
    static boolean isFlatNotExists(int flatNumber, int floorAmount, int entranceAmount) {
        return flatNumber <= 0 || flatNumber > (4 * floorAmount * entranceAmount);
    }

    //определение подъезда
    static int findEntryNumber(int flatNumber, int floorAmount) {
        return flatNumber % (4 * floorAmount) != 0 ? 1 + flatNumber / 4 * floorAmount : flatNumber / (4 * floorAmount);
    }

    //определение этажа
    static int findFloorNumber(int flatNumber, int floorAmount, int entrance) {
        return flatNumber % 4 == 0 ? flatNumber - 4 * floorAmount * (entrance - 1) / 4 : 1 + (flatNumber - 4 * floorAmount * (entrance - 1)) / 4;
    }

    //определение расположения
    static String getDisposition(int flatNumber) {
        return switch (flatNumber % 4) {
            case 0 -> "справа от лифта, вправо";
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "справа от лифта, влево";
            default -> "Что-то пошло не так. Обратитесь к разработчику.";
        };
    }
}