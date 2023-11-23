
package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {


    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(10, 3, 121));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int numberFlatsPerFloor = 4;
        int numberFlats = floorAmount * entranceAmount * numberFlatsPerFloor;
        int entranceNumber = (flatNumber - 1) / (floorAmount * numberFlatsPerFloor) + 1;
        int floorNumber = (flatNumber - (floorAmount * numberFlatsPerFloor) * (entranceNumber - 1) - 1) / numberFlatsPerFloor + 1;

        if (flatNumber > numberFlats || flatNumber < 0) {
            return "В дома нет квартиры с таким номером.";
        }

        String flatPosition = null;
        if (flatNumber % 4 == 0) {
            flatPosition = "справа от лифта, вправо";
        }
        if (flatNumber % 3 == 0 && flatNumber % 2 != 0) {
            flatPosition = "справа от лифта, влево";
        }
        if (flatNumber % 2 == 0 && flatNumber % 4 != 0) {
            flatPosition = "слева от лифта, вправо";
        }
        if (flatNumber % 4 == 1) {
            flatPosition = "слева от лифта, влево";
        }

        return flatNumber + " кв – " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + flatPosition;
    }
}