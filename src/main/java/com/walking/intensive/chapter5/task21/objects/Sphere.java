package com.walking.intensive.chapter5.task21.objects;

public class Sphere {
    private final Point center;
    private final double r;

    public Sphere(double x, double y, double z, double r) {
        this.center = new Point(x, y, z);
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return r;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "center=" + center +
                ", r=" + r +
                '}';
    }
}
