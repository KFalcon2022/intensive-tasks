package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 123;

        System.out.println(getAgeString(age));
    }

    static boolean ifContain(int x, int[] m) {
        for (int n : m) {
            if (x == n) {
                return true;
            }
        }
        return false;
    }

    ;

    static String getAgeString(int age) {

        int[] array1 = {1, 21, 31, 41, 51, 61, 71, 81, 91, 101, 121};
        int[] array2 = {2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44,
                52, 53, 54, 62, 63, 64, 72, 73, 74, 82, 83,
                84, 92, 93, 94, 102, 103, 104, 122, 123, 124};

        if (ifContain(age, array1)) {
            return ("Вам " + age + " год");
        } else if (ifContain(age, array2)) {
            return ("Вам " + age + " года");
        } else {
            return ("Вам " + age + " лет");
        }

    }

}