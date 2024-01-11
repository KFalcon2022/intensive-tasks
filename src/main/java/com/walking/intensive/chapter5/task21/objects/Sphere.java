package com.walking.intensive.chapter5.task21.objects;

public class Sphere {
    private Point center;
    private int r;

    public Sphere(int x, int y, int z, int r) {
        this.center = new Point(x, y, z);
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return r;
    }
}
