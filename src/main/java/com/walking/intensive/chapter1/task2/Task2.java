package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.println(getFlatLocation(5, 3, 34));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int apartmentNumber = 4 * floorAmount * entranceAmount;

        if (flatNumber > apartmentNumber || flatNumber <= 0) {
            return "Неверно введен номер квартиры";
        }
        if (floorAmount <= 0 ||entranceAmount <= 0) {
            return "Ошибка валидации данных";
        }
        int apartmentsOnFloor = 4;
        int flatEntrance = (flatNumber / (apartmentsOnFloor * floorAmount));
        int apartmentEntrance = (flatNumber - ((flatEntrance - 1) * floorAmount * apartmentsOnFloor));
        int flatFloor = (apartmentEntrance / apartmentsOnFloor);
        String sideLift = ((apartmentEntrance % apartmentsOnFloor == 1) || (apartmentEntrance % apartmentsOnFloor == 2)) ? "слева" : " права";
        String roundAfterLift = (apartmentEntrance % 2 == 1) ? "влево" : "вправо";

        String result = String.format(flatNumber + " кв - " + flatEntrance + " подъезд, " + flatFloor + " этаж, " + sideLift + " от лифта, " + roundAfterLift);

        return result;

    }
}