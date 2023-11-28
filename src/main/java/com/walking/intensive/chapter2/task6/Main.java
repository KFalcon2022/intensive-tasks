package com.walking.intensive.chapter2.task6;

public class Main {
    public static void main(String[] args) {

        int number1 = 24;
        int number2 = 24;

        System.out.println(getNOKAndNOD(number1, number2));
    }

    public static boolean isNotCorrectInput(int number1, int number2) {
        return number1 < 1 || number2 < 1;
    }

    public static boolean isSimple(int number1) {
        for (int i = 2; i <= number1 / 2; i++) {
            if (number1 % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getMinNumber(int number1, int number2) {
        return Math.min(number1, number2);
    }

    public static int getMaxNumber(int number1, int number2) {
        return Math.max(number1, number2);
    }

    public static String getNOKAndNOD(int number1, int number2) {
        if (isNotCorrectInput(number1, number2)) {
            return "Вводимое значение не должны быть меньше или равно 0";
        }

        int minNumber = getMinNumber(number1, number2);
        int maxNumber = getMaxNumber(number1, number2);

        if (minNumber == maxNumber || maxNumber % minNumber == 0) {
            return "Наименьшее общее кратное (НОК): " + maxNumber + "\nНаибольший общий делить (НОД): " + minNumber;
        }

        if (isSimple(maxNumber) && isSimple(minNumber)) {
            return "Наименьшее общее кратное (НОК): " + maxNumber * minNumber + "\nНаибольший общий делить (НОД): 1";
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