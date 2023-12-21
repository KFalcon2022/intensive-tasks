package com.walking.intensive.chapter5.task21;

public class Task21 {
    public static void main(String[] args) {
        Parallelepiped parallelepiped1 = new Parallelepiped(1, 1, 1, 3, 3, 3);

        Sphere sphere1 = new Sphere(5, 5, 5, 1);

        System.out.println("Пересекаются ли Паралилепипед1 и шар1: " + intersectionSphereParallelepiped(parallelepiped1, sphere1));
    }

    public static boolean intersectionSphereParallelepiped(Parallelepiped par, Sphere sph) {
        boolean boolX = isIntersectionSquareCircle(par.getY1(), par.getY2(), par.getX1(), par.getZ2(), sph.getY(), sph.getZ(), sph.getRadius());
        boolean boolY = isIntersectionSquareCircle(par.getX1(), par.getX2(), par.getZ1(), par.getZ2(), sph.getX(), sph.getZ(), sph.getRadius());
        boolean boolZ = isIntersectionSquareCircle(par.getX1(), par.getX2(), par.getY1(), par.getY2(), sph.getY(), sph.getZ(), sph.getRadius());

        return boolX && boolY && boolZ;
    }

    public static boolean isIntersectionSquareCircle(int parX1, int parX2, int parY1, int parY2, int centerCircleX, int centerCircleY, int radius) {
        boolean isResult = (parX1 <= centerCircleX && centerCircleX <= parX2) && (parY1 <= centerCircleY && centerCircleY <= parY2);

        if (((parX1 - radius <= centerCircleX && centerCircleX <= parX1) || (parX2 <= centerCircleY && centerCircleY <= parX2 + radius)) && ((parY1 <= centerCircleY && centerCircleY <= parY2))) {
            isResult = true;
        }
        if ((parX1 <= centerCircleX && centerCircleX <= parX2) && ((parY1 - radius <= centerCircleY && centerCircleY <= parY1) || (parY2 <= centerCircleY && centerCircleY <= parY2 + radius))) {
            isResult = true;
        }
        if (parX1 > centerCircleX && parY1 > centerCircleY) {
            isResult = radius >= Math.sqrt(Math.pow(centerCircleX - parX1, 2) + Math.pow(centerCircleY - parY1, 2));
        }
        if (parX2 < centerCircleX && parY2 < centerCircleY) {
            isResult = radius >= Math.sqrt(Math.pow(centerCircleX - parX2, 2) + Math.pow(centerCircleY - parY2, 2));
        }
        if (parX1 > centerCircleX && parY2 < centerCircleY) {
            isResult = radius >= Math.sqrt(Math.pow(centerCircleX - parX1, 2) + Math.pow(centerCircleY - parY2, 2));
        }
        if (parX2 < centerCircleX && parY1 > centerCircleY) {
            isResult = radius >= Math.sqrt(Math.pow(centerCircleX - parX2, 2) + Math.pow(centerCircleY - parY1, 2));
        }

        return isResult;
    }
}