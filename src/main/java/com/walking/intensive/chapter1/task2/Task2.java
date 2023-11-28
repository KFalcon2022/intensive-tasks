package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
        int floorAmount = 2;
        int entranceAmount = 2;
        int flatNumber = 9;
        int secondFlatFloor = 4;

        if (inCorrectEnter(floorAmount, entranceAmount, flatNumber, secondFlatFloor)) {
            System.out.println(getFlatLocation(floorAmount, flatNumber, secondFlatFloor));
        }
    }

    public static String getFlatLocation(int floorAmount, int flatNumber, int secondFlatFloor) {

        int floorFlat = getFloorFlat(floorAmount, flatNumber, secondFlatFloor);
        int entranceFlat = getEntranceFlat(floorAmount, flatNumber, secondFlatFloor);
        String positionFlat = getPositionFlat(flatNumber, secondFlatFloor);
        return "Квартира номер " + flatNumber + " находится в подъезде номер " + entranceFlat + " на " + floorFlat + " этаже, " + positionFlat;

    }

    public static int getEntranceFlat(int floorAmount, int flatNumber, int secondFlatFloor) {

        return (int) Math.ceil((double) flatNumber / (floorAmount * secondFlatFloor));
    }

    public static int getFloorFlat(int floorAmount, int flatNumber, int secondFlatFloor) {
        return (int) Math.ceil(Math.ceil((double) flatNumber / secondFlatFloor) - ((getEntranceFlat(floorAmount, flatNumber, secondFlatFloor)-1) * floorAmount ));
    }

    public static boolean inCorrectEnter(int florAmount, int entranceAmount, int flatNumber, int secondFlatFloor) {
        if (florAmount < 1) {
            System.out.println("В доме нет подземных этажей");
            return false;
        }
        if (entranceAmount < 1) {
            System.out.println("В доме не может быть меньше одного подъезда");
            return false;
        }
        if (flatNumber < 1) {
            System.out.println("В доме не может быть квартиры с отрицательным номером");
            return false;
        }
        if (flatNumber > florAmount * entranceAmount * secondFlatFloor) {
            System.out.println("Такой квартиры в доме нет");
            return false;
        }
        return true;
    }

    public static String getPositionFlat(int flatNumber, int secondFlatFloor) {

        return switch (flatNumber % secondFlatFloor) {
            case 0 -> "справа от лифта, вправо";
            case 1 -> "справа от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "слева от лифта, влево";
            default -> "";

        };
    }

}
