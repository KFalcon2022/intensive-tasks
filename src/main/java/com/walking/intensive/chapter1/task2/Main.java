package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//получение значений
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество подъездов в доме: ");
        int entranceAmount = in.nextInt();
        System.out.print("Введите количество этажей в доме: ");
        int floorAmount = in.nextInt();
        System.out.print("Введите номер квартиры (от 1 до " + (4 * floorAmount * entranceAmount) + "): ");
        int flatNumber = in.nextInt();

        while (isCheckFlat(flatNumber, floorAmount, entranceAmount) != true) {
            System.out.print("В доме нет квартиры с таким номером. Введите другой номер квартиры: ");
            flatNumber = in.nextInt();
        }
        in.close();

        System.out.println(getFlatLocation(flatNumber, floorAmount, entranceAmount));
    }

    //проверка на наличие квартиры
    static boolean isCheckFlat(int flatNumber, int floorAmount, int entranceAmount) {
        if (flatNumber > 0 && flatNumber <= (4 * floorAmount * entranceAmount)) {
            return true;
        }
        return false;
    }

    //вывод расположения
    static String getFlatLocation(int flatNumber, int floorAmount, int entranceAmount) {
        int entrance = findNumberEntry(flatNumber, floorAmount);
        if (entrance > entranceAmount) {
            return "Подъезд определен некорректно. Необходимо сообщить разработчику.";
        }

        int floor = findNumberFoor(flatNumber, floorAmount, entrance);
        return entrance + " подъезд, " + floor + " этаж, " + getDisposition(flatNumber, floor, floorAmount, entrance);
    }

    //определение подъезда
    static int findNumberEntry(int flatNumber, int floorAmount) {
        int entrance = 1;
        if (flatNumber % (4 * floorAmount) != 0) {
            entrance = 1 + flatNumber / (4 * floorAmount);
        } else {
            entrance = flatNumber / (4 * floorAmount);
        }
        return entrance;
    }

    //определение этажа
    static int findNumberFoor(int flatNumber, int floorAmount, int entrance) {
        int floor = 1;
        if (flatNumber <= 4 * floor * entrance) {
            return 1;
        }

        if (entrance > 1) {
            while (flatNumber > 4 * (floor + floorAmount * entrance) && floor <= floorAmount) {
                floor++;
            }
        } else {
            while (flatNumber > 4 * floor && floor <= floorAmount) {
                floor++;
            }
        }
        return floor;
    }

    //определение расположения
    static String getDisposition(int flatNumber, int floor, int floorAmount, int entrance) {
        int floorFlat = 4 * floor;
        if (entrance > 1) {
            floorFlat = 4 * (floor + entrance * floorAmount);
        }

        if (flatNumber == floorFlat) {
            return "справа от лифта, вправо";
        }
        if (flatNumber == floorFlat - 1) {
            return "справа от лифта, влево";
        }
        if (flatNumber == floorFlat - 2) {
            return "слева от лифта, вправо";
        }
        return "слева от лифта, влево";
    }
}