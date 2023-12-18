package main.java.com.walking.intensive.chapter3.task13;


public class Task13 {
    public static void main(String[] args) {

    }

    public static int getCountSteps(int[] plants, int wateringCanVolume) {
        int currentWater = 0;
        int steps = 0;

        for (int i = 0; i < plants.length; i++) {
            if (currentWater < plants[i]) {
                steps += i * 2;
                currentWater = wateringCanVolume;
            }
            currentWater -= plants[i];
            steps++;
        }
        return steps;
    }
}