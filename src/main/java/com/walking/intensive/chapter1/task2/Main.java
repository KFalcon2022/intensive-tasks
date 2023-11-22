package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int floorAmount = 9;
        int entranceAmount = 4;
        int flatNumber = 139;
        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int totalFloors = (flatNumber - 1) / 4 + 1;
        int flatEntrance = (totalFloors - 1) / floorAmount + 1;
        int currentFloor = totalFloors % floorAmount;

        if (currentFloor == 0) {

            currentFloor = currentFloor + floorAmount;

        }

        if (flatNumber <= 0 || flatNumber > floorAmount * entranceAmount * 4) {

            return "Нет такой квартиры";

        }
        String direction = switch (flatNumber % 4) {
            case 0 ->" справа от лифта, вправо";
            case 1 ->" слева от лифта, влево";
            case 2 ->" слева от лифта, вправо";
            case 3 ->" справа от лифта, влево";
            default -> " Ошибка";
        };
        return flatNumber + " кв - " + flatEntrance + " подъезд, " + currentFloor + " Этаж" + direction;
    }
}