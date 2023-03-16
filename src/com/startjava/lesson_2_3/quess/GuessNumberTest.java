package com.startjava.lesson_2_3.quess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scan.next());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scan.next());
        GuessNumber game = new GuessNumber(player1, player2);
        String playerAnswer = "yes";
        while (!playerAnswer.equals("no")) {
            if (playerAnswer.equals("yes")) {
                game.start();
                System.out.println("Хотите продолжить игру? [yes/no]: ");
            } else {
                System.out.println("Недопустимый ответ. Введите yes или no: ");
            }

            playerAnswer = scan.next();
        }
    }
}