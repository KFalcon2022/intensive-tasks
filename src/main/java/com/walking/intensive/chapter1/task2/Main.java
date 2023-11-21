package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int floorAmount = 2;  //количество этажей
        int entranceAmount = 3; // количество подъездов
        int flatNumber; //номер квартиры

        int flatSum = floorAmount * entranceAmount * 4;  //общее количество квартир в доме

        System.out.println("В доме " + flatSum + " квартир:");
        for (int i = 1; i <= flatSum; i++) {
            flatNumber = i;
            System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
        }
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //

        int entranceNumber = floorAmount * 4; //количество квартир в подъезде
        int flatEntrance = 1; // Номер подьезда
        int flatFloor = 1; // номер этажа
        String flatDirection; // направление от лифта
        String flatSide; // на какой стороне

        String appLocationMessage = flatNumber + " кв - ";

        //получаем номер подъезда
        for (int i = 1; i <= entranceAmount; i++) {
            if (entranceNumber * i >= flatNumber) {
                flatEntrance = i; //получаем номер подъезда
                i = entranceAmount;
            }
        }

        //получаем этаж
        for (int i = 1; i <= floorAmount; i++) {
            if (flatEntrance*entranceNumber - entranceNumber + i*4>=flatNumber) {
                flatFloor = i; //получаем этаж
                i = floorAmount;
            }
        }

        //получаем направление от лифта
        int flatDir = (flatEntrance*entranceNumber - entranceNumber + flatFloor*4) - flatNumber;
        if (flatDir > 1){
            flatDirection = "налево";
        }
        else {
            flatDirection = "направо";
        }

        // получаем сторону квартиры
        if (flatDir%2 > 0){
            flatSide = "влево";
        }
        else {
            flatSide = "вправо";
        }

        if (flatNumber <= 0 || flatNumber > floorAmount * entranceAmount * 4) { //проверка на существование квартиры
            appLocationMessage = appLocationMessage + "Не существует в этом доме!";
        } else {
            appLocationMessage = appLocationMessage + flatEntrance + " подъезд, " + flatFloor + " этаж, " + flatDirection + " от лифта, " + flatSide;
        }

        return appLocationMessage; // Заглушка. При реализации - удалить
    }
}