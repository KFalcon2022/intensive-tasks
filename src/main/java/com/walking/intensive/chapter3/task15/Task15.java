package main.java.com.walking.intensive.chapter3.task15;


/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.println(getMaxFloors(city));
    }

    public static int getMaxFloors(int[][] city) {
        int result = 0;
        int countCell;

        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                countCell = city[i][j];
                result += Math.min(getMaxFloorInLine(city, i), getMaxFloorInColumn(city, j)) - countCell;
            }
        }
        return result;
    }

    static int getMaxFloorInLine(int[][] city, int k) {
        int maxFloorInLine = 0;
        for (int i = k; i <= k; i++) {
            for (int j = 0; j < city[i].length; j++) {
                if (maxFloorInLine < city[i][j]) {
                    maxFloorInLine = city[i][j];
                }
            }
        }
        return maxFloorInLine;
    }

    static int getMaxFloorInColumn(int[][] city, int k) {
        int maxFloorInColumn = 0;

        for (int i = k; i <= k; i++) {
            for (int j = 0; j < city[i].length; j++) {
                if (maxFloorInColumn < city[j][i]) {
                    maxFloorInColumn = city[j][i];
                }
            }
        }
        return maxFloorInColumn;
    }
}