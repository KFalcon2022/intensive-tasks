package com.walking.intensive.chapter5.task21;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(4,8,4, 4);
        Parallelepiped parallelepiped = new Parallelepiped(7,3,2, 12, 7, 5);
        System.out.println(isCollision(ball, parallelepiped));
    }

    private static boolean isCollision(Ball ball, Parallelepiped parallelepiped) {

        return ((Math.min(parallelepiped.getxPointA(), parallelepiped.getxPointB()) <= (ball.getxBallCenter() + ball.getrBall()))
                & (Math.max(parallelepiped.getxPointA(), parallelepiped.getxPointB()) >= (ball.getxBallCenter() - ball.getrBall())))

                & ((Math.min(parallelepiped.getyPointA(), parallelepiped.getyPointB()) <= (ball.getyBallCenter() + ball.getrBall()))
                & (Math.max(parallelepiped.getyPointA(), parallelepiped.getyPointB()) >= (ball.getyBallCenter() - ball.getrBall())))

                & ((Math.min(parallelepiped.getzPointA(), parallelepiped.getzPointB()) <= (ball.getzBallCenter() + ball.getrBall()))
                & (Math.max(parallelepiped.getzPointA(), parallelepiped.getzPointB()) >= (ball.getzBallCenter() - ball.getrBall())));
    }
}