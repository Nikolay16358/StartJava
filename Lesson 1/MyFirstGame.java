public class MyFirstGame {

    public static void main(String[] args) {
        int hiddenNumber = 52;
        int playerNumber = 100 / 2;
        if (playerNumber > hiddenNumber) {
            System.out.println("Число игрока больше того, что загадал компьютер.");
            for (int i = 0; i < 50; i++) {
                playerNumber--;
                if (playerNumber > hiddenNumber) {
                    System.out.println("Число игрока больше того, что загадал компьютер.");
                } else {
                    System.out.println("Вы победили!");
                    break;
                }
            }
        } else if (playerNumber < hiddenNumber) {
            System.out.println("Число игрока меньше того, что загадал компьютер.");
            for (int j = 0; j < 50; j++) {
                playerNumber++;
                if (playerNumber < hiddenNumber) {
                    System.out.println("Число игрока меньше того, что загадал компьютер.");
                } else {
                    System.out.println("Вы победили!");
                    break;
                }
            }
        } else {
            System.out.println("Вы победили!");
        }
    }
}
