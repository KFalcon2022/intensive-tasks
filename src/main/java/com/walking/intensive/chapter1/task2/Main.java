package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int floorAmount = 9;
        int entranceAmount = 4;
        int flatNumber = 1;
        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int totalFlats = floorAmount * entranceAmount * 4;
        int flatFloor = (flatNumber - 1) / 4 + 1;
        int flatEntrance = (flatFloor - 1) / floorAmount + 1;
        int flatFloorDivided = flatFloor % floorAmount;
        int dividedByFlatsOnFloor = flatNumber % 4;
        if (flatFloorDivided == 0) {
            flatFloorDivided = flatFloorDivided + floorAmount;
        }
        if (flatNumber <= 0 || flatNumber > totalFlats) {
            return "Нет такой квартиры";
        }
        switch (dividedByFlatsOnFloor) {
            case 0:
                return flatNumber + " кв - " + flatEntrance + " подъезд, " + flatFloorDivided + " Этаж" + " справа от лифта, вправо";
            case 1:
                return flatNumber + " кв - " + flatEntrance + " подъезд, " + flatFloorDivided + " Этаж" + " слева от лифта, влево";
            case 2:
                return flatNumber + " кв - " + flatEntrance + " подъезд, " + flatFloorDivided + " Этаж" + " слева от лифта, вправо";
            case 3:
                return flatNumber + " кв - " + flatEntrance + " подъезд, " + flatFloorDivided + " Этаж" + " справа от лифта, влево";
        }
        return "Ошибка";
    }
}