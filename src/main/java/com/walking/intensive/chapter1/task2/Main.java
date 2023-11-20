package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int flatNumber = 71;
        int floorAmount = 9;
        int entranceAmount = 3;
        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        String flatLocation;
        int flatsPerFloor = 4;

        if (flatNumber > flatsPerFloor * floorAmount * entranceAmount) {
            flatLocation = "Такой квартиры нет в доме";
        } else {
            int flatsPerEntrance = flatsPerFloor * floorAmount;
            int entranceNumber = (int) Math.ceil((double) flatNumber / flatsPerEntrance);
            int floorNumber = (int) Math.ceil((double) (flatNumber - (entranceNumber - 1) * flatsPerEntrance) / flatsPerFloor);
            int positionOnFloor = flatNumber % flatsPerFloor;

            String positionMessage;
            if (positionOnFloor == 0) {
                positionMessage = "справа от лифта, вправо";
            } else if (positionOnFloor == 1) {
                positionMessage = "слева от лифта, влево";
            } else if (positionOnFloor == 2) {
                positionMessage = "слева от лифта, вправо";
            } else {
                positionMessage = "справа от лифта, влево";
            }

            flatLocation = flatNumber + " кв = " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + positionMessage;

        }
        return flatLocation;
    }
}
