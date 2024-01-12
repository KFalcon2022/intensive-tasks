package com.walking.intensive.chapter5.task21.analyzer;

import com.walking.intensive.chapter5.task21.objects.Parallelepiped;
import com.walking.intensive.chapter5.task21.objects.Point;
import com.walking.intensive.chapter5.task21.objects.Sphere;
import com.walking.intensive.chapter5.task21.utils.GeometryUtils;

public class GeometryAnalyzer {

    private Point checkPoint = null;
    private final Sphere sphere;
    private final Parallelepiped parallelepiped;
    private String intersectionType = "No intersection";

    public GeometryAnalyzer(Sphere sphere, Parallelepiped parallelepiped) {
        this.sphere = sphere;
        this.parallelepiped = parallelepiped;
    }

    public Point getCheckPoint() {
        return checkPoint;
    }

    public boolean checkIntersection() {
        return checkSphereCenterInside(sphere, parallelepiped) ||
                checkClosestVertex(sphere, parallelepiped) ||
                checkOppositeEdge(sphere, parallelepiped) ||
                checkOppositeFace(sphere, parallelepiped);
    }

    // Проверка - находится ли центр сферы внутри параллелепипеда
    public boolean checkSphereCenterInside(Sphere sphere, Parallelepiped parallelepiped) {
        Point sphereCenter = sphere.getCenter();

        if (sphere.getCenter().getX() >= parallelepiped.getVertex(0).getX() &&
                sphere.getCenter().getX() <= parallelepiped.getVertex(7).getX() &&
                sphere.getCenter().getY() >= parallelepiped.getVertex(0).getY() &&
                sphere.getCenter().getY() <= parallelepiped.getVertex(7).getY() &&
                sphere.getCenter().getZ() >= parallelepiped.getVertex(0).getZ() &&
                sphere.getCenter().getZ() <= parallelepiped.getVertex(7).getZ()) {
            checkPoint = sphereCenter;
            intersectionType = "Sphere center is inside Parallelepiped";
            return true;
        }

        return false;
    }

    // Проверка - находится ли ближайшая вершина внутри (на границе) сферы
    public boolean checkClosestVertex(Sphere sphere, Parallelepiped parallelepiped) {
        Point closestVertex = new GeometryUtils().getClosestVertex(sphere, parallelepiped);
        double distanceToVertex =
                new GeometryUtils().getPointsDistance(sphere.getCenter(), closestVertex);

        if (distanceToVertex <= sphere.getRadius()) {
            checkPoint = closestVertex;
            intersectionType = "Parallelepiped vertex is inside Sphere";

            return true;
        }

        return  false;
    }

    // Проверка - пересекает ли сфера противолежащее ребро
    public boolean checkOppositeEdge(Sphere sphere, Parallelepiped parallelepiped) {
        Point oppositeEdgeClosestPoint =
                new GeometryUtils().getOppositeEdgeClosestPoint(sphere, parallelepiped);

        if (oppositeEdgeClosestPoint != null) {
            double distanceToEdge =
                    new GeometryUtils().getSphereEdgeDistance(sphere, oppositeEdgeClosestPoint);
            if (distanceToEdge <= sphere.getRadius()) {
                checkPoint = oppositeEdgeClosestPoint;
                intersectionType = "Sphere intersects opposite edge of Parallelepiped";

                return true;
            }
        }

        return false;
    }

    // Проверка - пересекает ли сфера противолежащую грань
    public boolean checkOppositeFace(Sphere sphere, Parallelepiped parallelepiped) {
        Point oppositeFaceClosestPoint =
                new GeometryUtils().getOppositeFaceClosestPoint(sphere, parallelepiped);

        if (oppositeFaceClosestPoint != null) {
            double centerToFaceDistance =
                    new GeometryUtils().getSphereFaceDistance(sphere, oppositeFaceClosestPoint);
            if (centerToFaceDistance <= sphere.getRadius()) {
                checkPoint = oppositeFaceClosestPoint;
                intersectionType = "Sphere intersects opposite face of Parallelepiped";

                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "" +
                sphere +
                " " + checkIntersection() +
                ". Checkpoint: " + checkPoint +
                " - " + intersectionType;
    }
}