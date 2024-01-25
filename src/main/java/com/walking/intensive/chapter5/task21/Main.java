package com.walking.intensive.chapter5.task21;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(-1, -1, -1, 1);
        Parallelepiped parallelepiped = new Parallelepiped(0, 0, 0, 10, 10, 10);
        System.out.println(isCollision(ball, parallelepiped));
    }

    private static boolean isCollision(Ball ball, Parallelepiped parallelepiped) {
        int xClosestPoint = Math.max(Math.min(parallelepiped.getXPointA(), parallelepiped.getXPointB()),
                Math.min(Math.max(parallelepiped.getXPointB(), parallelepiped.getXPointA()), ball.getXBallCenter()));
        int yClosestPoint = Math.max(Math.min(parallelepiped.getYPointA(), parallelepiped.getYPointB()),
                Math.min(Math.max(parallelepiped.getYPointB(), parallelepiped.getYPointA()), ball.getYBallCenter()));
        int zClosestPoint = Math.max(Math.min(parallelepiped.getZPointA(), parallelepiped.getZPointB()),
                Math.min(Math.max(parallelepiped.getZPointA(), parallelepiped.getZPointB()), ball.getZBallCenter()));
        double distanceBallCenterClosestPoint = Math.sqrt(Math.pow(xClosestPoint - ball.getXBallCenter(), 2)
                + Math.pow(yClosestPoint - ball.getYBallCenter(), 2) + Math.pow(zClosestPoint - ball.getZBallCenter(), 2));

        return ball.getRBall() >= distanceBallCenterClosestPoint;
    }
}