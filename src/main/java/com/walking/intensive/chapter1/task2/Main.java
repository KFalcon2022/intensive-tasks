package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {

    public static final int FLATS_PER_FLOOR = 4;
    public static int floorAmount = 5;
    public static int entranceAmount = 4;

    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        for (int i = 0; i <= entranceAmount * floorAmount * FLATS_PER_FLOOR + 1; i++) {
            System.out.print(String.format("Квартира № %d: ", i));
            System.out.println(getFlatLocation(floorAmount,entranceAmount,i));
        }
        
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int totalFlats = entranceAmount * floorAmount * FLATS_PER_FLOOR;

        if (flatNumber > totalFlats || flatNumber < 1) {
            return "Такой квартиры не существует.";
        }

        String direction;
        if (flatNumber % 4 == 1) {
            direction = "слева от лифта, влево";
        } else if (flatNumber % 4 == 2) {
            direction = "слева от лифта, вправо";
        } else if (flatNumber % 4 == 3) {
            direction = "справа от лифта, влево";
        } else {
            direction = "справа от лифта, вправо";
        }

        int entranceNum = (flatNumber / (FLATS_PER_FLOOR * floorAmount)) + 1;
        int floorNum = ((int) Math.ceil(((double) flatNumber / FLATS_PER_FLOOR))) % floorAmount == 0 ? floorAmount : ((int) Math.ceil(((double) flatNumber / FLATS_PER_FLOOR))) % floorAmount;

        return String.format("%d подъезд, %d этаж, %s", entranceNum, floorNum, direction);
    }
}