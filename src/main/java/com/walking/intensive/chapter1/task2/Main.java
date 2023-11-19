package com.walking.intensive.chapter1.task2;


/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getFlatLocation(10, 5, 40));
        System.out.println(getFlatLocation(10, 2, 2));
        System.out.println(getFlatLocation(10, 2, 3));
        System.out.println(getFlatLocation(10, 2, 370));


    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int numberOfFlat = 4 * floorAmount * entranceAmount;
        if (flatNumber > numberOfFlat || flatNumber <= 0 || floorAmount == 0 || entranceAmount == 0) {
            return "Ошибка входных данных";
        }
        int flatEntrance = (int) Math.ceil((double) flatNumber / (4 * floorAmount));
        int flatInEntrance = (((flatNumber - ((flatEntrance - 1) * floorAmount * 4))));
        int flatFloor = (int) Math.ceil((double) flatInEntrance / 4);
        String sideLift = ((flatInEntrance % 4 == 1) || (flatInEntrance % 4 == 2)) ? " слева" : " справа";
        String roundAfterLift = (flatInEntrance % 2 == 1) ? " влево" : " вправо";

        String resultString = String.format("%d кв - %d подъезд. %d этаж,%s от лифта,%s", flatNumber, flatEntrance, flatFloor, sideLift, roundAfterLift);

        return resultString;
    }
}