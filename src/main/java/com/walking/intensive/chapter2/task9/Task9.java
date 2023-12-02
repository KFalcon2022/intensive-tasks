package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(20));
    }

    static String getPascalTriangle(int n) {
        String[] data = new String[n];
        String buff = "";
        String result = "";

        for (int i = 0; i < n; i++) {
            buff = getSummedLine(buff);
            data[i] = buff;
        }

        int maxLineLength = buff.length();

        for (int i = 0; i < n; i++) {
            result = result.concat(repeatSpace((maxLineLength - data[i].length()) / 2) + data[i] + "\n");
        }

        return result;
    }

    static String repeatSpace(int n) {
        return " ".repeat(Math.max(0, n));
    }

    private static String getSummedLine(String line) {
        if (line.isEmpty()) {
            return "1";
        }

        if (line.length() == 1) {
            return "1 1";
        }

        String result = "";
        boolean hasLeft = false, hasRight = false;
        int left = 0, right = 0;
        int buffer = 0;
        char activeSymbol;

        for (int i = 0; i < line.length(); i++) {
            activeSymbol = line.charAt(i);
            if (' ' == activeSymbol) {
                if (!hasLeft) {
                    hasLeft = true;
                    left = buffer;
                } else {
                    hasRight = true;
                    right = buffer;
                }

                if (hasRight) {
                    result = result.concat(" " + (left + right));
                    left = right;

                    hasRight = false;
                }
                buffer = 0;
            } else {
                buffer = buffer * 10 + (activeSymbol - '0');
            }
        }

        return "1" + result + " " + (left + buffer) + " 1";
    }


}