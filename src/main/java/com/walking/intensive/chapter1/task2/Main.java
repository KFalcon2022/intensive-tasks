package com.walking.intensive.chapter1.task2;


/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getFlatLocation(5, 3, 60));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flatsInEntrance = floorAmount * 4;
        int allFlat = entranceAmount * flatsInEntrance;
        if (flatNumber <= 0 || flatNumber > allFlat) {
            return "такой квартиры не существует";
        }
        int entrance = (int) Math.ceil((double) flatNumber / ((double) flatsInEntrance));

        int floor = (int) Math.ceil((flatNumber % flatsInEntrance) / 4.0);
        floor = floor == 0 ? floorAmount : floor;

        double location = (flatNumber % flatsInEntrance) / 4.0;
        location = location - (int) location;

        String pos;
        if (location > 0.0 && location <= 0.25) {
            pos = "слева от лифта, влево";
        } else if (location > 0.25 && location <= 0.5) {
            pos = "слева от лифта, вправо";
        } else if (location > 0.5 && location <= 0.75) {
            pos = "справа от лифта, влево";
        } else {
            pos = "справа от лифта, вправо";
        }

        return flatNumber + " кв, " + entrance + " подъезд, " + floor + " этаж, " + pos;
    }
}