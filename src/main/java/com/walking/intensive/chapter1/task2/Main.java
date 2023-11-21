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
        int flatLimit = floorAmount * entranceAmount * flatOnFloor;

        if (flatNumber > flatLimit || flatNumber <= 0) {
            return "Такой квартиры в доме нет.";
        }
            int flatIndex = flatNumber - 1;
            int flatEnterance = flatIndex / (floorAmount * flatOnFloor) + 1;
            int flatFloor = (flatIndex / flatOnFloor) % floorAmount + 1;
            int flatPosition = flatIndex % flatOnFloor;
            String baseReturnString = String.format("%d кв – %d  подъезд, %d", flatNumber, flatEnterance, flatFloor);
           return switch (flatPosition) {
                case 1 ->  baseReturnString + " этаж, слева от лифта, влево";
                case 2 ->  baseReturnString + " этаж, слева от лифта, вправо";
                case 3 ->  baseReturnString + " этаж,справа от лифта, влево";
                case 0 ->  baseReturnString + " этаж, справа от лифта, вправо";
               default -> "";
            };



        }
    }
