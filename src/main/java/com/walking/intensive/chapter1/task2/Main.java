package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(2, 7, 17));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода
        int rightEntrance;
        int rightFloor;
        String location;

        if (flatNumber > floorAmount * entranceAmount * 4) {
            return "Указанной квартиры в доме нету";
        }

        if (flatNumber % (4 * floorAmount) == 0) {
            rightEntrance = flatNumber / (4 * floorAmount);
        } else {
            rightEntrance = flatNumber / (4 * floorAmount) + 1;
        }

        if (flatNumber % (floorAmount * 4) == 0) {
            rightFloor = floorAmount;
        } else if (flatNumber % (floorAmount * 4) % 4 == 0) {
            rightFloor = flatNumber % (floorAmount * 4) / 4;
        } else {
            rightFloor = flatNumber % (floorAmount * 4) / 4 + 1;
        }


        switch (flatNumber % (floorAmount * 4) % 4) {
            case 0:
                location = "справа от лифта, вправо";
                break;
            case 1:
                location = "слева от лифта, влево";
                break;
            case 2:
                location = "слева от лифта, вправо";
                break;
            case 3:
                location = "справа от лифта, влево";
                break;
            default:
                location = "что-то пошло не так";
                break;
        }

        return flatNumber + " кв - " + rightEntrance + " подъезд, " + rightFloor + " этаж, " + location; // Заглушка. При реализации - удалить
    }
}