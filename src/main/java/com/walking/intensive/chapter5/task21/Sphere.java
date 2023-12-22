package com.walking.intensive.chapter5.task21;

public class Sphere {

    int x;
    int y;
    int z;
    int radius;

    public Sphere(int x, int y, int z, int radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
    }

    public boolean isIntersected(Parallelepiped parallelepiped) {

        //проверка, что сфера полностью внутри пипеда
        if (parallelepiped.getMinX() < x - radius && parallelepiped.getMaxX() > x + radius // если сфера вписывается в пипед по оси Х
                && parallelepiped.getMinY() < y - radius && parallelepiped.getMaxY() > y + radius // и сфера вписывается по оси Y
                && parallelepiped.getMinZ() < z - radius && parallelepiped.getMaxZ() > z + radius) { // и сфера вписывается по оси Z
            return false; // то сфера полностью внутри пипеда и не пересекает его
        }

        //проверка, что пипед полностью внутри сферы
        if (x - radius < parallelepiped.getMinX() && x + radius > parallelepiped.getMaxX() // если пипед вписывается в сферу по оси Х
                && y - radius < parallelepiped.getMinY() && y + radius > parallelepiped.getMaxY() // и пипед вписывается по оси Y
                && z - radius < parallelepiped.getMinZ() && z + radius > parallelepiped.getMaxZ()) { // и пипед вписывается по оси Z
            return false; // то пипед полностью внутри сферы и не пересекает ее
        }

        // проверяем одновременное пересечение по трем осям
        return isIntersectedAxisX(parallelepiped) && isIntersectedAxisY(parallelepiped) && isIntersectedAxisZ(parallelepiped);
    }

    public boolean isIntersectedAxisX(Parallelepiped parallelepiped) {
        return parallelepiped.getMinX() <= x && parallelepiped.getMaxX() >= x  // если X центра окружности находится между крайними X пипеда
                || parallelepiped.getMinX() >= x - radius && parallelepiped.getMinX() <= x + radius // или если minX пипеда находится между крайними X сферы
                || parallelepiped.getMaxX() >= x - radius && parallelepiped.getMaxX() <= x + radius; // или если maxX пипеда находится между крайними X сферы
    }

    public boolean isIntersectedAxisY(Parallelepiped parallelepiped) {
        return parallelepiped.getMinY() <= y && parallelepiped.getMaxY() >= y  // если Y центра окружности находится между крайними Y пипеда
                || parallelepiped.getMinY() >= y - radius && parallelepiped.getMinY() <= y + radius // или если minY пипеда находится между крайними Y сферы
                || parallelepiped.getMaxY() >= y - radius && parallelepiped.getMaxY() <= y + radius; // или если maxY пипеда находится между крайними Y сферы
    }

    public boolean isIntersectedAxisZ(Parallelepiped parallelepiped) {
        return parallelepiped.getMinZ() <= z && parallelepiped.getMaxZ() >= z  // если Z центра окружности находится между крайними Z пипеда
                || parallelepiped.getMinZ() >= z - radius && parallelepiped.getMinZ() <= z + radius // или если minZ пипеда находится между крайними Z сферы
                || parallelepiped.getMaxZ() >= z - radius && parallelepiped.getMaxZ() <= z + radius; // или если maxZ пипеда находится между крайними Z сферы
    }
}
