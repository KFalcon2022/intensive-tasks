package src.main.java.com.walking.intensive.chapter1.task5;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        double a = 10;
        double b = 11;
        double c = 12;

        if (!isTriangleExists(a, b, c)) {
            return;
        }

        System.out.println("Площадь треугольника через формулу Герона: " + getAreaByHeron(a, b, c));

        System.out.print("Длины высот треугольника: ");
        show(getHeights(a, b, c));

        System.out.print("Длины медиан треугольника: ");
        show(getMedians(a, b, c));

        System.out.print("Длины биссектрис треугольника: ");
        show(getBisectors(a, b, c));

        System.out.print("Углы треугольника: ");
        show(getAngles(a, b, c));

        System.out.println("Радиус вписанной в треугольник окружности: " + getInscribedCircleRadius(a, b, c));

        System.out.println("Радиус описанной вокруг треугольника окружности: " + getCircumradius(a, b, c));

        System.out.println("Площадь треугольника через синус угла: " + getAreaAdvanced(a, b, c));
    }

    static double getAreaByHeron(double a, double b, double c) {
        double halfmeter = (a + b + c) / 2;
        return Math.sqrt(halfmeter * (halfmeter - a) * (halfmeter - b) * (halfmeter - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double area = getAreaByHeron(a, b, c);
        double[] heights = {2 * area / a,
                            2 * area / b,
                            2 * area / c};
        return doSort(heights);
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] medians = {Math.sqrt(2 * a * a + 2 * b * b - c * c) / 2,
                            Math.sqrt(2 * b * b + 2 * c * c - a * a) / 2,
                            Math.sqrt(2 * a * a + 2 * c * c - b * b) / 2};
        return doSort(medians);
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] bisectors = {Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b),
                              Math.sqrt(b * c * (b + c + a) * (b + c - a)) / (b + c),
                              Math.sqrt(a * c * (a + c + b) * (a + c - b)) / (a + c)};
        return doSort(bisectors);
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double area = getAreaByHeron(a, b, c);
        double[] angles = {Math.acos((a * a + c * c - b * b) / (2 * a * c)),
                           Math.acos((a * a + b * b - c * c) / (2 * a * b)),
                           Math.acos((b * b + c * c - a * a) / (2 * b * c))};
        return doSort(angles);
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double halfmeter = (a + b + c) / 2;
        return Math.sqrt((halfmeter - a) * (halfmeter - b) * (halfmeter - c) / halfmeter);
    }

    static double getCircumradius(double a, double b, double c) {
        double area = getAreaByHeron(a, b, c);
        return (a * b * c) / (4 * area);
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cos = (a * a + b * b - c * c) / (2 * a * b);
        double sin = Math.sqrt(1 - cos * cos);
        return (a * b * sin) / 2;
    }

    static boolean isTriangleExists(double a, double b, double c) {
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            return true;
        } else {
            System.out.println("Треугольника с такими сторонами не существует.");
            return false;
        }
    }

    static double[] doSort(double[] values) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (values[j] > values[j + 1]) {
                    double temp = values[j + 1];
                    values[j + 1] = values[j];
                    values[j] = temp;
                }
            }
        }

        return values;
    }

    static void show(double[] values) {
        for (double value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}