package com.walking.intensive.chapter1.task2;

public class House {
    private final int floorAmount;
    private final int entranceAmount;

    public House(int floorAmount, int entranceAmount) {
        this.floorAmount = floorAmount;
        this.entranceAmount = entranceAmount;
    }

    public int getFloorAmount() {
        return floorAmount;
    }

    public int getEntranceAmount() {
        return entranceAmount;
    }
    public int getFlatAmount() {
        return entranceAmount * floorAmount * 4;
    }

    public String getFlatLocation(int flatNumber) {

        int flatCountInFloor = 4;
        int flatCountInHouse = flatCountInFloor * getFloorAmount() * getEntranceAmount();
        int flatCountInEntrance = flatCountInFloor * getFloorAmount();

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
