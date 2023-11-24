package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(10, 3, 45));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        if (flatNumber > floorAmount * entranceAmount * 4 || flatNumber <= 0) {
            return "Такой квартиры не существует";
        }
        //номер подъезда = номер кв / (этажи * 4), округляем в большую сторону
        long entranseNumber = Math.round(Math.ceil((Double.valueOf(flatNumber) / (floorAmount * 4))));
        //номер этажа = номер кв - ((номер подъезда - 1) * 4 * количество этажей)/4, округляем в большую сторону
        long floorNumber = Math.round(Math.ceil(Double.valueOf(flatNumber - ((entranseNumber - 1) * 4 * floorAmount)) / 4));
        String strResult = flatNumber + " кв - " + entranseNumber + " подъезд, " + floorNumber + " этаж, ";
        switch (flatNumber % 4) {
            case (1):
                strResult += "слева от лифта, влево";
                break;
            case (2):
                strResult += "слева от лифта, вправо";
                break;
            case (3):
                strResult += "справа от лифта, влево";
                break;
            case (0):
                strResult += "справа от лифта, вправо";
                break;
        }
        return strResult;
    }
}