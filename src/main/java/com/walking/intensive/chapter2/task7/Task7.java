package main.java.com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {

    }

    static int getFriendlyPair(int m) {
        int sumDemominators1;
        int sumDemominators2;

        for (int i = 1; i < m; i++) {
            sumDemominators1 = searchDenominators(i);

            for (int j = 1; j < m; j++) {
                sumDemominators2 = searchDenominators(j);

                if (i == j) continue;

                if (sumDemominators1 == j && sumDemominators2 == i) {

                    return Math.max(i, j);
                }
            }
        }
        return -1;
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
