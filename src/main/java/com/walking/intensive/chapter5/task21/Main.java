package com.walking.intensive.chapter5.task21;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(-4, -4, -4);
        Point point2 = new Point(4, 4, 4);
        Ball ball1 = new Ball(0, 0, 0, 100);

        Point point3 = new Point(-4, -4, -1);
        Point point4 = new Point(4, 4, 1);
        Ball ball2 = new Ball(0, 0, 2, 1);

        Ball ball3 = new Ball(150, 150, 150, 30);


        Parallelepiped parallelepiped1 = new Parallelepiped(point1, point2);
        Parallelepiped parallelepiped2 = new Parallelepiped(point3, point4);

        System.out.println(ball1.isIntersected(parallelepiped1));
        System.out.println(ball2.isIntersected(parallelepiped2));
        System.out.println(ball3.isIntersected(parallelepiped1));
        System.out.println(ball3.isIntersected(parallelepiped2));
        System.out.println();
    }
}