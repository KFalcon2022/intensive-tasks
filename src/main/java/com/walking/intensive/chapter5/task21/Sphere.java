package com.walking.intensive.chapter5.task21;

public class Sphere {
    private int[] center;
    private int radius;

    public Sphere(int x, int y, int z, int r){
        this.center = new int[] {x, y, z};
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public int[] getCenter() {
        return center;
    }
}
