package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        getPascalTriangle(5);
    }

    static String getPascalTriangle(int N) {
        int CnK = 1;
        String maxStr = "";
        maxStr += 1 + " ";
        for (int k = 1; k < N - 1; k++) {
            CnK *= ((N - 1) - k + 1);
            CnK /= k;
            maxStr += CnK + " ";
        }
        maxStr += 1;
        System.out.println(maxStr.length());
        for (int n = 0; n < N; n++) {
            int maxCnK = 0;
            String strN = "";
            CnK = 1;
            strN += CnK + " ";
            for (int k = 1; k <= n; k++) {
                CnK *= (n - k + 1);
                CnK /= k;
                strN += CnK + " ";
                if (CnK > maxCnK){
                    maxCnK = CnK;
                }
            }

                System.out.println(" ".repeat(maxStr.length() / 3 -n) + strN + " ".repeat(maxStr.length() / 3-n));

        }
        return null;
    }
}