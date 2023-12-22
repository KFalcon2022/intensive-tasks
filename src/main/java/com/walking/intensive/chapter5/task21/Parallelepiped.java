package com.walking.intensive.chapter5.task21;

public class Parallelepiped {
    final private int xAxisCoordinate1;
    final private int yAxisCoordinate1;
    final private int zAxisCoordinate1;
    final private int xAxisCoordinate2;
    final private int yAxisCoordinate2;
    final private int zAxisCoordinate2;

    public Parallelepiped(int xAxisCoordinate1, int yAxisCoordinate1, int zAxisCoordinate1,
                          int xAxisCoordinate2, int yAxisCoordinate2, int zAxisCoordinate2) {
        this.xAxisCoordinate1 = xAxisCoordinate1;
        this.yAxisCoordinate1 = yAxisCoordinate1;
        this.zAxisCoordinate1 = zAxisCoordinate1;
        this.xAxisCoordinate2 = xAxisCoordinate2;
        this.yAxisCoordinate2 = yAxisCoordinate2;
        this.zAxisCoordinate2 = zAxisCoordinate2;
    }

    public int[][] getPointsCoordinatesArray() {
        final int COORDINATES_NUMBER = 3;

        int xAxisCoordinatesPointsNumber =
                Math.abs(xAxisCoordinate2 - xAxisCoordinate1) + 1;
        int yAxisCoordinatesPointsNumber =
                Math.abs(yAxisCoordinate2 - yAxisCoordinate1) + 1;
        int zAxisCoordinatesPointsNumber =
                Math.abs(zAxisCoordinate2 - zAxisCoordinate1) + 1;

        int parallelepipedPointsNumber =
                xAxisCoordinatesPointsNumber * yAxisCoordinatesPointsNumber * zAxisCoordinatesPointsNumber;

        int[][] pointsCoordinatesArray = new int[parallelepipedPointsNumber][COORDINATES_NUMBER];

        int xAxisCounter = xAxisCoordinate1;
        int yAxisCounter = yAxisCoordinate1;
        int yAxisControlCounter = 0;
        int zAxisCounter = zAxisCoordinate1;
        int zAxisControlCounter = 0;

        for (int i = 0; i < pointsCoordinatesArray.length; i++) {
            pointsCoordinatesArray[i][0] = xAxisCounter;
            xAxisCounter++;
            if (xAxisCounter > xAxisCoordinate2) {
                xAxisCounter = xAxisCoordinate1;
            }

            pointsCoordinatesArray[i][1] = yAxisCounter;
            yAxisControlCounter++;
            if (yAxisControlCounter % xAxisCoordinatesPointsNumber == 0) {
                yAxisCounter++;
            }
            if (yAxisCounter > yAxisCoordinate2) {
                yAxisCounter = yAxisCoordinate1;
            }

            pointsCoordinatesArray[i][2] = zAxisCounter;
            zAxisControlCounter++;
            if (zAxisControlCounter % (xAxisCoordinatesPointsNumber * yAxisCoordinatesPointsNumber) == 0) {
                zAxisCounter++;
            }
            if (zAxisCounter > zAxisCoordinate2) {
                zAxisCounter = zAxisCoordinate1;
            }
        }

        return pointsCoordinatesArray;
    }

    public int getXAxisCoordinate1() {
        return xAxisCoordinate1;
    }

    public int getYAxisCoordinate1() {
        return yAxisCoordinate1;
    }

    public int getZAxisCoordinate1() {
        return zAxisCoordinate1;
    }

    public int getXAxisCoordinate2() {
        return xAxisCoordinate2;
    }

    public int getYAxisCoordinate2() {
        return yAxisCoordinate2;
    }

    public int getZAxisCoordinate2() {
        return zAxisCoordinate2;
    }
}
