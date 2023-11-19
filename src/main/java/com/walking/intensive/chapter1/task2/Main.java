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
        String flatLocation;
        int flatsOnFloor = 4;
        if ((floorAmount * entranceAmount * flatsOnFloor) < flatNumber || flatNumber < 1) {
            return "Такой квартиры в доме нет";
        } else {
            int entrance = (int) Math.ceil((double) flatNumber / flatsOnFloor / floorAmount);
            int floor = (int) Math.ceil((double) flatNumber / flatsOnFloor) - (entrance - 1) * floorAmount;
            if (flatNumber % 4 == 0) {
                flatLocation = "справа от лифта, вправо";
            } else if (flatNumber % 3 == 0) {
                flatLocation = "справа от лифта, влево";
            } else if (flatNumber % 2 == 0) {
                flatLocation = "слева от лифта, вправо";
            } else {
                flatLocation = "слева от лифта, влево";
            }
            return flatNumber + " кв - " + entrance + " подъезд, " + floor + " этаж, " + flatLocation;
        }
    }
}
