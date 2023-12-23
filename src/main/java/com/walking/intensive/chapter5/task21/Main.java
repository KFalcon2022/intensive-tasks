package com.walking.intensive.chapter5.task21;

public class Main {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(0, 0, 0, 2);
        Sphere sphere2 = new Sphere(10, 10, 10, 3);
        Parallelepiped parallelepiped1 = new Parallelepiped(0, 0, 0,
                3, 4, 5);
        Parallelepiped parallelepiped2 = new Parallelepiped(1, 2, -1,
                -5, -9, 2);

        System.out.println(isIntersectingSphereAndParallelepiped(sphere1, parallelepiped1));
        System.out.println(isIntersectingSphereAndParallelepiped(sphere2, parallelepiped2));

    }

    public static boolean isIntersectingSphereAndParallelepiped(Sphere sphere, Parallelepiped parallelepiped) {
        boolean isThereCommonPoints = false;

        if ((sphere.getXAxisCoordinate() >= parallelepiped.getXAxisCoordinate1() &&
                sphere.getXAxisCoordinate() <= parallelepiped.getXAxisCoordinate2()) &&
                (sphere.getYAxisCoordinate() >= parallelepiped.getYAxisCoordinate1() &&
                        sphere.getYAxisCoordinate() <= parallelepiped.getYAxisCoordinate2()) &&
                (sphere.getZAxisCoordinate() >= parallelepiped.getZAxisCoordinate1() &&
                        sphere.getZAxisCoordinate() <= parallelepiped.getZAxisCoordinate2())) {

            isThereCommonPoints = true;
        }

        int[][] pointsCoordinates = parallelepiped.getPointsCoordinatesArray();

        for (int[] pointCoordinates : pointsCoordinates) {
            double requiredRadius =
                    Math.sqrt(Math.pow((sphere.getXAxisCoordinate() - pointCoordinates[0]), 2) +
                            Math.pow((sphere.getYAxisCoordinate() - pointCoordinates[1]), 2) +
                            Math.pow((sphere.getZAxisCoordinate() - pointCoordinates[2]), 2));

            if (requiredRadius <= sphere.getRadius()) {
                isThereCommonPoints = true;
                break;
            }
        }

        return isThereCommonPoints;
    }
}