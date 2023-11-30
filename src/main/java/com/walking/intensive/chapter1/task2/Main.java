package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {

    static final double FLATS_ON_FLOOR = 4.0;
    public static void main(String[] args) {

        int flatNumber = 82;
        int floorAmount = 11;
        int entranceAmount = 3;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        double mainFraction = flatNumber / FLATS_ON_FLOOR;
        String fullAnswer;

        if (floorAmount * 4 * entranceAmount > flatNumber) {
            int entrance = mainFraction > floorAmount ? (int) Math.ceil(mainFraction / floorAmount) : 1;
            int floor =  (int) Math.ceil(mainFraction) - floorAmount * (entrance - 1);
            fullAnswer = entrance + " подъезд, " + floor + " этаж, " + getFlatLocationOnFloor(mainFraction);
        } else {
            fullAnswer = "Такой квартиры нет";
        }
        return fullAnswer;
    }

    static String getFlatLocationOnFloor(double fraction) {
        double coordinate = fraction - (int) fraction;
        return switch ((int)(coordinate * 100)) {
            case 0 -> "справа от лифта, вправо";
            case 25 -> "слева от лифта, влево";
            case 50 -> "слева от лифта, вправо";
            case 75 -> "справа от лифта, влево";
            default -> "...оставайся в лифте...";
        };
    }
}