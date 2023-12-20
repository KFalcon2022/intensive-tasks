package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {
    }

    //        Для собственных проверок можете делать любые изменения в этом методе
    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flat = 1;
        boolean flag = false;
        int[][][] mass = new int[entranceAmount][floorAmount][4];
        for (int i = 0; i < entranceAmount; i++) {
            for (int j = 0; j < floorAmount; j++) {
                for (int k = 0; k < 4; k++) {
                    mass[i][j][k] = flat++;
                }
            }
        }
        for (int i = 0; i < entranceAmount; i++) {
            for (int j = 0; j < floorAmount; j++) {
                for (int k = 0; k < 4; k++) {
                    if (flatNumber == mass[i][j][k] && k == 0) {
                        return (flatNumber + " кв - " + (i + 1) + " подъезд, " + (j + 1) + " этаж, слева от лифта, влево");
                    }
                    if (flatNumber == mass[i][j][k] && k == 1) {
                        return (flatNumber + " кв - " + (i + 1) + " подъезд, " + (j + 1) + " этаж, слева от лифта, вправо");
                    }
                    if (flatNumber == mass[i][j][k] && k == 2) {
                        return (flatNumber + " кв - " + (i + 1) + " подъезд, " + (j + 1) + " этаж, справа от лифта, влево");
                    }
                    if (flatNumber == mass[i][j][k] && k == 3) {
                        return (flatNumber + " кв - " + (i + 1) + " подъезд, " + (j + 1) + " этаж, справа от лифта, вправо");
                    } else {
                        flag = true;
                    }
                }
            }
        }
        return (flag ? "Такой квартиры не существует" : "");
    }
}