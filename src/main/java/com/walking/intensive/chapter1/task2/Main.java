package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getFlatLocation(4, 3, 47));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        final int FLATonFLOOR = 4; // константа кол-во кв на этаже

        if (FLATonFLOOR * entranceAmount * floorAmount < flatNumber || flatNumber < 1) {
            return "Такой квартиры нет в данном доме";
        }

        int flatDiv = (flatNumber - 1) / FLATonFLOOR;
        int numberFlour = (flatDiv + 1) % floorAmount;//номер этажа
        int numberPodezd = flatDiv / floorAmount + 1; // Номер подъезда

        if (numberFlour == 0) {
            numberFlour += floorAmount;
        }

        switch (flatNumber % 4) {//направление
            case 1 -> {
                return flatNumber + " кв: " + numberPodezd + " подъезд, " + numberFlour + " этаж, слева от лифта, влево";
            }
            case 2 -> {
                return flatNumber + " кв: " + numberPodezd + " подъезд, " + numberFlour + " этаж, слева от лифта, вправо";
            }
            case 3 -> {
                return flatNumber + " кв: " + numberPodezd + " подъезд, " + numberFlour + " этаж, справа от лифта, влево";
            }
            default -> {
                return flatNumber + " кв: " + numberPodezd + " подъезд, " + numberFlour + " этаж, справа от лифта, вправо";
            }
        }
    }
}