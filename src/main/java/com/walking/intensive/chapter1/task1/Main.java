package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    private static final String[] FORBIDDEN_ARRAY = {"11", "12", "13", "14"};

    public static void main(String[] args) {

        //int age = 122;

        //System.out.println(getAgeString(age));

        for (int i = 0; i < 143; i++) {
            System.out.println(getAgeString(i));
        }
    }

    /**
     * Примечение (себе):
     * !isFound стоит первым, чтобы не проверялось второе условие при невыполнении первого.
     *
     * @param age - An integer
     * @return "Вам " + age + ending - a String
     */
    public static String getAgeString(int age) {

        String ending = null;

        boolean isFound = findInForbiddenArray(Integer.toString(age));
        int remainder = age % 10;

        if (!isFound && (remainder == 2 || remainder == 3 || remainder == 4)) {
            ending = " года";
        } else if (!isFound && (remainder == 1)) {
            ending = " год";
        } else {
            ending = " лет";
        }

        return "Вам " + age + ending;
    }

    public static boolean findInForbiddenArray(String ageString) {

        for (String str : FORBIDDEN_ARRAY) {
            if ((ageString.indexOf(str, ageString.length() - 2)) != -1) {
                return true;
            }
        }

        return false;
    }
}