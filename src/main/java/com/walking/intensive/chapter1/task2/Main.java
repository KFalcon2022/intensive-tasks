package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int floorAmount = 7;
        int entranceAmount = 8;
        int flatNumber = 98;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int floorCapacity = 4;
        int entranceCapacity = floorCapacity * floorAmount;

        if (floorAmount <= 0 || entranceAmount <= 0 || flatNumber <= 0) {
            return "Количество этажей, подъездов и номер квартиры должны быть положительными. " +
                    "Проверьте корректность введенных значений";
        }
        if (entranceCapacity * entranceAmount < flatNumber) {
            return "Квартира № " + flatNumber + " в данном здание не существует.";
        }

        int flatRemains = flatNumber % floorCapacity;

        String flatLocation = switch (flatRemains) {
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "справа от лифта, влево";
            default -> "справа от лифта, вправо";
        };

        int currentEntrance;
        int currentFloor;
        int entranceCount = flatNumber / entranceCapacity;
        int usedFloor = flatNumber / floorCapacity % floorAmount;

        if (flatNumber % entranceCapacity == 0) {
            currentEntrance = entranceCount;
            currentFloor = floorAmount;
        } else {
            currentEntrance = entranceCount + 1;
            currentFloor = flatRemains == 0 ? usedFloor : usedFloor + 1;
        }

        return flatNumber + " кв – " + currentEntrance + " подъезд, " + currentFloor + " этаж, " + flatLocation;
    }
}