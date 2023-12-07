package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city = {{1, 0, 2}, {1, 2, 1}, {3, 2, 0}};

        System.out.println(getMaxFloors(city));
    }

    static int getMaxFloors(int[][] city) {
        int count = 0;                          // Вводим счётчик

        for (int i = 0; i < city.length; i++) {                         // i номер строчки
            for (int j = 0; j < city[i].length; j++) {                  // j номер колонки
                count += getMaxBuildingHere(i, j, city) - city[i][j];   // Вычитаем максимальное количество этажей из нынешнего в точке, добавляем этажи к счётчику
            }
        }

        return count; // Вот и ответ, сколько этажей можно добавить без изменения линии горизонта
    }

    static int getMaxBuildingHere(int stringNumber, int columnNumber, int[][] city) { // Для этого пересечения колонки и столбца
        int stringMax = 0;

        for (int i = 0; i < city[stringNumber].length; i++) {
            if (city[stringNumber][i] > stringMax) {
                stringMax = city[stringNumber][i];      // Находим максимальное число на строчке
            }
        }
        int columnMax = 0;

        for (int i = 0; i < city.length; i++) {
            if (city[i][columnNumber] > columnMax) {
                columnMax = city[i][columnNumber]; // Находим максимальное число на колонке
            }
        }

        return Math.min(stringMax, columnMax); // Берем минимальное из них, тогда линия горизонта не пострадает ни с какой стороны!
    }


}
