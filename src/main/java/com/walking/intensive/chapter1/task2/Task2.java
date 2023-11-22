package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 В этой задаче нужно создать метод, котрый расчитает местоположение квартиры.
 Нужно произвести 2 операции:
 1. найти в каком парадном и на каком этаже находиться квартира, сразу пройдёт проверка о правильности номемра квартиры
 2. Расчитать местоположение квартиры на этаже
 */
public class Task2 {
    public static void main(String[] args) {
        int flatNumber = 13;
        int entranceAmount = 7;
        int floorAmount = 5;

        System.out.println(getFlatLocation(flatNumber, entranceAmount, floorAmount));
    }

    static String getFlatLocation(int flatNumber, int entranceAmount, int floorAmount) {
        int flatsPerFloor = 4;
        int flatsPerFrontEntrance = floorAmount * flatsPerFloor;

        if (flatNumber < 1 || flatNumber > entranceAmount * flatsPerFrontEntrance) {
            return "The apartment is absent";
        }
        int entrance = (flatNumber - 1) / flatsPerFrontEntrance + 1;
        int floor = ((flatNumber - 1) % flatsPerFrontEntrance) / flatsPerFloor + 1;
        int flatPosition = (flatNumber - 1) % flatsPerFloor;
/**
 В этом коде для определения положения квартиры на этаже используется последовательность тернарных операторов.
 Каждый оператор сравнивает значение flatPosition и выбирает соответствующую строку.
 */
        String position = (flatPosition == 0) ? "to the left of the elevator, to the left" :
                          (flatPosition == 1) ? "to the left of the elevator, to the right" :
                          (flatPosition == 2) ? "to the right of the elevator, to the left" :
                                                "to the right of the elevator, to the right";

        return "Front entrance: " + entrance + ", floor: " + floor + ", flat: " + flatNumber + " " + position;
    }

}