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
            return "Такой квартиры нет";
        }
        int entrance = (int) Math.ceil((double) flatNumber / ((double) flatsInEntrance));
        int floor = (int) Math.ceil((flatNumber % flatsInEntrance) / 4.0);
        if (floor == 0) {
            floor = floorAmount;
        }
        double location = (flatNumber % flatsInEntrance) / 4.0;
        location = location - (int) location;

        String text;
        if (location > 0.0 && location <= 0.25) {
            text = "слева от лифта, влево";
        } else if (location > 0.25 && location <= 0.5) {
            text = "слева от лифта, вправо";
        } else if (location > 0.5 && location <= 0.75) {
            text = "справа от лифта, влево";
        } else {
            text = "справа от лифта, вправо";
        }

        return flatNumber + " кв – " + entrance + " подъезд, " + floor + " этаж, " + text;
    }
}