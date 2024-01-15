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

    public int getxBallCenter() {
        return xBallCenter;
    }

    public int getyBallCenter() {
        return yBallCenter;
    }

    public int getzBallCenter() {
        return zBallCenter;
    }

    public int getrBall() {
        return rBall;
    }
}
