package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {

  public static void main(String[] args) {
    int floorAmount = 5;
    int entranceAmount = 3;
    int flatPerFloor = 4;
    for (int flatNum = 0; flatNum <= 61; flatNum++) {
      System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNum, flatPerFloor));
    }
  }

  static int findEntranceNum(int flatNum, int maxFlatPerEntrance) {
    return 1 + --flatNum / maxFlatPerEntrance;
  }

  static int findFloorNum(int flatNum, int maxFlatPerEntrance, int flatPerFloor) {
    return 1 + --flatNum % maxFlatPerEntrance / flatPerFloor;
  }

  static int findFlatLocation(int flatNum, int maxFlatPerEntrance, int flatPerFloor, int floorNum,
      int entranceNum) {
    return flatNum - flatPerFloor * --floorNum - maxFlatPerEntrance * --entranceNum;
  }

  static String getFlatLocation(int floorAmount, int entranceAmount, int flatNum,
      int flatPerFloor) {
    int maxFlatAmount = floorAmount * entranceAmount * flatPerFloor;
    if (flatNum > 0 && flatNum <= maxFlatAmount) {
      int maxFlatPerEntrance = maxFlatAmount / entranceAmount;
      int entranceNum = findEntranceNum(flatNum, maxFlatPerEntrance);
      int floorNum = findFloorNum(flatNum, maxFlatPerEntrance, flatPerFloor);
      int flatLocation = findFlatLocation(flatNum, maxFlatPerEntrance, flatPerFloor, floorNum,
          entranceNum);
      String location = switch (flatLocation) {
        case 1 -> " слева от лифта, влево";
        case 2 -> " слева от лифта, вправо";
        case 3 -> " справа от лифта, влево";
        case 4 -> " справа от лифта, вправо";
        default -> "ошибка в определении местонахождения квартиры";
      };
      return
          flatNum + " кв – " + entranceNum + " подъезд, " + floorNum + " этаж," + location;
    } else {
      return "Такой квартиры в доме нет!";
    }
  }
}