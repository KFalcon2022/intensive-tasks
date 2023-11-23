package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floorAmount = 10;
        int entranceAmount = 3;
        int flatNumber = 40;
//        При увеличении кол-ва квартир на этаже необходимо добавить кейсы в метод getLocationOnFloor()
        int flatsOnFloor = 4;

        //System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber, flatsOnFloor));
        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int maxFlatInEntrance = floorAmount * 4;

        if (!isFlatInHouse(floorAmount, entranceAmount, flatNumber, 4)) {
            return "Такой квартиры не существует";
        }

//      Получаем нужный подъезд
        int entranceOfFlat = getEntranceOfFlat(flatNumber, maxFlatInEntrance);
//      Приводим номер квартиры под нумерацию квартир первого подъезда
        int convertedFlatNumber = getFlatAsFirstEntrance(flatNumber, entranceOfFlat, maxFlatInEntrance);
//      Получаем нужный этаж
        int floor = getFloorOfFlat(convertedFlatNumber, 4);
//      Определяем расположение квартиры на этаже
        String flatFloorLocation = getLocationOnFloor(convertedFlatNumber, 4);

        return flatNumber + " кв - " + entranceOfFlat + " подъезд, " + floor + " этаж, " + flatFloorLocation;
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber, int flatsOnFloor) {
        int maxFlatInEntrance = floorAmount * flatsOnFloor;

        if (isFlatInHouse(entranceAmount, flatNumber, floorAmount, flatsOnFloor)) {
            return "Такой квартиры не существует";
        }

//      Получаем нужный подъезд
        int entranceOfFlat = getEntranceOfFlat(flatNumber, maxFlatInEntrance);
//      Приводим номер квартиры под нумерацию квартир первого подъезда
        int convertedFlatNumber = getFlatAsFirstEntrance(flatNumber, entranceOfFlat, maxFlatInEntrance);
//      Получаем нужный этаж
        int floor = getFloorOfFlat(convertedFlatNumber, flatsOnFloor);
        String flatFloorLocation = getLocationOnFloor(convertedFlatNumber, flatsOnFloor);

        return flatNumber + " кв - " + entranceOfFlat + " подъезд, " + floor + " этаж, " + flatFloorLocation;
    }

    static boolean isFlatInHouse(int floorAmount, int entranceAmount, int flatNumber, int flatsOnFloor) {
        return flatNumber > 0 && flatNumber <= floorAmount * entranceAmount * flatsOnFloor;  //120
    }

    static int getEntranceOfFlat(int flatNumber, int maxFlatInEntrance) {
        int entrance = flatNumber / maxFlatInEntrance;

        if (flatNumber % maxFlatInEntrance == 0) {
            return entrance;
        } else {
            return entrance + 1;
        }
    }

    static int getFlatAsFirstEntrance(int flatNumber, int entranceOfFlat, int maxFlatInEntrance) {
        if (flatNumber > maxFlatInEntrance) {
            return flatNumber - maxFlatInEntrance * (entranceOfFlat - 1);
        } else {
            return flatNumber;
        }
    }

    static int getFloorOfFlat(int convertedFlatNumber, int maxFlatInEntrance) {

        if (convertedFlatNumber % maxFlatInEntrance == 0) {
            return convertedFlatNumber / maxFlatInEntrance;
        } else {
            return convertedFlatNumber / maxFlatInEntrance + 1;
        }
    }

    static String getLocationOnFloor(int convertedFlatNumber, int flatsOnFloor) {
        return switch (convertedFlatNumber % flatsOnFloor) {
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "справа от лифта, влево";
            case 0 -> "справа от лифта, вправо";
            default -> ", но не могу найти квартиру на этаже";
        };
    }
}