package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(2, -5, -1));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        final int floorFlatAmount = 4;
        double entranceFlatAmount = floorFlatAmount * floorAmount; // количество квартир в подъезде
        int flatAmountBuild = floorFlatAmount * floorAmount * entranceAmount; // количество квартир в доме
        int floorFlatAmountMod = flatNumber % floorFlatAmount;

        if (Math.min(Math.min(floorAmount, entranceAmount), flatNumber) <= 0 || flatNumber > flatAmountBuild) {
            return "Такой квартиры не существует";
        }

        String direction;

        switch(floorFlatAmountMod) {
            case 1:
                direction = "слева от лифта, влево";
                break;
            case 2:
                direction = "слева от лифта, вправо";
                break;
            case 3:
                direction = "справа от лифта, влево";
                break;
            default:
                direction = "справа от лифта, вправо";
        }

        int rightEntrance = (int) Math.ceil(flatNumber / entranceFlatAmount);
        int rightFloor = (int) Math.ceil((flatNumber - ((rightEntrance - 1) * entranceFlatAmount)) / floorFlatAmount);

        return flatNumber + " кв - " + rightEntrance + " подъезд, " + rightFloor + " этаж, " + direction;
    }
}