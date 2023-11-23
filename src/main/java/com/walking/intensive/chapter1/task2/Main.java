package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>

 */
public class Main {
    public static void main(String[] args) {
        int flatNumber = 13;
        int entranceAmount = 7;
        int floorAmount = 5;

        System.out.println(getFlatLocation(flatNumber, entranceAmount, floorAmount));
    }

    static String getFlatLocation(int flatNumber, int entranceAmount, int floorAmount) {
        int flatsPerFloor = 4;
        int flatsPerFrontEntrance = floorAmount * flatsPerFloor;

        if (flatNumber < 1 || flatNumber > entranceAmount * flatsPerFrontEntrance) {
            return "Квартири не существует";
        }

        int entrance = (flatNumber - 1) / flatsPerFrontEntrance + 1;
        int floor = ((flatNumber - 1) % flatsPerFrontEntrance) / flatsPerFloor + 1;
        int flatPosition = (flatNumber - 1) % flatsPerFloor;
        String position;

        switch (flatPosition) {
            case 0:
                position = "слева от лифта, влево";
                break;
            case 1:
                position = "слева от лифта, вправо";
                break;
            case 2:
                position = "справа от лифта, влево";
                break;
            case 3:
                position = "справа от лифта, вправо";
                break;
            default:
                position = "Квартири не существует";
                break;
        }

        return "Подъезд: " + entrance + ", этаж: " + floor + ", квартира: " + flatNumber + " " + position;
    }
}