package com.walking.intensive.chapter5.task21.utils;

import com.walking.intensive.chapter5.task21.objects.Point;

public class MathUtils {
    public double getPointsDistance(Point a, Point b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2)
                       + Math.pow((a.getY() - b.getY()), 2)
                       + Math.pow((a.getZ() - b.getZ()), 2));
    }
}
