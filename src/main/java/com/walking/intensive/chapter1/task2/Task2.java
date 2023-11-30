package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество этажей: ");
        int floorAmount = sc.nextInt();

        System.out.println("Введите количество подъездов: ");
        int entranceAmount = sc.nextInt();

        System.out.println("Введите номер квартиры: ");
        int flatNumber = sc.nextInt();

        sc.close();

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int amountFlatsOnFloor = 4;
        int amountFlats = floorAmount * entranceAmount * amountFlatsOnFloor;

        if (flatNumber > amountFlats || flatNumber <= 0) {
            return "Такой квартиры не существует";
        }

        if (floorAmount <= 0) {
            return "Количество этажей не может быть меньше 1.";
        }

        if (entranceAmount <= 0) {
            return "Количество подъездов не может быть меньше 1.";
        }

        int searchableEntrance = (int) Math.ceil(flatNumber / (floorAmount * (double) amountFlatsOnFloor));
        int searchableFloor = (int) (Math.ceil(flatNumber / (double) amountFlatsOnFloor)) % floorAmount;

        if (searchableFloor == 0) {
            searchableFloor = floorAmount;
        }

        String location = flatNumber + " кв - " + searchableEntrance + " подъезд, " + searchableFloor + " этаж, ";
        String turn = switch (flatNumber % amountFlatsOnFloor) {
            case 0 -> "справа от лифта, вправо";
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "справа от лифта, влево";
            default -> "";
        };
        return location + turn;
    }
}