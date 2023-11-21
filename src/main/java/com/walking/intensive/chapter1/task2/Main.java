package com.walking.intensive.chapter1.task2;

/**
 * Условие:
 * <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
	public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
		System.out.println(getFlatLocation(2, 2, 5));
		System.out.println(getFlatLocation(2, 2, 100));
	}

	static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
		boolean isTrue = (floorAmount * entranceAmount * 4) >= flatNumber && flatNumber != 0;
		if (!isTrue) {
			return "Квартиры с номером " + flatNumber + " не существует в этом доме.";
		}
		int flatsAmountInEntrance = floorAmount * 4;//количество квартир в одном подъезде.
		int entrance = (flatNumber - 1) / flatsAmountInEntrance + 1; // вычисление подъезда.
		int floor = (((flatNumber - 1) - (entrance - 1) * flatsAmountInEntrance) / 4) + 1;// вычисление этажа.
		String location = null;
		switch (flatNumber % 4) {
		case 1: {
			location = "слева от лифта, влево";
			break;
		}
		case 2: {
			location = "слева от лифта, вправо";
			break;
		}
		case 3: {
			location = "справа от лифта, влево";
		}
		default:
			location = "справа от лифта, вправо";
		}
		return flatNumber + " кв – " + entrance + " подъезд, " + floor + " этаж, " + location;
	}
}
