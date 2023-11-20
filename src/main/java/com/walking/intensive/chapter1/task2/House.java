package com.walking.intensive.chapter1.task2;

public record House(int floorAmount, int entranceAmount) {
    public int getFlatAmount() {
        return entranceAmount * floorAmount * 4;
    }

    public String getFlatLocation(int flatNumber) {

        int flatCountInFloor = 4;
        int flatCountInHouse = flatCountInFloor * floorAmount() * entranceAmount();
        int flatCountInEntrance = flatCountInFloor * floorAmount();

        if (flatNumber > flatCountInHouse) {
            return String.format("Квартир в этом доме только %d.", flatCountInHouse);
        }

        int entrance = (flatNumber - 1) / flatCountInEntrance + 1;
        int floor = ((flatNumber - 1) % flatCountInEntrance) / flatCountInFloor + 1;

        String direction;
        String sideFromElevator;

        if (flatNumber % 2 == 0) {
            direction = "вправо";
        } else {
            direction = "влево";
        }

        if (flatNumber % 2 != 0 && (flatNumber + 1) % 4 == 0 || flatNumber % 4 == 0) {
            sideFromElevator = "справа от лифта";
        } else {
            sideFromElevator = "слева от лифта";
        }
        return String.format("%d подъезд, %d этаж, %s, %s",
                entrance, floor, sideFromElevator, direction);
    }
}
