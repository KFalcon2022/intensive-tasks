package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floorAmount = -2;
        int entranceAmount = -3;
        int flatNumber = 11;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        final int FLOOR_FLAT_AMOUNT = 4;
        String flatLocation;

        if (floorAmount <= 0 || entranceAmount <= 0 || flatNumber <= 0) {
            flatLocation = "Введены некорректные данные.";
        } else {
            int flatAmount = FLOOR_FLAT_AMOUNT * floorAmount * entranceAmount;
            if (flatNumber > flatAmount) {
                flatLocation = "Квартиры с указанным номером нет. Проверьте введённые данные.";
            } else {
                int entranceNumber;
                int entranceFlatAmount = FLOOR_FLAT_AMOUNT * floorAmount;
                int divisionEntranceNumber = flatNumber / entranceFlatAmount;

                if (flatNumber % entranceFlatAmount == 0) {
                    entranceNumber = divisionEntranceNumber;
                } else {
                    entranceNumber = ++divisionEntranceNumber;
                }

                int floorNumber;
                int divisionFloorNumber =
                        (flatNumber - (entranceNumber - 1) * entranceFlatAmount) / FLOOR_FLAT_AMOUNT;

                if (flatNumber % FLOOR_FLAT_AMOUNT == 0) {
                    floorNumber = divisionFloorNumber;
                } else {
                    floorNumber = ++divisionFloorNumber;
                }

                String floorPlace;
                int modFloorFlatAmount = flatNumber % FLOOR_FLAT_AMOUNT;

                switch (modFloorFlatAmount) {
                    case 1:
                        floorPlace = "слева от лифта, влево";
                        break;
                    case 2:
                        floorPlace = "слева от лифта, вправо";
                        break;
                    case 3:
                        floorPlace = "справа от лифта, влево";
                        break;
                    default:
                        floorPlace = "справа от лифта, вправо";
                }
                flatLocation = String.format("%d кв - %d подъезд, %d этаж, %s",
                        flatNumber, entranceNumber, floorNumber, floorPlace);
            }
        }
        return flatLocation;
    }
}