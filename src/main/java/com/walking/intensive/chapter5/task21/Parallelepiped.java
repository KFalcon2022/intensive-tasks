package com.walking.intensive.chapter5.task21;

/*
Вид параллелепипеда:

        F-----------G
       /|          /|
      / |         / |
     /  |        /  |
    /   |       /   |
   А----|------C    |
   |    |      |    |
   |    H------|----B
   |   /       |   /
   |  /        |  /
   | /         | /
   |/          |/
   D-----------E
    Ось X - по ребру АС.
    Ось Y - по ребру АF.
    Ось Z - по ребру АD.
    Для простоты оперирования точки всегда будут расположены следующим образом:
    Точкой А будет считаться та, где х и y минимален, z максимален.
    Точкой B будет считаться та, где х и y максимален, z минимален.
    Конструктор соберет параллелепипед даже если переданы не диагональные точки, просто в некоторых случаях он просто будем иметь по некоторым осям длину 0.
 */
public class Parallelepiped {

    Point a;
    Point b;
    Point c;
    Point d;
    Point e;
    Point f;
    Point g;
    Point h;

    public int getMinX() {
        return a.x;
    }

    public int getMaxX() {
        return b.x;
    }

    public int getMinY() {
        return a.y;
    }

    public int getMaxY() {
        return b.y;
    }

    public int getMinZ() {
        return b.z;
    }

    public int getMaxZ() {
        return a.z;
    }

    public Parallelepiped(Point point1, Point point2) {

        a = new Point(Math.min(point1.x, point2.x), Math.min(point1.y, point2.y), Math.max(point1.z, point2.z));
        b = new Point(Math.max(point1.x, point2.x), Math.max(point1.y, point2.y), Math.min(point1.z, point2.z));
        c = new Point(b.x, a.y, a.z);
        d = new Point(a.x, a.y, b.z);
        e = new Point(b.x, a.y, b.z);
        f = new Point(a.x, b.y, a.z);
        g = new Point(b.x, b.y, a.z);
        h = new Point(a.x, b.y, b.z);
    }

    //потестировать корректное создание пипеда
    public void printPoints() {

        System.out.println("Point a: ");
        printPoint(a);
        System.out.println("Point b: ");
        printPoint(b);
        System.out.println("Point c: ");
        printPoint(c);
        System.out.println("Point d: ");
        printPoint(d);
        System.out.println("Point e: ");
        printPoint(e);
        System.out.println("Point f: ");
        printPoint(f);
        System.out.println("Point g: ");
        printPoint(g);
        System.out.println("Point h: ");
        printPoint(h);
    }

    private void printPoint(Point point) {

        System.out.printf("x = %d, y = %d, z = %d\n", point.x, point.y, point.z);
    }
}
