package com.walking.intensive.chapter1.task2;


public class Main {
    public static void main(String[] args) {

        System.out.println(getFlatLocation(3, 4, 8));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int flatLocation = flatNumber  % 4;
        int flatTotal = floorAmount * entranceAmount * 4;
        int flatPerEntrance = flatTotal / entranceAmount;
        int flatEntrance = (flatNumber - 1) / flatPerEntrance + 1;
        int flatFloor = (flatNumber - 1) % 12 / 4 + 1;

        if (flatNumber > flatTotal) {
            return ("Квартиры с номером " + flatNumber + " нет в данном доме");
        } else if (flatNumber <= 0) {
            return ("Номер квартиры не может быть равен или меньше 0");
        } else {
            switch (flatLocation) {
                case 1 -> {
                    return flatEntrance + " подъезд, " + flatFloor + " этаж, слева от лифта, влево";
                }
                case 2 -> {
                    return flatEntrance + " подъезд, " + flatFloor + " этаж, слева от лифта, вправо";
                }
                case 3 -> {
                    return flatEntrance + " подъезд, " + flatFloor + " этаж, справа от лифта, влево";
                }
                case 0 -> {
                    return flatEntrance + " подъезд, " + flatFloor + " этаж, справа от лифта, вправо";
                }
                default -> {
                    return "Oops, something wrong";
                }
            }
        }
    }
}