package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int floorAmount = 3;
        int entranceAmount = 5;
        int flatNumber = 19;
        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        String result = "Такой квартиры нет";
        if (!isFlatTrue(floorAmount, entranceAmount, flatNumber)){
            return result;
        }
        String[] flatLocationOnFloor = {"справа от лифта, вправо", "слева от лифта, влево", "слева от лифта, вправо",
                "справа от лифта, влево"};
        result = flatNumber + " кв – "
                + getEntrancePosition(floorAmount, flatNumber) + " подъезд, "
                + getFloorPosition(floorAmount, flatNumber) + " этаж, "
                + flatLocationOnFloor[getFlatPosition(flatNumber)];
        return result;
    }

    static int getFlatPosition(int flatNumber){
        return flatNumber % 4;
    }

    static int getFloorPosition(int floorAmount, int flatNumber) {
        return (flatNumber - 1) % (floorAmount * 4) / 4 + 1;
    }

    static int getEntrancePosition(int floorAmount, int flatNumber){
        return (flatNumber - 1) / (floorAmount * 4) + 1;
    }

    static boolean isFlatTrue(int floorAmount, int entranceAmount, int flatNumber){
        return ((floorAmount * 4 * entranceAmount) >= flatNumber) && flatNumber > 0;
    }
}