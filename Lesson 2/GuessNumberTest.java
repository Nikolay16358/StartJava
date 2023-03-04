import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scan.next());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scan.next());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String playersAnswer = "yes";
        while (!playersAnswer.equals("no")) {
            if (playersAnswer.equals("yes")) {
                guessNumber.startGame();
                System.out.println("Хотите продолжить игру? [yes/no]: ");
            } else {
                System.out.println("Недопустимый ответ. Введите yes или no: ");
            }

            playersAnswer = scan.next();
        }
    }
}