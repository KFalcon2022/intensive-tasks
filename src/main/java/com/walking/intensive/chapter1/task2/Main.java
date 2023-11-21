package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int flatNumber = 9;


    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        String answer = "";
        String afterElevatorRight = "справа от лифта, ";
        String afterElevatorLeft = "слева от лифта, ";
        String finalTurnLeft = "влево";
        String finalTurnRight = "вправо";

        if (floorAmount * 4 * entranceAmount > flatNumber) {
            if (flatNumber > 4) {
                int floorCount = 1;
                int entranceCount = 0;
                while (flatNumber > 4) {
                    flatNumber -= 4;
                    floorCount += 1;
                }

        } else {
//                String prefix = "1 подъезд, 1 этаж";
//                String suffix = flatNumber % 2 == 0 ? finalTurnLeft : finalTurnRight;
            }
    } else { answer = "Такой квартиры нет"; }
        return answer;
    }
}