package com.walking.intensive.chapter5.task21.objects;

public class Parallelepiped {
//    private int x1, y1, z1, x2, y2, z2;
//    private Point a1, b1, c1, d1, a2, b2, c2, d2;
    private Point[] vertices = new Point[8];

    public Parallelepiped(int x1, int y1, int z1, int x2, int y2, int z2) {
        vertices[0] = new Point(Math.min(x1, x2), Math.min(y1, y2), Math.min(z1, z2));
        vertices[1] = new Point(Math.max(x1, x2), Math.min(y1, y2), Math.min(z1, z2));
        vertices[2] = new Point(Math.min(x1, x2), Math.max(y1, y2), Math.min(z1, z2));
        vertices[3] = new Point(Math.max(x1, x2), Math.max(y1, y2), Math.min(z1, z2));
        vertices[4] = new Point(Math.min(x1, x2), Math.min(y1, y2), Math.max(z1, z2));
        vertices[5] = new Point(Math.max(x1, x2), Math.min(y1, y2), Math.max(z1, z2));
        vertices[6] = new Point(Math.min(x1, x2), Math.max(y1, y2), Math.max(z1, z2));
        vertices[7] = new Point(Math.max(x1, x2), Math.max(y1, y2), Math.max(z1, z2));
    }

    public Point getVertex(int index) {
        return vertices[index];
    }

    public Point[] getVertices() {
        return vertices;
    }
}
