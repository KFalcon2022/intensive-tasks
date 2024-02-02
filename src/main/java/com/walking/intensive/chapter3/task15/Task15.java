package com.walking.intensive.chapter3.task15;


/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city = {{3, 2, 4},                           //      | 3 | 2 | 4 |
                        {2, 5, 4},                          //      | 2 | 5 | 4 |
                        {1, 2, 0}};                        //      | 1 | 2 | 0 |

        System.out.println(getFloors(city));
    }

    static int getFloors(int[][] city) {
        int[] maxNumHorizontal = getMaxHorizontal(city);
        int[] maxNumVertical = getMaxVertical(city);
        int floors = 0;

        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                if(city[i][j] <= maxNumHorizontal[i] && city[i][j] <= maxNumVertical[j]){
                    floors += Math.min(maxNumHorizontal[i], maxNumVertical[j]) - city[i][j];
                }
            }
        }

        return floors;
    }

    static int[] getMaxHorizontal(int[][] city) {
        int[] maxNum = new int[city.length];
        int temp = 0;

        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                if (city[i][j] > temp) {
                    temp = city[i][j];
                    maxNum[i] = temp;
                }
            }
            temp = 0;
        }

        return maxNum;
    }

    static int[] getMaxVertical(int [][] city){
        int[] maxNum = new int[city.length];
        int temp = 0;

        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                if (city[j][i] > temp) {
                    temp = city[j][i];
                    maxNum[i] = temp;
                }
            }
            temp = 0;
        }

        return maxNum;
    }
}