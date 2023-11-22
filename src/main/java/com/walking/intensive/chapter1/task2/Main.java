package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(4, 3, 45));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int flatQuantity = floorAmount*entranceAmount*4;
        int position = flatNumber % 4;
        String positionStr = "empty";

        switch (position) {
            case (0):
                positionStr = "справа от лифта, вправо";
                break;
            case (1):
                positionStr = "слева от лифта, влево";
                break;
            case (2):
                positionStr = "слева от лифта, вправо";
                break;
            case (3):
                positionStr = "справа от лифта, влево";
                break;
        }

        if (flatNumber>flatQuantity|flatNumber==0) {
            return "Квартиры не существует";
        }
        else {
            return flatNumber + " кв - " + ((flatNumber-1)/(floorAmount*4)+1) + " подъезд, " + ((((flatNumber-(((flatNumber-1)/(floorAmount*4)))*(floorAmount*4))-1)/4)+1) + " этаж, " + positionStr;
        }

    }
}