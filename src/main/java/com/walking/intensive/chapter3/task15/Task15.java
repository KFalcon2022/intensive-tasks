package com.walking.intensive.chapter3.task15;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city1 = {{2, 1}, {1, 3}};
        int[][] city2 = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.println(getMaxFloors(city1));
        System.out.println(getMaxFloors(city2));
    }

    static int getMaxFloors(int[][] city) {
        int min = 0;
        int max = 0;
        int[] temp = new int[city.length];
        for (int i = 0; i < city.length; i++) {
           min=0;
           max=0;
            for (int j = 0; j < city[i].length; j++) {
                if (city[i][j] < min) {
                    min = city[i][j];
                }
                if (city[i][j] > max) {
                    max = city[i][j];
                }
            }
            temp[i] = max - min;
        }
        System.out.println(Arrays.toString(temp));
        min=temp[0];
        for (int i = 1; i < temp.length; i++) {
            if(temp[i]<min){
                min=temp[i];
            }
        }
        return min;
    }
}