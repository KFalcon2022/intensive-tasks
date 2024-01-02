package com.walking.intensive.chapter5.task21;

public class Ball {
    Point center;
    double radius;

    public Ball(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    Point getMinPerspectivePoint() {
        return new Point(center.x - radius, center.y - radius, center.z - radius);
    }

    Point getMaxPerspectivePoint() {
        return new Point(center.x + radius, center.y + radius, center.z + radius);
    }
}
