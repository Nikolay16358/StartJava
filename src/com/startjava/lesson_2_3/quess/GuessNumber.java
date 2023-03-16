package com.startjava.lesson_2_3.quess;

import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int hiddenNumber = (int) (Math.random() * 100 + 1);
        player1.setNumber(0);
        player2.setNumber(0);
        while (true) {
            System.out.println(player1.getName() + ", введите число: ");
            player1.setNumber(scanner.nextInt());
            if (hiddenNumber > player1.getNumber()) {
                System.out.println("Число " + player1.getName() + " меньше того, что загадал компьютер.");
            } else if (hiddenNumber < player1.getNumber()) {
                System.out.println("Число " + player1.getName() + " больше того, что загадал компьютер.");
            } else {
                System.out.println(player1.getName() + ", Вы победили!");
                break;
            }

            System.out.println(player2.getName() + ", введите число: ");
            player2.setNumber(scanner.nextInt());
            if (hiddenNumber > player2.getNumber()) {
                System.out.println("Число " + player2.getName() + " меньше того, что загадал компьютер.");
            } else if (hiddenNumber < player2.getNumber()) {
                System.out.println("Число " + player2.getName() + " больше того, что загадал компьютер.");
            } else {
                System.out.println(player2.getName() + ", Вы победили!");
                break;
            }
        }
    }
}
