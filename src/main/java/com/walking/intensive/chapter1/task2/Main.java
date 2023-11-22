package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

                System.out.println(getFlatLocation(9, 12, 321));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int entrance = (flatNumber - 1) / (floorAmount * 4) + 1;
        int floor = ((flatNumber - 1) % (floorAmount * 4)) / 4 + 1;
        int searchFlat = flatNumber % 4;

        if (flatNumber <= 0 || flatNumber > floorAmount * entranceAmount * 4) {
            return "Такой квартиры в доме нет";
        }

        switch (searchFlat) {
            case 0:
                return flatNumber + " кв - " + entrance + " подъезд, " + floor + " этаж, справа от лифта, вправо";
            case 1:
                return flatNumber + " кв - " + entrance + " подъезд, " + floor + " этаж, слева от лифта, влево";
            case 2:
                return flatNumber + " кв - " + entrance + " подъезд, " + floor + " этаж, слева от лифта, вправо";
            case 3:
                return flatNumber + " кв - " + entrance + " подъезд, " + floor + " этаж, справа от лифта, влево";


        }
        return "Ошибка";
    }
}

