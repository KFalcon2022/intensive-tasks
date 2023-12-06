package main.java.com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(10));
    }

    static String getPascalTriangle(int n) {
        String result = "";
        int[][] array = getPascalTriangleNums(n);
        for (int i = 0; i < n; i++) {
            String currentString = "";
            for (int j = 0; j <= i; j++) {
                currentString += array[i][j] + " ";
            }
            for (int k = 0; k < ((n * 2) - currentString.length() / 2); k++) {
                result += " ";
            }
            result += currentString + "\n";
        }
        return result;
    }

    static int[][] getPascalTriangleNums(int n) {
        int[][] array = new int[n][n];
        array[0][0] = 1;
        array[1][0] = 1; // инициализация верхушки треугольника
        array[1][1] = 1;
        for (int i = 2; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0 || i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }
        return array;
    }
}