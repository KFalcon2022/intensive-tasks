package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int floorAmount = 5;
        int entranceAmount = 3;
        int flatNumber = 41;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));

        /*for (flatNumber = 1; flatNumber <= floorAmount * 4 * entranceAmount; flatNumber++) {
            System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
        }*/
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        String flatString = null;
        int indexOfFlat;
        int indexOfEntrance;        //номер подъезда, если от нуля
        int indexOfFloorAbsolute;   //"абсолютный" номер этажа, если бы не было подъездов
        int indexOfFloorReal;       //номер этажа
        int flatAmountInOneEntrance = 4 * floorAmount;
        int totalFlatAmount = flatAmountInOneEntrance * entranceAmount;

        if ((flatNumber <= 0) || (flatNumber > totalFlatAmount)) {
            return "Не существует такой квартиры";
        }

        indexOfEntrance = (flatNumber - 1) / flatAmountInOneEntrance;

        indexOfFloorAbsolute = ((flatNumber - 1) / 4) + 1;
        indexOfFloorReal = (indexOfFloorAbsolute % floorAmount == 0) ? floorAmount : indexOfFloorAbsolute % floorAmount;

        indexOfFlat = flatNumber % 4;
        if (indexOfFlat == 1) {
            flatString = "слева от лифта, влево";
        } else if (indexOfFlat == 2) {
            flatString = "слева от лифта, вправо";
        } else if (indexOfFlat == 3) {
            flatString = "справа от лифта, влево";
        } else if (indexOfFlat == 0) {
            flatString = "справа от лифта, вправо";
        }

        return "%s кв - %s подъезд, %s этаж, %s".formatted(
                flatNumber,
                Integer.toString(++indexOfEntrance),
                Integer.toString(indexOfFloorReal),
                flatString);

    }
}