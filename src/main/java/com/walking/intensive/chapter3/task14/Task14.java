package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};

        System.out.println(Arrays.toString(getCountOfPoints(points, queries)));
    }

    static int[] getCountOfPoints(int[][] points, int[][] queries) {
        int answerLen = queries.length;
        int[] answer = new int[answerLen];

        for (int i = 0; i < answerLen; i++) {
            answer[i] = amountPoints(i, points, queries);
        }

        return answer;
    }

    static int amountPoints(int index, int[][] points, int[][] queries) {
        int pointA, pointB, circleRadius, pointX, pointY;
        boolean isTrue;
        int amountPoints = 0;

        pointA = queries[index][0];
        pointB = queries[index][1];
        circleRadius = queries[index][2];

        for (int i = 0; i < points.length; i++) {
            pointX = points[i][0];
            pointY = points[i][1];

            isTrue = Math.pow(pointA - pointX, 2) + Math.pow(pointB - pointY, 2) <= Math.pow(circleRadius, 2);

            if (isTrue) {
                amountPoints++;
            }
        }

        return amountPoints;
    }
}