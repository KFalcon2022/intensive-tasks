package com.walking.intensive.chapter5.task21;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(-4, -4, -1);
        Point point2 = new Point(4, 4, 1);
        Sphere sphere = new Sphere(0, 0, 2, 1);

        Parallelepiped parallelepiped = new Parallelepiped(point1, point2);

        System.out.println(sphere.isIntersected(parallelepiped));
    }
}