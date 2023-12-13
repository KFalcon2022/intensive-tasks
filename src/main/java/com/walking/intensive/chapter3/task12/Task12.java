package main.java.com.walking.intensive.chapter3.task12;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {

    }

    public static int[] getNumberOfMovements(String baskets) {
        int[] array = new int[baskets.length()];

        for (int i = 0; i < baskets.length(); i++) {
            int result = 0;
            for (int j = baskets.length() - 1; j >= 0; j--) {
                if (baskets.charAt(j) == '0') {
                    continue;
                }
                result += Math.max(i, j) - Math.min(i, j);
            }
            array[i] = result;
        }
        return array;
    }
}