package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(6, 10, 239));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int flatOnFloor = 4;
        String resultString="";

        if (flatNumber > (floorAmount * entranceAmount * 4) || flatNumber <= 0) {
            return "Такой квартиры в доме нет.";
        }

        else {

            int flatEnterance = (flatNumber - 1) / (floorAmount * flatOnFloor) + 1;
            int flatFloor = ((flatNumber - 1) / flatOnFloor) % floorAmount + 1;
            int flatCoordinates = (flatNumber - 1) % flatOnFloor + 1;

            switch (flatCoordinates) {
                case 1:
                    resultString = flatNumber + " кв – " + flatEnterance + " подъезд, " + flatFloor + " этаж, слева от лифта, влево";
                    break;
                case 2:
                    resultString = flatNumber + " кв – " + flatEnterance + " подъезд, " + flatFloor + " этаж, слева от лифта, вправо";
                    break;
                case 3:
                    resultString = flatNumber + " кв – " + flatEnterance + " подъезд, " + flatFloor + " этаж,справа от лифта, влево";
                    break;
                case 4:
                    resultString = flatNumber + " кв – " + flatEnterance + " подъезд, " + flatFloor + " этаж, справа от лифта, вправо";
                    break;
            }

            return resultString;

        }
    }
}