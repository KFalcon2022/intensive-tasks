package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(2, 5, 1));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int floorFlatAmount = 4;
        double entranceFlatAmount = floorFlatAmount * floorAmount; // количество квартир в подъезде
        int flatAmountBuild = floorFlatAmount * floorAmount * entranceAmount; // количество квартир в доме
        int rightEntrance, rightFloor;
        String direction;
        int floorFlatAmountMod = flatNumber % floorFlatAmount;

        if (flatAmountBuild <= 0 || flatNumber > flatAmountBuild || flatNumber <= 0) {
            return "Такой квартиры не существует";
        }

        if (floorFlatAmountMod == 1) {
            direction = "слева от лифта, влево";
        } else if (floorFlatAmountMod == 2) {
            direction = "слева от лифта, вправо";
        } else if (floorFlatAmountMod == 3) {
            direction = "справа от лифта, влево";
        } else {
            direction = "справа от лифта, вправо";
        }
        
        rightEntrance = (int) Math.ceil(flatNumber / entranceFlatAmount);
        rightFloor = (int) Math.ceil((flatNumber - ((rightEntrance - 1) * entranceFlatAmount)) / floorFlatAmount);

        return flatNumber + " кв - " + rightEntrance + " подъезд, " + rightFloor + " этаж, " + direction;
    }
}