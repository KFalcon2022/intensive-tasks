package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inFloor = new Scanner(System.in);
        System.out.print("Введите кол-во этажей: ");
        int floor = inFloor.nextInt();

        Scanner inEntrance = new Scanner(System.in);
        System.out.print("Введите кол-во подьездов: ");
        int entrance = inEntrance.nextInt();

        Scanner inApartment = new Scanner(System.in);
        System.out.print("Введите номер квартиры: ");
        int flat = inApartment.nextInt();

        System.out.println(getFlatLocation(floor, entrance, flat));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {                                        //flatNumber - квартира.   entranceAmount - подьезд. floorAmount - этажи

        //** Узнеаем есть ли вообще такая квартива в доме?*/

        if (flatNumber > (floorAmount * 4 * entranceAmount) || flatNumber < 0) {
            return "Такой квартиры нет";
        }

        //** Узнаем номер подьезда*/
        int entranceAnswer = (flatNumber - 1) / (floorAmount * 4) + 1;

        //** Узнаем этаж*/
        int florAnswer = floorAmount - ((floorAmount * 4 * entranceAnswer - flatNumber) / 4);

        //** Направление движения*/
        int placeNom = flatNumber - ((floorAmount * 4) * (entranceAnswer - 1) + ((florAnswer - 1) * 4));

        String place = switch (placeNom) {
            default -> null;
            case 1 -> place = "слева от лифта, влево";
            case 2 -> place = "слева от лифта, вправо";
            case 3 -> place = "справа от лифта, влево";
            case 4 -> place = "справа от лифта, вправо";
        };
        return flatNumber + " кв - " + entranceAnswer + " подьезд," + florAnswer + " этаж," + place;

    }
}