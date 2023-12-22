package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flat = flatNumber, pod = 0, floor = 0;
        String n = null;
        if (flatNumber < 0 || flatNumber > (floorAmount * entranceAmount * 4)) {
            return ("Такой квартиры не существует");
        } else {
            for (int i = flatNumber; i > 0; i -= 4 * floorAmount) {
                pod++;
            }
            for (int i = flatNumber; i > 0; i -= 4) {
                flat = i;
            }
            for (int i = 0; i < flatNumber; i += 4) {
                floor++;
            }
            if (floor > floorAmount) {
                floor = floor - (pod - 1) * floorAmount;
            }

            switch (flat) {
                case 1:
                    n = " этаж, слева от лифта, влево";
                    break;
                case 2:
                    n = " этаж, слева от лифта, вправо";
                    break;
                case 3:
                    n = " этаж, справа от лифта, влево";
                    break;
                case 4:
                    n = " этаж, справа от лифта, вправо";
                    break;
            }
            return (flatNumber + " кв - " + pod + " подъезд, " + floor + n);
        }
    }
}