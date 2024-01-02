package com.walking.intensive.chapter5.task21;

public class Parallelepiped {
    Point a;
    Point b;

    public Parallelepiped(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    Point getMinPerspectivePoint() {
        return new Point(Math.min(a.x, b.x), Math.min(a.y, b.y), Math.min(a.z, b.z));
    }

    Point getMaxPerspectivePoint() {
        return new Point(Math.max(a.x, b.x), Math.max(a.y, b.y), Math.max(a.z, b.z));
    }
}
