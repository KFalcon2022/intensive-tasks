package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

public class Main {
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
        String location = "";

        if (flatNumber > amountFlats || flatNumber <= 0){
            return "Квартиры с таким номером в доме не существует.";
        }

        if (floorAmount <= 0){
            return "Количество этажей не может быть меньше 1.";
        }

        if (entranceAmount <= 0){
            return "Количество подъездов не может быть меньше 1.";
        }

        int searchableEntrance = (int) Math.ceil(flatNumber / (floorAmount * (double)amountFlatsOnFloor));  // Находим необходимый подъезд.
        int searchableFloor = (int) (Math.ceil(flatNumber / (double)amountFlatsOnFloor) % floorAmount);     // Находим необходимый этаж.
        location = flatNumber + " кв - " + searchableEntrance + " подъезд, " + searchableFloor + " этаж, ";

        switch (flatNumber % amountFlatsOnFloor) {
            case (1):
                location+= "слева от лифта, влево.";
                return location;
            case (2):
                location += "слева от лифта, вправо.";
                return location;
            case (3):
                location += "справа от лифта, влево.";
                return location;
            case (0):
                location += "справа от лифта, вправо.";
                return location;
            default:
                return "Расположение квартиры на этаже неизвестно.";
        }
    }
}