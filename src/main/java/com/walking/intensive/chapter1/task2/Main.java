package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе

        System.out.println(getFlatLocation(5,4,16));

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        String answer;
        int flatAmount = 4;

        if (flatAmount*floorAmount*entranceAmount < flatNumber){
            answer = "Такой квартиры нет в доме";
        }else {

            int entrance = flatNumber / (floorAmount * flatAmount);
            answer = "" + (entrance + 1) + " подъезд, ";

            int flatNumberEntrance = flatNumber - entrance * floorAmount * flatAmount;
            int floor = flatNumberEntrance / flatAmount;
            answer += (floor + 1) + " этаж, ";

            int flatLocation = flatNumberEntrance - floor*flatAmount;

            if (flatLocation == 1 | flatLocation == 2){
                answer += "слева от лифта, ";
            }else {
                answer += "справа от лифта, ";
            }

            if ((flatLocation % 2) == 1){
                answer += "влево";
            }else {
                answer += "вправо";
            }
        }
        return answer;
    }
}