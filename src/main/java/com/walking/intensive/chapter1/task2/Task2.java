package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
        int floorAmount = 10;
        int entranceAmount = 3;
        int flatNumber = 121;
        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int allFlats = floorAmount * entranceAmount * 4;
        // Validation
        if (flatNumber <= 0 || flatNumber > allFlats) {
            return "Такой квартиры не существует";
        }
        // Entrance Number
        int flatsAtEntrance = floorAmount * 4;
        int entranceNum = ((flatNumber - 1) / flatsAtEntrance + 1);
        // Floor Number
        int floorNum;
        if (flatNumber % flatsAtEntrance == 0) {
            floorNum = floorAmount;
        } else {
            floorNum = ((flatNumber % flatsAtEntrance - 1) / 4 + 1);
        }
        // Direction on floor
        String direction = "";
        switch (flatNumber % 4) {
            case 1 -> direction = "слева от лифта, влево";
            case 2 -> direction = "слева от лифта, вправо";
            case 3 -> direction = "справа от лифта, влево";
            case 0 -> direction = "справа от лифта, вправо";
        }

        return flatNumber + " кв - " +
                entranceNum + " подъезд, " +
                floorNum + " этаж, " +
                direction;
    }
}