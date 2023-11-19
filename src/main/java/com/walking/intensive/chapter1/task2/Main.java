package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(getFlatLocation(2, 1, 2));
    }


    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        String result;
        int flatsPerFloor = 4;
        int entrance = 1 + (flatNumber / (floorAmount * flatsPerFloor));
        int floor = 1 + flatNumber / flatsPerFloor;

        if ((flatNumber % (floorAmount * flatsPerFloor)) == 0) {       // Этот и следующие 2 блока if не обязательны, но я не справился с выводом формул, :(
            entrance -= 1;                                             // Буду рад если выложите разбор этой задачи в будущем
        }

        if ((flatNumber % flatsPerFloor) == 0) {
            floor -= 1;
        }

        if (floor > floorAmount) {
            floor = floor - floorAmount * (entrance - 1);
        }

        if (flatNumber <= 0 || entranceAmount < entrance) {
            result = "Такой квартиры в доме нет";
        } else if (flatNumber % flatsPerFloor == 1) {
            result = entrance + " подъезд, " + floor + " этаж, слева от лифта, влево";
        } else if (flatNumber % flatsPerFloor == 2) {
            result = entrance + " подъезд, " + floor + " этаж, слева от лифта, вправо";
        } else if (flatNumber % flatsPerFloor == 3) {
            result = entrance + " подъезд, " + floor + " этаж, справа от лифта, влево";
        } else {
            result = entrance + " подъезд, " + floor + " этаж, справа от лифта, вправо";
        }
        return result;
    }
}