package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userAnswer = "yes";
        while (!userAnswer.equals("no")) {
            if (userAnswer.equals("yes")) {
                System.out.println("Введите первое число: ");
                calculator.setNum1(scan.nextInt());
                System.out.println("Введите знак математической операции: ");
                calculator.setSign(scan.next().charAt(0));
                System.out.println("Введите второе число: ");
                calculator.setNum2(scan.nextInt());
                calculator.calculate();
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            } else {
                System.out.println("Недопустимый ответ. Введите yes или no: ");
            }

            userAnswer = scan.next();
        }
    }
}