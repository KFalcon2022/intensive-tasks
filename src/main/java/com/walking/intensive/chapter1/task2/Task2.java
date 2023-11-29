package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.println(getFlatLocation(5, 3, 60));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int apartmentNumber = 4 * floorAmount * entranceAmount;
        if (flatNumber > apartmentNumber || flatNumber <= 0 || floorAmount == 0 || entranceAmount == 0) {
            return "Ошибка входных данных";
        }
        int flatEntrance = (flatNumber / (4 * floorAmount));
        int apartmentEntrance = (flatNumber - ((flatEntrance - 1) * floorAmount * 4));
        int flatFloor = (apartmentEntrance / 4);
        String sideLift = ((apartmentEntrance % 4 == 1) || (apartmentEntrance % 4 == 2)) ? " слева" : " справа";
        String roundAfterLift = (apartmentEntrance % 2 == 1) ? " влево" : " вправо";

        String result = String.format(flatNumber + " кв - " + flatEntrance + " подъезд, " + flatFloor + " этаж, " + sideLift + " от лифта, " + roundAfterLift);

        return result;

    }
}