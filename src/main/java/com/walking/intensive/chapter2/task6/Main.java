package com.walking.intensive.chapter2.task6;

public class Main {
    public static void main(String[] args) {

        int number1 = 4791;
        int number2 = 126;

        System.out.println(getNOKAndNOD(number1, number2));
    }

    public static boolean isNotCorrectInput(int number1, int number2) {
        return number1 < 1 || number2 < 1;
    }

    public static String getNOKAndNOD(int number1, int number2) {

        if (isNotCorrectInput(number1, number2)) {

            return "Вводимое значение не должны быть меньше или равно 0";
        }

        int minNumber = Math.min(number1, number2);
        int maxNumber = Math.max(number1, number2);

        if (minNumber == maxNumber || maxNumber % minNumber == 0) {

            return "Наименьшее общее кратное (НОК): " + maxNumber + "\nНаибольший общий делить (НОД): " + minNumber;
        }

        int valueNOD = getNOD(maxNumber, minNumber);
        int valueNOK = (maxNumber * minNumber) / valueNOD;

        return "Наименьшее общее кратное (НОК): " + valueNOK + "\nНаибольший общий делить (НОД): " + valueNOD;
    }

    public static int getNOD(int valueA, int valueB) {
        boolean isNOD = true;
        int valueNOD = 0;
        int remainDiv;
        int factorFromAB;
        while (isNOD) {
            factorFromAB = valueA / valueB;
            remainDiv = valueA - (factorFromAB * valueB);
            if (valueA % valueB == 0) {
                valueNOD = valueB;
                isNOD = false;
            }
            valueA = valueB;
            valueB = remainDiv;
        }

        return valueNOD;
    }
}