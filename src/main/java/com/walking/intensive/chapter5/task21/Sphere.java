package com.walking.intensive.chapter5.task21;

public class Sphere {
    final private int xAxisCoordinate;
    final private int yAxisCoordinate;
    final private int zAxisCoordinate;
    final private int radius;

    public Sphere(int xAxisCoordinate, int yAxisCoordinate, int zAxisCoordinate, int radius) {
        this.xAxisCoordinate = xAxisCoordinate;
        this.yAxisCoordinate = yAxisCoordinate;
        this.zAxisCoordinate = zAxisCoordinate;
        this.radius = radius;
    }

    public int getXAxisCoordinate() {
        return xAxisCoordinate;
    }

    public int getYAxisCoordinate() {
        return yAxisCoordinate;
    }

    public int getZAxisCoordinate() {
        return zAxisCoordinate;
    }

    public int getRadius() {
        return radius;
    }
}
