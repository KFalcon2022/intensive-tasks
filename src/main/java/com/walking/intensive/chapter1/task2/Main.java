package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getFlatLocation(3, 2, 16));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        final int FLATonFLOOR = 4; // константа кол-во кв на этаже
        final int totalFLAT = FLATonFLOOR * entranceAmount * floorAmount; // константа кол-во квартир всего в доме

        if (totalFLAT < flatNumber || flatNumber < 1) {
            return "Такой квартиры нет в данном доме";

        } else {
            int nomberPodezd = flatNumber / (floorAmount * FLATonFLOOR) + 1; // Номер подъезда
            int nomberFlour = flatNumber % (floorAmount * FLATonFLOOR) / FLATonFLOOR + 1; //номер этажа
            switch (flatNumber % 4) {//направление
                case 1 -> {
                    return flatNumber + " кв: " + nomberPodezd + " подъезд, " + nomberFlour + " этаж, слева от лифта, влево";
                }
                case 2 -> {
                    return flatNumber + " кв: " + nomberPodezd + " подъезд, " + nomberFlour + " этаж, слева от лифта, вправо";
                }
                case 3 -> {
                    return flatNumber + " кв: " + nomberPodezd + " подъезд, " + nomberFlour + " этаж, справа от лифта, влево";
                }
                default -> {
                    return flatNumber + " кв: " + nomberPodezd + " подъезд, " + nomberFlour + " этаж, справа от лифта, вправо";
                }
            }


        }

    }
}