package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(2, 2, 5));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода


        if (flatNumber > floorAmount * entranceAmount * 4) {
            return "Нет такой квартиры";
        }

        int rightEntrance;
        String rightFlat;
        int rightFloor;

        if (flatNumber % (4 * floorAmount) == 0) {
            rightEntrance = flatNumber / (4 * floorAmount);
        } else {
            rightEntrance = flatNumber / (4 * floorAmount) + 1;
        }

        if (flatNumber % (4 * floorAmount) == 0) {
            rightFloor = floorAmount;
        } else {
            rightFloor = flatNumber % (4 * floorAmount) / 4 + 1;
        }

        switch (flatNumber % 4) {
            case (0):
                rightFlat = "справа от лифта, вправо";
                break;
            case (1):
                rightFlat = "слева от лифта, влево";
                break;
            case (2):
                rightFlat = "слева от лифта, вправо";
                break;
            case (3):
                rightFlat = "справа от лифта, влево";
                break;
            default:
                rightFlat = "неверные данные";
                break;

        }
        return flatNumber + " кв - " + rightEntrance + " подъезд, " + rightFloor + " этаж, " + rightFlat;
    }
}