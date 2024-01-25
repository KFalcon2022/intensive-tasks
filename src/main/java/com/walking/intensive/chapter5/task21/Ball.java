package com.walking.intensive.chapter5.task21;

public class Ball {
    private final int xBallCenter;
    private final int yBallCenter;
    private final int zBallCenter;
    private final int rBall;

    public Ball(int xBallCenter, int yBallCenter, int zBallCenter, int rBall) {
        this.xBallCenter = xBallCenter;
        this.yBallCenter = yBallCenter;
        this.zBallCenter = zBallCenter;
        this.rBall = rBall;
    }

    public int getXBallCenter() {
        return xBallCenter;
    }

    public int getYBallCenter() {
        return yBallCenter;
    }

    public int getZBallCenter() {
        return zBallCenter;
    }

    public int getRBall() {
        return rBall;
    }
}
