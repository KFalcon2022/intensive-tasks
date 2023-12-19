package com.walking.intensive.chapter5.task21;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(0, 0, 0, 1);
        Parallelepiped parallelepiped1 = new Parallelepiped(2, 2, 2, 4, 4, 4);

        Sphere sphere2 = new Sphere(5, 5, 5, 2);
        Parallelepiped parallelepiped2 = new Parallelepiped(3, 3, 3, 6, 6, 6);

        Sphere sphere3 = new Sphere(-10, -10, -10, 3);
        Parallelepiped parallelepiped3 = new Parallelepiped(-5, -5, -5, -2, -2, -2);

        Sphere sphere4 = new Sphere(20, 20, 20, 4);
        Parallelepiped parallelepiped4 = new Parallelepiped(18, 18, 18, 22, 22, 22);

        Sphere sphere5 = new Sphere(1, 1, 1, 2);
        Parallelepiped parallelepiped5 = new Parallelepiped(0, 0, 0, 3, 3, 3);

        Sphere sphere6 = new Sphere(6, 6, 6, 3);
        Parallelepiped parallelepiped6 = new Parallelepiped(7, 7, 7, 8, 8, 8);

        Sphere sphere7 = new Sphere(-15, -15, -15, 2);
        Parallelepiped parallelepiped7 = new Parallelepiped(-30, -30, -30, -25, -25, -25);

        Sphere sphere8 = new Sphere(30, 30, 30, 5);
        Parallelepiped parallelepiped8 = new Parallelepiped(50, 50, 50, 60, 60, 60);

        List<Sphere> spheres = new ArrayList<>();
        spheres.add(sphere1);
        spheres.add(sphere2);
        spheres.add(sphere3);
        spheres.add(sphere4);
        spheres.add(sphere5);
        spheres.add(sphere6);
        spheres.add(sphere7);
        spheres.add(sphere8);

        List<Parallelepiped> parallelepipeds = new ArrayList<>();
        parallelepipeds.add(parallelepiped1);
        parallelepipeds.add(parallelepiped2);
        parallelepipeds.add(parallelepiped3);
        parallelepipeds.add(parallelepiped4);
        parallelepipeds.add(parallelepiped5);
        parallelepipeds.add(parallelepiped6);
        parallelepipeds.add(parallelepiped7);
        parallelepipeds.add(parallelepiped8);

        for (int i = 0; i < spheres.size(); i++) {
            System.out.printf("Пересекаются ли сфера %d и параллелепипед %d ? \nответ: %s\n",
                    i + 1, i + 1, isIntersection(spheres.get(i), parallelepipeds.get(i)) ? "да" : "нет");
        }
    }

    public static boolean isIntersection(Sphere sphere, Parallelepiped parallelepiped) {
        double closestX = Math.max(parallelepiped.getX1(), Math.min(sphere.getX(), parallelepiped.getX2()));
        double closestY = Math.max(parallelepiped.getY1(), Math.min(sphere.getY(), parallelepiped.getY2()));
        double closestZ = Math.max(parallelepiped.getZ1(), Math.min(sphere.getZ(), parallelepiped.getZ2()));

        double distX = sphere.getX() - closestX;
        double distY = sphere.getY() - closestY;
        double distZ = sphere.getZ() - closestZ;

        return (distX * distX + distY * distY + distZ * distZ) < (sphere.getRadius() * sphere.getRadius());
    }
}