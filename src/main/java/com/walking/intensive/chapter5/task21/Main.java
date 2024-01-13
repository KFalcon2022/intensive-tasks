package com.walking.intensive.chapter5.task21;

import com.walking.intensive.chapter5.task21.analyzer.GeometryAnalyzer;
import com.walking.intensive.chapter5.task21.objects.Parallelepiped;
import com.walking.intensive.chapter5.task21.objects.Sphere;

import java.util.ArrayList;
import java.util.List;

/**
 * Условие: <a href="https://geometry-math.ru/homework/ООП.html">ООП</a>
 */
public class Main {
    public static void main(String[] args) {
        Parallelepiped p1 = new Parallelepiped(1, -1, 0, 3, -3, 2);
        Parallelepiped p2 = new Parallelepiped(4.5, 0.5, 0.43, 2.5, -1.5, 2.43);

        List<Sphere> sphereList = new ArrayList<>();
        sphereList.add(new Sphere(1.86, -2.04, 0.92, 0.3));
        sphereList.add(new Sphere(3.5, -2, 0.86, 0.6));
        sphereList.add(new Sphere(3.45, -3.41, -0.57, 1));
        sphereList.add(new Sphere(0.19, -2.09, 2.1, 1));
        sphereList.add(new Sphere(2, 3.5, 1.23, 1.5));
        sphereList.add(new Sphere(1.53, -2.68, 0.5, 0.7));
        sphereList.add(new Sphere(3.3, -0.53, 2.32, 0.6));

        System.out.println(p1);

        for (Sphere sphere: sphereList) {
            System.out.println(new GeometryAnalyzer(sphere, p1));
        }

        System.out.println("\n" + p2);

        for (Sphere sphere: sphereList) {
            System.out.println(new GeometryAnalyzer(sphere, p2));
        }
    }
}