package com.walking.intensive.chapter3.task14;

import java.lang.Math;

public class Task14 {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};

        int[] answer = getCountOfPoints(points,queries);

        for(int tmp: answer)
            System.out.println(tmp);

    }

    static int[] getCountOfPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (isPointIncludedInTheCircle(points[j][0], points[j][1], queries[i][0], queries[i][1], queries[i][2])){
                    result[i]++;
                }
            }
        }

        return result;
    }

    static boolean isPointIncludedInTheCircle(int x1, int y1, int x0, int y0, int r) {
        return ((Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2)) <= r * r);    // Если выражение верно, то точка входит в пределах круга
    }
}