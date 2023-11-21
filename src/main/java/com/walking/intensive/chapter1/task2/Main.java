package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(getFlatLocation(3, 7, 1));
        System.out.println(getFlatLocation(3, 7, 15));
        System.out.println(getFlatLocation(3, 7, 84));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        final int FLATS_ON_FLOOR_AMOUNT = 4;

        if (flatNumber <= 0) {
            return "Некорректное значение номера квартиры";
        }

        //Кол-во квартир в подъезде
        int flatsInEntranceAmount = floorAmount * FLATS_ON_FLOOR_AMOUNT;

        if (flatNumber > entranceAmount * flatsInEntranceAmount) {
            return "Квартиры с таким номером в доме нет";
        }

        int entranceNum = (int) Math.ceil((float) flatNumber / flatsInEntranceAmount);

        int floorNum;
        if (flatNumber % flatsInEntranceAmount == 0) {
            floorNum = floorAmount;
        } else {
            floorNum = (int) Math.ceil((float) (flatNumber % flatsInEntranceAmount) / FLATS_ON_FLOOR_AMOUNT);
        }

        int posOnTheFloor = flatNumber % flatsInEntranceAmount % FLATS_ON_FLOOR_AMOUNT;
        String posOnTheFloorStr;
        if (posOnTheFloor == 1) {
            posOnTheFloorStr = "слева от лифта, влево";
        } else if (posOnTheFloor == 2) {
            posOnTheFloorStr = "слева от лифта, вправо";
        } else if (posOnTheFloor == 3) {
            posOnTheFloorStr = "справа от лифта, влево";
        } else  {
            posOnTheFloorStr = "справа от лифта, вправо";
        }

        return entranceNum + " подъезд, " + floorNum + " этаж, " + posOnTheFloorStr;

    }
}