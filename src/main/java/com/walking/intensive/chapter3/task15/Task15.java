package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        // Пример использования
        int[][] city = {{2, 1}, {1, 3}};
        System.out.println("Максимальное количество этажей, которые можно добавить: " + getMaxFloors(city));
    }

    static int getMaxFloors(int[][] city) {
        int n = city.length;
        int[] maxRow = new int[n];
        int[] maxCol = new int[n];

        // Находим максимальные значения по строкам и столбцам
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxRow[i] = Math.max(maxRow[i], city[i][j]);
                maxCol[j] = Math.max(maxCol[j], city[i][j]);
            }
        }

        // Вычисляем возможное увеличение для каждого здания
        int totalIncrease = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int possibleIncrease = Math.min(maxRow[i], maxCol[j]) - city[i][j];
                totalIncrease += possibleIncrease;
            }
        }

        return totalIncrease;
    }
}