package main.java.com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(1000000));
    }

    static int getFriendlyPair(int m) {
        int maxNumberFromPair = 0;
        for (int i = 1; i < m; i++) {
            if (searchDenominators(searchDenominators(i)) == i && searchDenominators(i) != i) {
                maxNumberFromPair = Math.max(searchDenominators(i), i);
            }
        }
        return maxNumberFromPair;
    }

    public static int searchDenominators(int num) {
        int sumDenominators = 0;
        for (int n = 1; n < num; n++) {
            if (num % n == 0) {
                sumDenominators += n;
            }
        }
        return sumDenominators;
    }
}