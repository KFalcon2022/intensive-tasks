package com.walking.intensive.chapter5.task21;

public class Ball {

    int x;
    int y;
    int z;
    int radius;

    public Ball(int x, int y, int z, int radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
    }

    public boolean isIntersected(Parallelepiped parallelepiped) {

        // проверяем одновременное пересечение по трем осям
        return isIntersectedAxisX(parallelepiped) && isIntersectedAxisY(parallelepiped) && isIntersectedAxisZ(parallelepiped);
    }

    public boolean isIntersectedAxisX(Parallelepiped parallelepiped) {
        return parallelepiped.getMinX() <= x && parallelepiped.getMaxX() >= x  // если X центра шара находится между крайними X параллелепипеда
                || parallelepiped.getMinX() >= x - radius && parallelepiped.getMinX() <= x + radius // или если minX параллелепипеда находится между крайними X шара
                || parallelepiped.getMaxX() >= x - radius && parallelepiped.getMaxX() <= x + radius; // или если maxX параллелепипеда находится между крайними X шара
    }

    public boolean isIntersectedAxisY(Parallelepiped parallelepiped) {
        return parallelepiped.getMinY() <= y && parallelepiped.getMaxY() >= y  // если Y центра шара находится между крайними Y параллелепипеда
                || parallelepiped.getMinY() >= y - radius && parallelepiped.getMinY() <= y + radius // или если minY параллелепипеда находится между крайними Y шара
                || parallelepiped.getMaxY() >= y - radius && parallelepiped.getMaxY() <= y + radius; // или если maxY параллелепипеда находится между крайними Y шара
    }

    public boolean isIntersectedAxisZ(Parallelepiped parallelepiped) {
        return parallelepiped.getMinZ() <= z && parallelepiped.getMaxZ() >= z  // если Z центра шара находится между крайними Z параллелепипеда
                || parallelepiped.getMinZ() >= z - radius && parallelepiped.getMinZ() <= z + radius // или если minZ параллелепипеда находится между крайними Z шара
                || parallelepiped.getMaxZ() >= z - radius && parallelepiped.getMaxZ() <= z + radius; // или если maxZ параллелепипеда находится между крайними Z шара
    }
}
