package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int floorAmount = 3;  //количество этажей
        int entranceAmount = 3; // количество подъездов
        int flatNumber; //номер квартиры

        int flatSum = floorAmount * entranceAmount * 4;  //общее количество квартир в доме

        System.out.println("В доме " + flatSum + " квартир:");
        for (int i = 0; i <= flatSum; i++) {
            flatNumber = i;
            System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
        }
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int entranceFlatsAmount = floorAmount * 4; //количество квартир в подъезде
        String flatDirection; // направление от лифта
        String flatSide; // на какой стороне
        String appLocationMessage = flatNumber + " кв - ";


        int flatEntrance = flatNumber / entranceFlatsAmount;
        if (flatNumber % entranceFlatsAmount > 0) {
            flatEntrance++;
        }

        //получаем этаж
        int flatFloor = (flatNumber - (flatEntrance - 1) * entranceFlatsAmount) / 4;
        if ((flatNumber - (flatEntrance - 1) * entranceFlatsAmount) % 4 > 0) {
            flatFloor++;
        }

        //получаем направление от лифта
        int flatDir = (flatEntrance * entranceFlatsAmount - entranceFlatsAmount + flatFloor * 4) - flatNumber;
        if (flatDir > 1) {
            flatDirection = "налево";
        } else {
            flatDirection = "направо";
        }

        // получаем сторону квартиры
        if (flatDir % 2 > 0) {
            flatSide = "слева";
        } else {
            flatSide = "справа";
        }

        if (flatNumber <= 0 || flatNumber > floorAmount * entranceAmount * 4) {
            appLocationMessage = appLocationMessage + "Не существует в этом доме!";
        } else {
            appLocationMessage = appLocationMessage + flatEntrance + " подъезд, " + flatFloor + " этаж, " + flatDirection + " от лифта, " + flatSide;
        }
        return appLocationMessage;
    }
}