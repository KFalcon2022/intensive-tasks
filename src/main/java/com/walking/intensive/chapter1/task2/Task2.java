package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flatAmount = 4 * floorAmount * entranceAmount;
        if (flatNumber > flatAmount || flatNumber <= 0) {
            return "Такой квартиры не существует";
        }
        int entranceNumber = (int) (Math.ceil((double) flatNumber / 4 / floorAmount));
        int floorNumber = ((int) (Math.ceil((double) flatNumber / 4))) % floorAmount;
        if (floorNumber == 0) {
            floorNumber = floorAmount;
        }
        return switch (flatNumber % 4) {
            case 1 ->
                    flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + "слева от лифта, влево";
            case 2 ->
                    flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + "слева от лифта, вправо";
            case 3 ->
                    flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + "справа от лифта, влево";
            case 0 ->
                    flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + "справа от лифта, вправо";
            default -> "Ошибка"; // !Вопрос! Написал "default", т.к. компилятор переживал что switch покрывает не все возможные значения и не будет return. Как-то можно иначе это реализовать? Ведь, по факту, switch покрывает все возможные значения.
        };

    }
}
