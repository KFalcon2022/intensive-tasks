package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(getFlatLocation(10, 3, 81));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int apartmentsOnFloor = 4;
        int apartmentsInEntrance = floorAmount * apartmentsOnFloor; //количество квартир в подъезде

        if (flatNumber < 1 || flatNumber > apartmentsInEntrance * entranceAmount){
            return "Такой квартиры не существует";
        }

        int entranceNumber; // номер подъезда

        if (flatNumber % apartmentsInEntrance == 0) {
            entranceNumber = flatNumber / apartmentsInEntrance;
        } else {
            entranceNumber = flatNumber / apartmentsInEntrance + 1;
        }

        int floorNumber; // номер этажа

        if (flatNumber % apartmentsOnFloor == 0) {
            floorNumber = (flatNumber / apartmentsOnFloor) - floorAmount * (entranceNumber - 1);
        } else {
            floorNumber = (flatNumber / apartmentsOnFloor + 1) - floorAmount * (entranceNumber - 1);
        }

        String flatLocation = switch (flatNumber % apartmentsOnFloor) { // расположение относительно лифта
            case (1) -> "слева от лифта, влево";
            case (2) -> "слева от лифта, вправо";
            case (3) -> "справа от лифта, влево";
            case (0) -> "справа от лифта, вправо";
            default -> "";
        };
        return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + flatLocation;
    }
}