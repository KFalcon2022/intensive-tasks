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

        checkIntersectionForPairs(spheres,parallelepipeds);
    }

    public static boolean checkIntersection(Sphere sphere, Parallelepiped parallelepiped) {
        double distance = Math.sqrt(
                Math.pow(sphere.getX() - Math.max(parallelepiped.getX1(), Math.min(sphere.getX(), parallelepiped.getX2())), 2) +
                        Math.pow(sphere.getY() - Math.max(parallelepiped.getY1(), Math.min(sphere.getY(), parallelepiped.getY2())), 2) +
                        Math.pow(sphere.getZ() - Math.max(parallelepiped.getZ1(), Math.min(sphere.getZ(), parallelepiped.getZ2())), 2));

        double parallelepipedDiagonal = Math.sqrt(
                Math.pow((parallelepiped.getX2() - parallelepiped.getX1()) / 2, 2) +
                        Math.pow((parallelepiped.getY2() - parallelepiped.getY1()) / 2, 2) +
                        Math.pow((parallelepiped.getZ2() - parallelepiped.getZ1()) / 2, 2));

        return distance <= (sphere.getRadius() + parallelepipedDiagonal);
    }

    private static void checkIntersectionForPairs(List<Sphere> spheres, List<Parallelepiped> parallelepipeds) {
        for (int i = 0; i < spheres.size(); i++) {
            System.out.printf("Пересекаются ли сфера %d и параллелепипед %d ? \nответ: %s\n",
                    i + 1, i + 1, checkIntersection(spheres.get(i), parallelepipeds.get(i)) ? "да" : "нет");
        }
    }
}