package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(getFlatLocation(4, 3, 5));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flatAmount = 0;
        int entranceNumber = 0; //номер подъезда
        int floorNumber = 0; //номер этажа
        String result = "";
        String direction = "";

        flatAmount = 4 * floorAmount * entranceAmount;
        if (flatNumber > flatAmount || flatNumber <= 0) {
            return "Такой квартиры нет";
        }
        entranceNumber = (int) (Math.ceil((double) flatNumber / 4 / floorAmount));
        floorNumber = ((int) (Math.ceil((double) flatNumber / 4))) % floorAmount;
        System.out.println(flatNumber % 4);
        switch (flatNumber % 4) {
            case (1):
                direction = "слева от лифта, влево";
                break;
            case (2):
                direction = "слева от лифта, вправо";
                break;
            case (3):
                direction = "справа от лифта, влево";
                break;
            case (0):
                direction = "справа от лифта, вправо";
                break;
        }
        result = flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + direction;
        return result; // Заглушка. При реализации - удалить
    }
}