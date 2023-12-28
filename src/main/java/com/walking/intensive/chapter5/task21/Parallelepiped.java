package com.walking.intensive.chapter5.task21;

public class Parallelepiped {
    private int[][] heights;
    private int[][][] sides;
    private int[][][] lines;

    public Parallelepiped(int xA, int yA, int zA, int xB, int yB, int zB) {
        //0 = A, 1 = B, 2 = C, 3 = D, 4 = A1, 5 = B1, 6 = C1, 7 = D1
        this.heights = new int[][]{
                {Math.min(xA, xB), Math.min(yA, yB), Math.min(zA, zB)}, // A
                {Math.min(xA, xB), Math.min(yA, yB), Math.max(zA, zB)}, // B
                {Math.max(xA, xB), Math.min(yA, yB), Math.max(zA, zB)}, // C
                {Math.max(xA, xB), Math.min(yA, yB), Math.min(zA, zB)}, // D
                {Math.min(xA, xB), Math.max(yA, yB), Math.min(zA, zB)}, // A1
                {Math.min(xA, xB), Math.max(yA, yB), Math.max(zA, zB)}, // B1
                {Math.max(xA, xB), Math.max(yA, yB), Math.max(zA, zB)}, // C1
                {Math.max(xA, xB), Math.max(yA, yB), Math.min(zA, zB)}  // D1
        };

        // у [0] и [1] у всех точек одинаковый [][][0], [2] и [3] одинаковый [][][1], [4] и [5] одинаковый [][][2]

        this.sides = new int[][][]{
                {heights[0], heights[5]},
                {heights[3], heights[6]},
                {heights[4], heights[6]},
                {heights[0], heights[2]},
                {heights[0], heights[7]},
                {heights[1], heights[6]}
        }; // Я так понял, что мог бы и обойтись диагоналями, но уже ладно

        this.lines = new int[][][]{
                {heights[0], heights[1]}, {heights[1], heights[2]}, {heights[3], heights[2]}, {heights[0], heights[3]}, // Горизонтальные нижние ребра
                {heights[4], heights[5]}, {heights[5], heights[6]}, {heights[7], heights[6]}, {heights[4], heights[7]}, // Горизонтальные верхние ребра
                {heights[0], heights[4]}, {heights[1], heights[5]}, {heights[2], heights[6]}, {heights[3], heights[7]}  // Вертикальные ребра
        };
    }

    public int[][] getHeights() {

        return heights;
    }

    public int[][][] getSides() {

        return sides;
    }

    public int[][][] getLines() {
        return lines;
    }
}
