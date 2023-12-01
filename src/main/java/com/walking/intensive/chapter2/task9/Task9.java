package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        getPascalTriangle(30);
    }

    public static Long getFactorial(Long f) {
        Long result = new Long(1);
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static Long getFactorial(Long k, Long n) {
        Long result = new Long(k);
        for (Long i = k+1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    static Long getBinomial(Long k, Long n){
        if (n.equals(k)){
            return new Long(1);
        }
        if (k > n/2 || k > (n+1)/2){
            k = n - k;
        }
        return getFactorial(n-k+1, n) / getFactorial(k);
    }

    static String getNPascalLine(int n, int lastLineCount){
        String currentString = "1";
        String blankString = "";
        for (int j = 1; j <= n; j++){
            Long valueToAdd = getBinomial(new Long(j), new Long(n));
            currentString += " " + valueToAdd.toString();
        }

        if (lastLineCount > 0) {
            int blanksBeforeAndAfter = (lastLineCount - currentString.length())/2;
            for (int i = 0; i < blanksBeforeAndAfter; i++) {
                blankString += " ";
            }
        }

        return blankString + currentString + blankString;
    }

    static String getPascalTriangle(int n) {

        String lastString = getNPascalLine(n, 0);



        int lastLineLength = lastString.length();

        for (int i = 0; i < n; i++){
            System.out.println(getNPascalLine(i, lastLineLength));
        }

        return null;
    }
}