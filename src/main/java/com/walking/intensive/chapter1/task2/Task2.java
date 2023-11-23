package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {


    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floorAmount = 10;
        int entranceAmount = 3;
        int flatNumber = 81;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода
        int totalFlatsAmount = floorAmount * 4 * entranceAmount; //общее количество квартир

        if (0 < flatNumber && flatNumber <= totalFlatsAmount) {
            int entranceNumber; // номер подъезда
            int floor; // этаж на котором находится квартира

            if (flatNumber % (floorAmount * 4) == 0) {
                entranceNumber = flatNumber / (floorAmount * 4);
            } else {
                entranceNumber = (flatNumber / (floorAmount * 4)) + 1;
            }

            if ((flatNumber % 4) == 0 ) {
                floor = (flatNumber  - ((entranceNumber - 1) * floorAmount * 4)) / 4;
            } else {
                floor = ((flatNumber  - ((entranceNumber - 1) * floorAmount * 4)) / 4) + 1;
            }


            String elevatorSide; //сторона от лифта. Лифт по центру - две квартиры слева, две справа.
            if (flatNumber % 4 == 1 || flatNumber % 4 == 2) {
                elevatorSide = "слева";
            } else {
                elevatorSide = "справа";
            }

            String sideDirection; // направление к квартире. Совпадает с направлением от лифта
            if (flatNumber % 4 == 1 || flatNumber % 4 == 2) {
                sideDirection = "влево";
            } else {
                sideDirection = "вправо";
            }


            return flatNumber + " кв - " + entranceNumber + " подъезд, " + floor + " этаж, "
                    + elevatorSide + " от лифта, " + sideDirection;

        } else {
            return "Такой квартиры не существует";
        }
    }
}
