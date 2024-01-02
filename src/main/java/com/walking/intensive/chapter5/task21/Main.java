package com.walking.intensive.chapter5.task21;

public class Main {
    public static void main(String[] args) {
        Point ballCenter = new Point(1, 3, 4);
        Ball ball = new Ball(ballCenter, 1);

        Point pointA = new Point(0, 0, 0);
        Point pointB = new Point(2, 2, 2);

        Parallelepiped parallelepiped = new Parallelepiped(pointA, pointB);
        System.out.println(hasIntersection(parallelepiped, ball));
    }

    public static boolean hasIntersection(Parallelepiped parallelepiped, Ball ball) {
        return ((ball.getMinPerspectivePoint().x >= parallelepiped.getMinPerspectivePoint().x && ball.getMinPerspectivePoint().x <= parallelepiped.getMaxPerspectivePoint().x) || (parallelepiped.getMinPerspectivePoint().x >= ball.getMinPerspectivePoint().x && parallelepiped.getMinPerspectivePoint().x <= ball.getMaxPerspectivePoint().x)) &&
                ((ball.getMinPerspectivePoint().y >= parallelepiped.getMinPerspectivePoint().y && ball.getMinPerspectivePoint().y <= parallelepiped.getMaxPerspectivePoint().y) || (parallelepiped.getMinPerspectivePoint().y >= ball.getMinPerspectivePoint().y && parallelepiped.getMinPerspectivePoint().y <= ball.getMaxPerspectivePoint().y)) &&
                ((ball.getMinPerspectivePoint().z >= parallelepiped.getMinPerspectivePoint().z && ball.getMinPerspectivePoint().z <= parallelepiped.getMaxPerspectivePoint().z) || (parallelepiped.getMinPerspectivePoint().z >= ball.getMinPerspectivePoint().z && parallelepiped.getMinPerspectivePoint().z <= ball.getMaxPerspectivePoint().z));

    }
}