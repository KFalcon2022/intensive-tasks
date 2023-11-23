package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе

        System.out.println(getFlatLocation(2, 4, 1));
        System.out.println(getFlatLocation(2, 4, 2));
        System.out.println(getFlatLocation(2, 4, 3));
        System.out.println(getFlatLocation(2, 4, 4));
        System.out.println(getFlatLocation(2, 4, 5));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int totalFlats = floorAmount * 4 * entranceAmount;

        if (flatNumber > totalFlats) {
            return "такой квартиры не существует";
        }

        String[] flatPosition = {"", "слева от лифта, влево", "слева от лифта, вправо", "справа от лифта, влево", "справа от лифта, вправо"};

        int flatEntrance = 1;
        int flatFloor = 1;

        int j = 0;
        for (int i = 1; i <= flatNumber; i++) {
            j++;
            if (i % 4 == 0 && flatFloor <= floorAmount && i != flatNumber) {
                flatFloor++;
                j = 0;
            }
            if (i == floorAmount * 4 * flatEntrance && i != flatNumber) {
                flatEntrance++;
                flatFloor = 1;
                j = 0;
            }

        }
        return "квартира " + flatNumber + ": " + flatEntrance + " подъезд " + flatFloor + " этаж " + flatPosition[j];
    }
}