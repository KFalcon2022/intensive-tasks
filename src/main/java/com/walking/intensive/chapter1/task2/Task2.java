package com.walking.intensive.chapter1.task2;


/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floorAmount = 10;
        int entranceAmount = 3;
        int flatNumber = 41;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int entranceCapacity = floorAmount * 4;

        if (!isFlatExists(floorAmount, entranceAmount, flatNumber, 4)) {
            return "Такой квартиры не существует";
        }

//      Получаем нужный подъезд
        int flatsEntrance = getFlatsEntrance(flatNumber, entranceCapacity);
//      Приводим номер квартиры под нумерацию квартир первого подъезда
        int castedFlatNumber = getFlatsCasting(flatNumber, flatsEntrance, entranceCapacity);
//      Получаем нужный этаж
        int floor = getFlatsFloor(castedFlatNumber, 4);
//      Определяем расположение квартиры на этаже
        String floorFlatLocation = getLocationOnFloor(castedFlatNumber, 4);

        return flatNumber + " кв - " + flatsEntrance + " подъезд, " + floor + " этаж, " + floorFlatLocation;
    }

    static boolean isFlatExists(int floorAmount, int entranceAmount, int flatNumber, int floorCapacity) {
        return flatNumber > 0 && flatNumber <= floorAmount * entranceAmount * floorCapacity;
    }

    static int getFlatsEntrance(int flatNumber, int entranceCapacity) {
        int entrance = flatNumber / entranceCapacity;

        return flatNumber % entranceCapacity == 0 ? entrance : entrance + 1;
    }

    static int getFlatsCasting(int flatNumber, int flatsEntrance, int entranceCapacity) {
        return flatNumber > entranceCapacity ? flatNumber - entranceCapacity * (flatsEntrance - 1) : flatNumber;
    }

    static int getFlatsFloor(int castedFlatNumber, int floorCapacity) {
        return castedFlatNumber % floorCapacity == 0 ? castedFlatNumber / floorCapacity :
                castedFlatNumber / floorCapacity + 1;
    }

    static String getLocationOnFloor(int entranceCapacity, int floorCapacity) {
        return switch (entranceCapacity % floorCapacity) {
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "справа от лифта, влево";
            case 0 -> "справа от лифта, вправо";
            default -> ", но не могу найти квартиру на этаже";
        };
    }
}