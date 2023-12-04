package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {

        int floorAmount = 10; //Кол-во этажей
        int entranceAmount = 1; //Кол-во подъездов
        int flatNumber = 15; //Номер квартиры

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        final int flatsOnFloor = 4;//Кол-во квартир на одном этаже

        if (flatNumber <= 0 || floorAmount <= 0 || entranceAmount <= 0) {
            return "Ошибка ввода. Число не может быть отрицательным или равным нулю.";
        }

        if (flatNumber > flatsOnFloor * floorAmount * entranceAmount) {
            return "Квартира номер " + flatNumber + " отсутсвует в этом доме.";
        }

        int entranceNumber = (flatNumber - 1) / (floorAmount * flatsOnFloor) + 1; //Подъезд квартиры
        int floorNumber = ((flatNumber - 1) / flatsOnFloor + 1) - (floorAmount * (entranceNumber - 1)); //Этаж квартиры
        String flatLocation = "";

        switch (flatNumber % flatsOnFloor) {
            case 0 -> flatLocation = " справа от лифта и направо.";
            case 1 -> flatLocation = " слева от лифта и налево.";
            case 2 -> flatLocation = " слева от лифта и направо.";
            case 3 -> flatLocation = " справа от лифта и налево.";
        }

        return "Квартира " + flatNumber + " расположена в подъезде " + entranceNumber + " на этаже "
                + floorNumber + flatLocation;
    }
}