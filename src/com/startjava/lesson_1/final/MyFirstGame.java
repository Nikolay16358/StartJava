package com.startjava.lesson_1.final_;

public class MyFirstGame {

    public static void main(String[] args) {
        int hiddenNumber = 52;
        int playerNumber = 100 / 2;
        while (playerNumber != hiddenNumber) {
            if (playerNumber > hiddenNumber) {
                System.out.println("Число игрока больше того, что загадал компьютер.");
                playerNumber--;
            } else {
                System.out.println("Число игрока меньше того, что загадал компьютер.");
                playerNumber++;
            }
        }

        System.out.println("Вы победили!");
    }
}
