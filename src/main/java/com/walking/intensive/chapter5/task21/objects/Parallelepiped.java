package com.walking.intensive.chapter5.task21.objects;

public class Parallelepiped {
    private final Point[] vertices = new Point[8];
    private final double x1, y1, z1, x2, y2, z2;

    public Parallelepiped(double x1, double y1, double z1, double x2, double y2, double z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
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

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", z1=" + z1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", z2=" + z2 +
                '}';
    }
}