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
        int oneEntranceFlatAmount = 4 * floorAmount;
        int totalFlatAmount = oneEntranceFlatAmount * entranceAmount;

        if ((flatNumber <= 0) || (flatNumber > totalFlatAmount)) {
            return "Не существует такой квартиры";
        }

        int entranceIndex = (flatNumber - 1) / oneEntranceFlatAmount;

        int floorAbsoluteIndex = ((flatNumber - 1) / 4) + 1;
        int floorRealIndex = (floorAbsoluteIndex % floorAmount == 0) ? floorAmount : floorAbsoluteIndex % floorAmount;

        String flatString = null;
        int flatIndex = flatNumber % 4;

        flatString = switch (flatIndex) {
            case (1) -> "слева от лифта, влево";
            case (2) -> "слева от лифта, вправо";
            case (3) -> "справа от лифта, влево";
            default -> "справа от лифта, вправо";
        };

        return "%s кв - %s подъезд, %s этаж, %s".formatted(
                flatNumber,
                Integer.toString(++entranceIndex),
                Integer.toString(floorRealIndex),
                flatString);

    }
}