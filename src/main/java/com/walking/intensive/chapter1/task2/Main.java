package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int flatNumber = 73;
        int floorAmount = 9;
        int entranceAmount = 3;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        String flatLocation;
        final int flatsPerFloor = 4;

        if (flatNumber > flatsPerFloor * floorAmount * entranceAmount || flatNumber <= 0 ||
                floorAmount <= 0 || entranceAmount <= 0) {
            flatLocation = "Такой квартиры нет в доме";
        } else {
            int flatsPerEntrance = flatsPerFloor * floorAmount;
            int entranceNumber = (int) Math.ceil((double) flatNumber / flatsPerEntrance);
            int floorNumber = (int) Math.ceil((double) (flatNumber - (entranceNumber - 1) * flatsPerEntrance) / flatsPerFloor);
            int positionOnFloor = flatNumber % flatsPerFloor;

            String positionMessage = switch (positionOnFloor) {
                case 0 -> "справа от лифта, вправо";
                case 1 -> "слева от лифта, влево";
                case 2 -> "слева от лифта, вправо";
                default -> "справа от лифта, влево";
            };

            flatLocation = flatNumber + " кв = " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + positionMessage;
        }

        return flatLocation;
    }
}
