package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] array = {{9, 3, 6}, {8, 0, 1}, {3, 6, 7}};
        System.out.println(getMaxFloors(array));

    }

    static int getMaxFloors(int[][] city) {
        int result = 0;

        for (int i = 0; i < city.length; i++) {

            for (int j = 0; j < city[i].length; j++) {
                int maxPermissibleValue = Math.min(getMaxHorizontalValue(city[i]), getMaxVerticalValue(city, j));

                if (city[i][j] < maxPermissibleValue) {
                    result += maxPermissibleValue - city[i][j];
                }
            }
        }
        return result;
    }

    static int getMaxHorizontalValue(int[] array) {
        int maxValue = 0;
        
        for (int i = 0; i < array.length; i++) {

            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    static int getMaxVerticalValue(int[][] array, int index) {

        int[] tempArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i][index];
        }

        int maxValue = 0;

        for (int i = 0; i < tempArray.length; i++) {

            if (maxValue < tempArray[i]) {
                maxValue = tempArray[i];
            }
        }
        return maxValue;
    }
}