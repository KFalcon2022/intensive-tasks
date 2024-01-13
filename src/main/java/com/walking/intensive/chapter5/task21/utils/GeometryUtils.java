package com.walking.intensive.chapter5.task21.utils;

import com.walking.intensive.chapter5.task21.objects.*;

public class GeometryUtils {

    // Расстояние между точками в пространстве
    public double getPointsDistance(Point a, Point b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2)
                       + Math.pow((a.getY() - b.getY()), 2)
                       + Math.pow((a.getZ() - b.getZ()), 2));
    }

    // Возвращает вершину параллелепипеда ближайшую к центру шара
    public Point getClosestVertex(Sphere sphere, Parallelepiped parallelepiped) {
        Point closestVertex = null;
        double shortestDistance = Double.MAX_VALUE;

        for (Point vertex: parallelepiped.getVertices()) {
            double distance = new GeometryUtils().getPointsDistance(sphere.getCenter(), vertex);
            if (distance < shortestDistance) {
                shortestDistance = distance;
                closestVertex = vertex;
            }
        }

        return closestVertex;
    }

    // Возвращает точку пересечения перпендикуляра к противолежащему ребру
    public Point getOppositeEdgeClosestPoint(Sphere sphere, Parallelepiped parallelepiped) {
        Point sphereCenter = sphere.getCenter();
        Point closestVertex = getClosestVertex(sphere, parallelepiped);

        if (sphereCenter.getX() >= parallelepiped.getVertex(0).getX() &&
                sphereCenter.getX() <= parallelepiped.getVertex(7).getX()) {
            return new Point(sphereCenter.getX(), closestVertex.getY(), closestVertex.getZ());
        }

        if (sphereCenter.getY() >= parallelepiped.getVertex(0).getY() &&
                sphereCenter.getY() <= parallelepiped.getVertex(7).getY()) {
            return new Point(closestVertex.getX(), sphereCenter.getY(), closestVertex.getZ());
        }

        if (sphereCenter.getZ() >= parallelepiped.getVertex(0).getZ() &&
                sphereCenter.getZ() <= parallelepiped.getVertex(7).getZ()) {
            return new Point(closestVertex.getX(), closestVertex.getY(), sphereCenter.getZ());
        }

        return null;
    }

    // Расстояние от центра сферы до точки пересечения перпендикуляра с противолежащим ребром
    public double getSphereEdgeDistance(Sphere sphere, Point oppositeEdgeClosestPoint) {
        return getPointsDistance(sphere.getCenter(), oppositeEdgeClosestPoint);
    }

    // Возвращает точку пересечения перпендикуляра с противолежащей гранью
    public Point getOppositeFaceClosestPoint(Sphere sphere, Parallelepiped parallelepiped) {
        Point sphereCenter = sphere.getCenter();
        Point closestVertex = getClosestVertex(sphere, parallelepiped);

        if (sphereCenter.getX() >= parallelepiped.getVertex(0).getX() &&
                sphereCenter.getX() <= parallelepiped.getVertex(7).getX() &&
                sphereCenter.getY() >= parallelepiped.getVertex(0).getY() &&
                sphereCenter.getY() <= parallelepiped.getVertex(7).getY()) {
            return new Point(sphereCenter.getX(), sphereCenter.getY(), closestVertex.getZ());
        }

        if (sphereCenter.getY() >= parallelepiped.getVertex(0).getY() &&
                sphereCenter.getY() <= parallelepiped.getVertex(7).getY() &&
                sphereCenter.getZ() >= parallelepiped.getVertex(0).getZ() &&
                sphereCenter.getZ() <= parallelepiped.getVertex(7).getZ()) {
            return new Point(closestVertex.getX(), sphereCenter.getY(), sphereCenter.getZ());
        }

        if (sphereCenter.getX() >= parallelepiped.getVertex(0).getX() &&
                sphereCenter.getX() <= parallelepiped.getVertex(7).getX() &&
                sphereCenter.getZ() >= parallelepiped.getVertex(0).getZ() &&
                sphereCenter.getZ() <= parallelepiped.getVertex(7).getZ()) {
            return new Point(sphereCenter.getX(), closestVertex.getY(), sphereCenter.getZ());
        }

        return null;
    }

    // Расстояние от центра сферы до точки пересечения перпендикуляра с противолежащей гранью
    public double getSphereFaceDistance(Sphere sphere, Point oppositeFaceClosestPoint) {
        return getPointsDistance(sphere.getCenter(), oppositeFaceClosestPoint);
    }

}