package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество этажей: ");
        int floorAmount = sc.nextInt();
        if (floorAmount <= 0) {
            System.out.println("Количество этажей не может быть меньше 1.");
            return;
        }

        System.out.println("Введите количество подъездов: ");
        int entranceAmount = sc.nextInt();
        if (entranceAmount <= 0) {
            System.out.println("Количество подъездов не может быть меньше 1.");
            return;
        }

        System.out.println("Введите номер квартиры: ");
        int flatNumber = sc.nextInt();
        if (flatNumber <= 0) {
            System.out.println("Номер квартиры должен быть равен хотя бы 1.");
            return;
        }

        sc.close();

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flatCounter = 0;
        String location = "";

        for (int i = 1; i <= entranceAmount; i++) {
            for (int j = 1; j <= floorAmount; j++) {
                for (int k = 1; k <= 4; k++) {
                    flatCounter++;
                    if (flatCounter == flatNumber) {
                        location = flatNumber + " кв - " + i + " подъезд, " + j + " этаж, ";
                        switch (k) {
                            case (1):
                                location = location + "слева от лифта, влево.";
                                return location;
                            case (2):
                                location = location + "слева от лифта, вправо.";
                                return location;
                            case (3):
                                location = location + "справа от лифта, влево.";
                                return location;
                            case (4):
                                location = location + "справа от лифта, вправо.";
                                return location;
                        }
                    }
                }
            }
        }
        return "В доме с таким количеством этажей и подъездов не может быть квартиры с номером " + flatNumber + ".";
    }
}