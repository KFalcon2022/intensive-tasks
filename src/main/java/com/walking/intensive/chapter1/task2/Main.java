package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floorAmount = 30;
        int entranceAmount = 9;
        for (int i = 1; i < floorAmount * entranceAmount * 4 + 3; i++) {
            System.out.println(getFlatLocation(floorAmount, entranceAmount, i));
        }
        //System.out.println(getFlatLocation(floorAmount, entranceAmount, 36));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        Место для вашего кода
        int maxFlats = floorAmount * entranceAmount * 4;
        int flatsInEntrance = floorAmount * 4;
        if (flatNumber > maxFlats) {
            return "Квартиры в доме нет";
        }
        int orderOfFlatInEntrance = flatNumber % flatsInEntrance;
        //ищем номер подъезда делением номера квартиры на количество квартир в подъезде + 1
        int entranceNumber = flatNumber / flatsInEntrance + (orderOfFlatInEntrance == 0 ? 0 : 1);

        int orderOfFlatAtFloor = orderOfFlatInEntrance % 4;
        //ищем номер этажа (порядковый номер квартиры в подъезде делим на кол-во квартир на этаже)
        int floorNumber = (orderOfFlatInEntrance==0?floorAmount:orderOfFlatInEntrance/4) + (orderOfFlatAtFloor == 0 ? 0 : 1);
        String endOfReturnalText = switch (orderOfFlatAtFloor) {
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "справа от лифта, влево";
            case 0 -> "справа от лифта, вправо";
            default -> "";
        };
        return String.format("%d кв – %d подъезд, %d этаж, %s", flatNumber, entranceNumber, floorNumber, endOfReturnalText);
    }
}