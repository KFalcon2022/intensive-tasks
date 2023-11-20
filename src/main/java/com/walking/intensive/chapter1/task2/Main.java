package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
/*
floorAmoout - количество этажей, entranceAmount -колич подъездов,flatNumber - номер кв
кол-во кв - 4 * floorAmoout * entranceAmount
 */

    }
    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        final int FLATonFLOOR = 4;
    final int totalFLAT = FLATonFLOOR * entranceAmount * floorAmount;
    if (totalFLAT < flatNumber || flatNumber < 1){
        return "Такой квартиры нет в данном доме";
    }
else {int nomberPodezd = flatNumber / (floorAmount * FLATonFLOOR)+1; // Номер подъезда
        int nomberFlour = flatNumber % (floorAmount * FLATonFLOOR) / FLATonFLOOR + 1; //номер этажа
        switch (flatt%4) {//направление
            case 1-> {
                System.out.println(flatt+ " кв: " +nomberPodezd +" подъезд, "+ nomberFlour + " этаж, слева от лифта, влево");
            }
            case 2-> {
                System.out.println(flatt+ " кв: " +nomberPodezd +" подъезд, "+ nomberFlour + " этаж, слева от лифта, вправо");
            }
            case 3->{
                System.out.println(flatt+ " кв: " +nomberPodezd +" подъезд, "+ nomberFlour + " этаж, справа от лифта, влево");
            }
            default -> {
                System.out.println(flatt+ " кв: " +nomberPodezd +" подъезд, "+ nomberFlour + " этаж, справа от лифта, вправо");
            }
        }


    }

    }
}