package com.walking.intensive.chapter5.task21;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(1, 3, 4, 1);
        Parallelepiped parallelepiped = new Parallelepiped(0, 0, 0, 2, 2, 2);
        
        System.out.println(hasIntersection(parallelepiped, ball));
    }

    public static boolean hasIntersection(Parallelepiped parallelepiped, Ball ball) {
        return ((ball.getMinPerspectivePoint().x >= parallelepiped.getMinPerspectivePoint().x && ball.getMinPerspectivePoint().x <= parallelepiped.getMaxPerspectivePoint().x) || (parallelepiped.getMinPerspectivePoint().x >= ball.getMinPerspectivePoint().x && parallelepiped.getMinPerspectivePoint().x <= ball.getMaxPerspectivePoint().x)) &&
                ((ball.getMinPerspectivePoint().y >= parallelepiped.getMinPerspectivePoint().y && ball.getMinPerspectivePoint().y <= parallelepiped.getMaxPerspectivePoint().y) || (parallelepiped.getMinPerspectivePoint().y >= ball.getMinPerspectivePoint().y && parallelepiped.getMinPerspectivePoint().y <= ball.getMaxPerspectivePoint().y)) &&
                ((ball.getMinPerspectivePoint().z >= parallelepiped.getMinPerspectivePoint().z && ball.getMinPerspectivePoint().z <= parallelepiped.getMaxPerspectivePoint().z) || (parallelepiped.getMinPerspectivePoint().z >= ball.getMinPerspectivePoint().z && parallelepiped.getMinPerspectivePoint().z <= ball.getMaxPerspectivePoint().z));

    }
}