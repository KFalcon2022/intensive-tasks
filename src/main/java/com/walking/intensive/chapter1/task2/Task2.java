package com.walking.intensive.chapter1.task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(getFlatLocation(10,2,41));
    }
    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        int entranceNumber = 0;
        String flatPosition, flatDirection;

        int entranceCapacity = floorAmount * 4;
        int flatAmount = entranceCapacity * entranceAmount;

        if ( flatNumber < 1 || flatNumber > flatAmount || floorAmount <1 || entranceAmount < 1)  {
            return "Такой квартиры не существует";
        }

        for (int i = 1 ; i <= entranceAmount ; i++) {
            if (flatNumber <= (entranceCapacity * i)) {
                entranceNumber = i;
                break;
            }
        }

        int flatNumberInEntrance = flatNumber - (entranceNumber-1) * entranceCapacity;
        int floorNumber = flatNumberInEntrance % 4 == 0 ? flatNumberInEntrance / 4 : (flatNumberInEntrance / 4) + 1;

        if (flatNumberInEntrance % 4 == 0 || flatNumberInEntrance % 4 == 3) {
            flatPosition = "справа";
            flatDirection = "вправо";
        } else {
            flatPosition = "слева";
            flatDirection = "влево";
        }

        return String.format ("%d кв - %d подъезд, %d этаж, %s от лифта, %s",
                flatNumber, entranceNumber, floorNumber , flatPosition, flatDirection);
    }
}