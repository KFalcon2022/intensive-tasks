package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
        int floorAmount = 10;
        int entranceAmount = 3;
        int flatNumber = 88;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        if (inCorrectEnter(floorAmount, entranceAmount, flatNumber)) {

            int floorFlat = getFloorFlat(floorAmount, flatNumber);
            int entranceFlat = getEntranceFlat(floorAmount, flatNumber);
            String positionFlat = getPositionFlat(flatNumber);

            return flatNumber + " кв - " + entranceFlat + " подъезд, " + floorFlat + " этаж, " + positionFlat;
        }
        return "";

    }

    public static int getEntranceFlat(int floorAmount, int flatNumber) {

        return (int) Math.ceil((double) flatNumber / (floorAmount * 4));
    }

    public static int getFloorFlat(int floorAmount, int flatNumber) {
        return (int) Math.ceil(Math.ceil((double) flatNumber / 4) - ((getEntranceFlat(floorAmount, flatNumber) - 1) * floorAmount));
    }

    public static boolean inCorrectEnter(int florAmount, int entranceAmount, int flatNumber) {
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
        if (flatNumber > florAmount * entranceAmount * 4) {
            System.out.println("Такой квартиры в доме нет");
            return false;
        }
        return true;
    }

    public static String getPositionFlat(int flatNumber) {

        return switch (flatNumber % 4) {
            case 0 -> "справа от лифта, вправо";
            case 1 -> "справа от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "слева от лифта, влево";
            default -> "";

        };
    }

}
