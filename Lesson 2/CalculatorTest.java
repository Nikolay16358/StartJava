import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String playerAnswer = "yes";
        while (!playerAnswer.equals("no")) {
            if (playerAnswer.equals("yes")) {
                System.out.println("Введите первое число: ");
                calculator.setNum1(scan.nextInt());
                System.out.println("Введите знак математической операции: ");
                calculator.setSign(scan.next().charAt(0));
                System.out.println("Введите второе число: ");
                calculator.setNum2(scan.nextInt());
                calculator.mathCalculation();
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                playerAnswer = scan.next();
            } else {
                System.out.println("Недопустимый ответ. Введите yes или no: ");
                playerAnswer = scan.next();
            }
        }
    }
}