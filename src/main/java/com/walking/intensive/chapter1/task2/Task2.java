package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(4, 3, 45));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int flatQuantity = floorAmount * entranceAmount * 4;
        int position = flatNumber % 4;
        int entranceNumber = (flatNumber - 1)/(floorAmount * 4) + 1;
        int floorNumber = (((flatNumber-(entranceNumber - 1) * (floorAmount * 4)) - 1) / 4) + 1;
        String positionStr = switch (position) {
            case (0) -> "справа от лифта, вправо";
            case (1) -> "слева от лифта, влево";
            case (2) -> "слева от лифта, вправо";
            case (3) -> "справа от лифта, влево";
            default -> "";
        };

        if (flatNumber>flatQuantity|flatNumber < 1) {
            return "Такой квартиры не существует";
        } else if (floorAmount < 1) {
            return "Такого этажа не существует";
        } else if(entranceAmount < 1) {
            return "Такого подъезда не существует";
        } else {
            return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + positionStr;
        }

    }
}