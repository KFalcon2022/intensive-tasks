package com.walking.intensive.chapter5.task21;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sphere sphereOne = new Sphere(0, 0, 0, 3);
        Sphere sphereTwo = new Sphere(5, 11, 11, 2);
        Parallelepiped parOne = new Parallelepiped(-4, -4, -4, 4, 4, 4);
        Parallelepiped parTwo = new Parallelepiped(0, 0, 0, 10, 10, 10);


        System.out.println(isSphereAndParallelepipedCrossed(sphereOne, parOne));
        System.out.println(isSphereAndParallelepipedCrossed(sphereTwo, parTwo));


    }

    public static boolean isSphereAndParallelepipedCrossed(Sphere sphere, Parallelepiped parallelepiped) {
        if (isSphereInside(sphere, parallelepiped)) { // Если центр шара (возможно, весь шар) внутри параллелепипеда

            return true;
        }

        if (isHeightCrossed(sphere, parallelepiped)) { // Если хоть одна из вершин внутри шара

            return true;
        }

        if (isLineCrossed(sphere, parallelepiped)) { // Если пересекает ребро

            return true;
        }
        // Если шар пересекает или касается ближайшей к нему стороны параллелепипеда
        return isSideCrossed(sphere, parallelepiped);
    }

    public static boolean isSphereInside(Sphere sphere, Parallelepiped parallelepiped) {
        // Сфера внутри, если центр сферы находится от минимальной по всем координатам вершины параллелепипеда до максимальной
        // Для наглядности создадим переменные
        int sphereX = sphere.getCenter()[0];
        int sphereY = sphere.getCenter()[1];
        int sphereZ = sphere.getCenter()[2];

        int maxHeightX = parallelepiped.getHeights()[6][0];
        int maxHeightY = parallelepiped.getHeights()[6][1];
        int maxHeightZ = parallelepiped.getHeights()[6][2];

        int minHeightX = parallelepiped.getHeights()[0][0];
        int minHeightY = parallelepiped.getHeights()[0][1];
        int minHeightZ = parallelepiped.getHeights()[0][2];

        return ((minHeightX <= sphereX) && (minHeightY <= sphereY) && (minHeightZ <= sphereZ)) && ((sphereX <= maxHeightX) && (sphereY <= maxHeightY) && (sphereZ <= maxHeightZ));
    }

    public static boolean isHeightCrossed(Sphere sphere, Parallelepiped parallelepiped) {
        for (int i = 0; i < parallelepiped.getHeights().length; i++) {
            if (distanceBetweenPoints(sphere.getCenter(), parallelepiped.getHeights()[i]) <= Math.pow(sphere.getRadius(), 2)) {

                return true;
            }
        }

        return false;
    }

    public static boolean isLineCrossed(Sphere sphere, Parallelepiped parallelepiped) {
        for (int i = 0; i < parallelepiped.getLines().length; i++) {
            int[][] line = parallelepiped.getLines()[i]; // для наглядности
            int[] crossPoint = {sphere.getCenter()[0], sphere.getCenter()[1], sphere.getCenter()[2]};

            if (line[0][0] == line[1][0] && line[0][0] == line[1][1]) { // Не знаю, как правильно назвать, проецирую центр шара на прямую отрезка
                crossPoint[0] = crossPoint[1] = line[0][0];
            } else if (line[0][0] == line[1][0] && line[0][0] == line[1][2]) {
                crossPoint[0] = crossPoint[2] = line[0][0];
            } else {
                crossPoint[1] = crossPoint[2] = line[0][1];
            }

            if (distanceBetweenPoints(sphere.getCenter(), crossPoint) <= Math.pow(sphere.getRadius(), 2)) {
                // Если расстояние от точки пересечения с прямой до центра шара меньше радиуса
                if (isPointOnSide(crossPoint, line)) {
                    // Не стал переписывать, метод также определяет, находится ли точка пересечения с прямой на отрезке - ребре
                    return true;
                }
            }
// Метод вышел почти одинаковым с isSideCrossed, но не придумал, как унифицировать в один
        }
        return false;
    }

    public static boolean isSideCrossed(Sphere sphere, Parallelepiped parallelepiped) {
        for (int i = 0; i < parallelepiped.getSides().length; i++) { // Определяем плоскость грани и точку пересечения
            int[][] side = parallelepiped.getSides()[i]; // Просто чтобы удобней запись была
            int[] crossPoint = {sphere.getCenter()[0], sphere.getCenter()[1], sphere.getCenter()[2]};

            if (side[0][0] == side[1][0]) { // Сначала я писал тут все точки, потом понял что достаточно диагонали
                crossPoint[0] = side[0][0];
            } else if (side[0][1] == side[1][1]) {
                crossPoint[1] = side[0][1];
            } else if (side[0][2] == side[1][2]) {
                crossPoint[2] = side[0][2];
            } else {
                System.out.println("wtf");
            }

            if (distanceBetweenPoints(sphere.getCenter(), crossPoint) <= Math.pow(sphere.getRadius(), 2)) {
                // Если расстояние от центра шара до точки пересечения с плоскостью грани меньше радиуса (пересекает), либо равно (касается)
                if (isPointOnSide(crossPoint, side)) { // И точка пересечения лежит внутри грани (включая ребра) на этой плоскости

                    return true; // То пересекает
                }
            }
        }

        return false;
    }


    public static int distanceBetweenPoints(int[] firstPoint, int[] secondPoint) {
        return (int) (Math.pow(firstPoint[0] - secondPoint[0], 2) + Math.pow(firstPoint[1] - secondPoint[1], 2) + Math.pow(firstPoint[2] - secondPoint[2], 2));
    }

    public static boolean isPointOnSide(int[] crossPoint, int[][] side) {
        //Точка принадлежит прямоугольнику
        return (((side[0][0] <= crossPoint[0]) && (crossPoint[0] <= side[1][0])) &&
                ((side[0][1] <= crossPoint[1]) && (crossPoint[1] <= side[1][1])) &&
                ((side[0][2] <= crossPoint[2]) && (crossPoint[2] <= side[1][2])));
    }

}