package com.walking.intensive.chapter5.task21;

public class Parallelepiped {
    private final int xPointA;
    private final int yPointA;
    private final int zPointA;
    private final int xPointB;
    private final int yPointB;
    private final int zPointB;

    public Parallelepiped(int xPointA, int yPointA, int zPointA, int xPointB, int yPointB, int zPointB) {
        this.xPointA = xPointA;
        this.yPointA = yPointA;
        this.zPointA = zPointA;
        this.xPointB = xPointB;
        this.yPointB = yPointB;
        this.zPointB = zPointB;
    }

    public int getxPointA() {
        return xPointA;
    }

    public int getyPointA() {
        return yPointA;
    }

    public int getzPointA() {
        return zPointA;
    }

    public int getxPointB() {
        return xPointB;
    }

    public int getyPointB() {
        return yPointB;
    }

    public int getzPointB() {
        return zPointB;
    }

}
