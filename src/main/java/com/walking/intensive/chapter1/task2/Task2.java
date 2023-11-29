package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 * <p>
 * кол-во квартир на этаже
 */
public class Task2 {

    /**
     * кол-во квартир на этаже
     */
    public static final int FLATS_PER_FLOOR = 4;

    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int floorAmount = 4;
        int enteranceAmount = 3;
        int flatNumber = 25;

        System.out.println(getFlatLocation(floorAmount, enteranceAmount, flatNumber));


    }

    static String checkPossibilityExecution(int floorAmount, int enteranceAmount, int flatNumber) {

        if (floorAmount <= 0) {
            return "Неверное количество этажей";
        }

        if (enteranceAmount <= 0) {
            return "Неверное количество подъездов";
        }

        if ((flatNumber <= 0 || flatNumber > (floorAmount * enteranceAmount * FLATS_PER_FLOOR))) {
            return "Такой квартиры в доме нет";
        }
        return null;

    }

    static int getFlatPerEntrance(int floorAmount) {

        return floorAmount * FLATS_PER_FLOOR;

    }

    static String getEnteranceNumber(int flatNumber, int flatPerEntrance) {


        double entranceNumber = Math.ceil((double) flatNumber / (double) flatPerEntrance);
        return Integer.toString((int) entranceNumber);


    }

    static int getFlatRemainderForEntrance(int flatNumber, int flatPerEntrance) {

        double prevEntranceNumber = Math.floor((double) flatNumber / (double) flatPerEntrance);
        return flatNumber - (int) prevEntranceNumber * flatPerEntrance;


    }

    static String getFloorNumber(int flatRemainderForEntrance) {



        double floorNumber = Math.ceil((double) flatRemainderForEntrance / (double) FLATS_PER_FLOOR);
        return Integer.toString((int) floorNumber);


    }

    static String getPosFromElevator(int flatRemainderForEntrance){

        int floorNumber = Integer.parseInt(getFloorNumber(flatRemainderForEntrance));
        int flatRemainderForFloor = flatRemainderForEntrance - floorNumber * FLATS_PER_FLOOR;
        String posFromElevator = flatRemainderForFloor < 2 ? "слева от лифта" : "справа от лифта";
        String direction = flatRemainderForFloor % 2 == 0 ? "вправо" : "влево";
        return posFromElevator + ", " + direction + ".";
    }

    static String getFlatLocation(int floorAmount, int enteranceAmount, int flatNumber) {
        //        Место для вашего кода

        String check = checkPossibilityExecution(floorAmount, enteranceAmount, flatNumber);

        if (check != null) {
            return check;
        }

        int flatPerEntrance = getFlatPerEntrance(floorAmount);
        int flatRemainderForEntrance = getFlatRemainderForEntrance(flatNumber, flatPerEntrance);
        String entranceNumber = getEnteranceNumber(flatNumber, flatPerEntrance);
        String floorNumber = getFloorNumber(flatRemainderForEntrance);
        String posFromElevator = getPosFromElevator(flatRemainderForEntrance);

        return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + posFromElevator;
    }

}



