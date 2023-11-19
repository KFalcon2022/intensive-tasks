package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 38;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
    	if (age % 10 >= 1 && age % 10 <= 4) {
			return "Вам " + age + " года.";
		} else {
			return "Вам " + age + " лет.";
		}
    }
}