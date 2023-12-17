package com.walking.intensive.chapter5.task21;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(1, 1, 1, 1);
        Parallelepiped parallelepiped = new Parallelepiped(5, 5, 5, 5, 5, 5);

        System.out.println("Пересекаются ли сфера и параллелепипед? " + checkIntersection(sphere, parallelepiped));
    }

    public static boolean checkIntersection(Sphere sphere, Parallelepiped parallelepiped) {
        double distance = Math.sqrt(
                Math.pow(sphere.getX() - parallelepiped.getX1(), 2)
                        + Math.pow(sphere.getY() - parallelepiped.getY1(), 2)
                        + Math.pow(sphere.getZ() - parallelepiped.getZ1(), 2));

        double parallelepipedDiagonal = Math.sqrt(
                Math.pow(parallelepiped.getX2() - parallelepiped.getX1(), 2)
                        + Math.pow(parallelepiped.getY2() - parallelepiped.getY1(), 2)
                        + Math.pow(parallelepiped.getZ2() - parallelepiped.getZ1(), 2));

        return distance <= (sphere.getRadius() + parallelepipedDiagonal);
    }
}