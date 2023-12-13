package com.walking.intensive.chapter1.task2;



/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floorAmount = 6;
        int entranceAmount = 2;
        int flatNumber = 19;

        printFlatLocation(floorAmount, entranceAmount, flatNumber);

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int numberOfFlatsOnStorey = 4;

        if (flatNumber > (floorAmount * entranceAmount * numberOfFlatsOnStorey) || flatNumber < 1) {
            return "Такой квартиры не существует!";
        }

        return findStoreyAndFlat(flatNumber, floorAmount, numberOfFlatsOnStorey);
    }

    static void printFlatLocation(int floorAmount, int entranceAmount, int flatNumber){
        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static int getNumberOfFlatsInEntrance(int floorAmount, int numberOfFlatsOnStorey) {
        return floorAmount * numberOfFlatsOnStorey;
    }

    static int getNumberOfEntrance(int flatNumber, int floorAmount, int numberOfFlatsOnStorey) {
        double numberOfEntrance = (double) flatNumber/getNumberOfFlatsInEntrance(floorAmount,numberOfFlatsOnStorey);
        return (int) Math.ceil(numberOfEntrance);
    }

    static int getNumberOfFirstFlatOnStorey(int flatNumber, int floorAmount, int numberOfFlatsOnStorey) {
        int numberOfFirstFlatOnStorey = (getNumberOfEntrance(flatNumber, floorAmount, numberOfFlatsOnStorey) - 1) * getNumberOfFlatsInEntrance(floorAmount, numberOfFlatsOnStorey) + 1;
        return numberOfFirstFlatOnStorey;
    }

    static String findStoreyAndFlat(int flatNumber, int floorAmount, int numberOfFlatsOnStorey) {
        int[][] storeyArray = new int[floorAmount][numberOfFlatsOnStorey];

        String flatLocation;
        int storeyOfFlat = 0;
        int locationOfFlat = 0;
        int flatNumberForArray = getNumberOfFirstFlatOnStorey(flatNumber, floorAmount, numberOfFlatsOnStorey);

        outer:
        for (int i = 0; i < floorAmount; i++) {
            for (int j = 0; j < numberOfFlatsOnStorey; j++) {
                storeyArray[i][j] = flatNumberForArray;
                    if (flatNumberForArray == flatNumber) {
                        storeyOfFlat = i + 1;
                        locationOfFlat = j;
                        break outer;
                    }
                flatNumberForArray++;
            }
        }

        if (locationOfFlat == 0) {
            flatLocation = " этаж, слева от лифта, влево";
        } else if (locationOfFlat == 1) {
            flatLocation = " этаж, слева от лифта, вправо";
        } else if (locationOfFlat == 2) {
            flatLocation = " этаж, справа от лифта, влево";
        } else {
            flatLocation = " этаж, справа от лифта, вправо";
        }

        return flatNumber + " кв - " + getNumberOfEntrance(flatNumber, floorAmount, numberOfFlatsOnStorey) + " подъезд, " + storeyOfFlat + flatLocation;
    }
}