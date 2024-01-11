package com.walking.intensive.chapter5.task21.analyzer;

import com.walking.intensive.chapter5.task21.objects.Parallelepiped;
import com.walking.intensive.chapter5.task21.objects.Point;
import com.walking.intensive.chapter5.task21.objects.Sphere;
import com.walking.intensive.chapter5.task21.utils.MathUtils;

public class GeometryAnalyzer {

    public boolean checkIntersection(Sphere sphere, Parallelepiped parallelepiped) {
        return checkSphereCenterInside(sphere, parallelepiped) ||
               checkClosestVertex(sphere, parallelepiped) ||
               checkFaces(sphere, parallelepiped);
    }

    public boolean checkSphereCenterInside(Sphere sphere, Parallelepiped parallelepiped) {
        return sphere.getCenter().getX() >= parallelepiped.getVertex(0).getX() &&
                sphere.getCenter().getX() <= parallelepiped.getVertex(7).getX() &&
                sphere.getCenter().getY() >= parallelepiped.getVertex(0).getY() &&
                sphere.getCenter().getY() <= parallelepiped.getVertex(7).getY() &&
                sphere.getCenter().getZ() >= parallelepiped.getVertex(0).getZ() &&
                sphere.getCenter().getZ() <= parallelepiped.getVertex(7).getZ();
    }

    public boolean checkClosestVertex(Sphere sphere, Parallelepiped parallelepiped) {
        return new MathUtils().
                getPointsDistance(sphere.getCenter(), getClosestVertex(sphere, parallelepiped)) <=
                sphere.getRadius();
    }

    public boolean checkFaces(Sphere sphere, Parallelepiped parallelepiped) {
        Point closestVertex = getClosestVertex(sphere, parallelepiped);
        // to be continued


        return false;
    }

    public Point getClosestVertex(Sphere sphere, Parallelepiped parallelepiped) {
        Point closestVertex = null;
        double shortestDistance = Double.MAX_VALUE;

        for (Point vertex: parallelepiped.getVertices()) {
            double distance = new MathUtils().getPointsDistance(sphere.getCenter(), vertex);
            if (distance < shortestDistance) {
                shortestDistance = distance;
                closestVertex = vertex;
            }
        }

        return closestVertex;
    }


}
