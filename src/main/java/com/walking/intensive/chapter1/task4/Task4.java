package src.main.java.com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        double c = 2;

        System.out.println("Дискриминант: " + (b * b - 4 * a * c));
        System.out.println(solveQuadraticEquation(a, b, c));
    }

    /**
     * При формировании строки, корни уравнения должны указываться по возрастанию.
     * <p>
     * Примеры результирующей строки:
     * <p>
     * Количество решений: 2. Корни: -4;4
     * <p>
     * Количество решений: 1. Корень: 0
     * <p>
     * Количество решений: 0.
     */
    public static String solveQuadraticEquation(double a, double b, double c) {
        if ((a == 0) && (b == 0)) {
            if (c != 0) {
                return "Количество решений: 0.";
            }

            return "Решений бесконечно";
        }

        if (a == 0) {
            double root = -c / b;
            return "Количество решений: 1. Корень: " + root;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant == 0) {
            double root = (0 - b) / (2 * a);
            return "Количество решений: 1. Корень: " + root;
        }

        if (discriminant > 0) {
            double rootOne = (((0 - b) + Math.sqrt(discriminant))) / (2 * a);
            double rootTwo = (((0 - b) - Math.sqrt(discriminant))) / (2 * a);

            if (rootOne < rootTwo) {
                return "Количество решений: 2. Корни: " + rootOne + ";" + rootTwo;
            }

            return "Количество решений: 2. Корни: " + rootTwo + ";" + rootOne;
        }

        return "Количество решений: 0.";
    }
}