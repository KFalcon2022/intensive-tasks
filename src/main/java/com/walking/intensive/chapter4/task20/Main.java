package com.walking.intensive.chapter4.task20;

import com.walking.intensive.chapter5.task21.Parallelepiped;
import com.walking.intensive.chapter5.task21.Point;
import com.walking.intensive.chapter5.task21.Sphere;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(-4, -4, 8);
        Point point2 = new Point(4, 4, 0);

        Parallelepiped parallelepiped = new Parallelepiped(point1, point2);

        Sphere sphere1 = new Sphere(0, 0, 4, 2); // сфера полностью внутри куба
        Sphere sphere2 = new Sphere(0, 0, 4, 4); // сфера полностью внутри куба, но касается крайними точками сторон куба
        Sphere sphere3 = new Sphere(-6, -2, 0, 20); // куб полностью внутри сферы
        Sphere sphere4 = new Sphere(-8, 0, 0, 4); // сфера касается куба одной точкой
        Sphere sphere5 = new Sphere(6, -5, 0, 4); // правая нижняя ближняя вершина куба внутри сферы
        Sphere sphere6 = new Sphere(5, 5, 10, 1); // сфера вне куба

        System.out.println(sphere1.isIntersected(parallelepiped));
        System.out.println(sphere2.isIntersected(parallelepiped));
        System.out.println(sphere3.isIntersected(parallelepiped));
        System.out.println(sphere4.isIntersected(parallelepiped));
        System.out.println(sphere5.isIntersected(parallelepiped));
        System.out.println(sphere6.isIntersected(parallelepiped));
    }
}