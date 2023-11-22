package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(10, 3, 41));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода
        int floorCount = 4;
        int entranceCount = floorAmount * floorCount;
        int houseCount = entranceCount * entranceAmount;

        String result = "Такого дома нет";

        if (flatNumber > houseCount) {
            return result;
        }

        int entranceNumber = flatNumber / entranceCount;
        int floorNumber = (flatNumber % entranceCount) / floorCount;
        int leftrightTyrn = flatNumber % floorCount;

        result = "%d кв - %d подъезд, %d этаж, %s от лифта, %s";
        String turnFromLift = leftrightTyrn <= 2 ? "слева" : "справа";
        String turnOnSquare = leftrightTyrn % 2 == 0 ? "вправо" : "влево";
        return String.format(result, flatNumber, entranceNumber + 1, floorNumber + 1, turnFromLift, turnOnSquare);
    }
}