package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
	public static void main(String[] args) {
		int age = 21;

		System.out.println(getAgeString(age));
	}

	static String getAgeString(int age) {
		if (!(age % 10 >= 1 && age % 10 <= 4) || age % 100 >= 11 && age % 100 <= 14) {
			return "Вам " + age + " лет.";
		} else if (age % 10 == 1) {
			return "Вам " + age + " год.";
		}
		return "Вам " + age + " года.";
	}
}
