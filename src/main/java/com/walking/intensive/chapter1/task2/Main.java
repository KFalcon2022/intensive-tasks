package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(getFlatLocation(3, 7, 1));
        System.out.println(getFlatLocation(3, 7, 15));
        System.out.println(getFlatLocation(3, 7, 84));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        final int flatsOnFloorAmount = 4;

        if (flatNumber <= 0) {
            return "Некорректное значение номера квартиры";
        }

        //Кол-во квартир в подъезде
        int entranceCapacity = floorAmount * flatsOnFloorAmount;

        if (flatNumber > entranceAmount * entranceCapacity) {
            return "Квартиры с таким номером в доме нет";
        }

        int entranceNum = (int) Math.ceil((float) flatNumber / entranceCapacity);
        int floorNum = (flatNumber % entranceCapacity == 0) ? floorAmount : (int) Math.ceil((float) (flatNumber % entranceCapacity) / flatsOnFloorAmount);

        int posOnTheFloor = flatNumber % flatsOnFloorAmount;

//       Компилятор ругался, хотя вроде java стоит 21
//       String posOnTheFloor = switch (posOnTheFloor) {
//            case 1:
//                yield  "слева от лифта, влево";
//            case 2:
//                yield "слева от лифта, вправо";
//            case 3:
//                yield "справа от лифта, влево";
//            default:
//                yield "справа от лифта, вправо";
//         };
        String posOnTheFloorStr;
        switch (posOnTheFloor) {
            case 1:
                posOnTheFloorStr = "слева от лифта, влево";
                break;
            case 2:
                posOnTheFloorStr = "слева от лифта, вправо";
                break;
            case 3:
                posOnTheFloorStr = "справа от лифта, влево";
                break;
            default:
                posOnTheFloorStr = "справа от лифта, вправо";
                break;
        }

        return String.format("%d подъезд, %d этаж, %s", entranceNum, floorNum, posOnTheFloorStr);

    }
}