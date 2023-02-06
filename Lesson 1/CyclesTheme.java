public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Подсчет суммы четных и нечетных чисел");
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumOfEvenNumbers += counter;
            } else {
                sumOfOddNumbers += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.println("В промежутке [-10; 21] сумма четных чисел = " + sumOfEvenNumbers +
                ", а нечетных = " + sumOfOddNumbers);

        System.out.println("\nЗадача 2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num1 && num3 > num2) {
            max = num3;
        }

        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num3 < num1 && num3 < num2) {
            min = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача 3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sum = 0;
        while (srcNum > 0) {
            int digit = srcNum % 10;
            srcNum /= 10;
            sum += digit;
            System.out.print(digit);
        }

        System.out.println("\nСумма цифр числа равна " + sum);

        System.out.println("\nЗадача 4. Вывод чисел на консоль в несколько строк");
        int startOfSegment = 1;
        int endOfInterval = 24;
        int count = 0;
        for (int i = startOfSegment; i < endOfInterval; i += 2) {
            if (count % 5 == 0 && i != startOfSegment) {
                System.out.println();
            }
            System.out.printf("%3d", i);
            count++;
        }

        if (count % 5 != 0) {
            for (int j = count; j % 5 != 0; j++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\nЗадача 5. Проверка количества двоек на четность/нечетность");
        int srcNum2 = 3_242_592;
        int countTwos = 0;
        System.out.print("Число " + srcNum2 + " содержит ");
        while (srcNum2 > 0) {
            int digit = srcNum2 % 10;
            srcNum2 /= 10;
            if (digit == 2) {
                countTwos++;
            }
        }

        if (countTwos % 2 == 0) {
            System.out.println(countTwos + " (четное) количество двоек");
        } else {
            System.out.println(countTwos + " (нечетное) количество двоек");
        }

        System.out.println("\nЗадача 6. Отображение фигур в консоли");
        char symbol42 = '*';
        char symbol35 = '#';
        char symbol36 = '$';
        int counter35 = 4;
        int meter35 = 4;
        int counter36 = 0;
        int meter36 = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(symbol42);
            for (int j = 0; j < 9; j++) {
                System.out.print(symbol42);
            }

            System.out.println();
        }

        System.out.println();
        while (counter35 >= 0) {
            System.out.print(symbol35);
            while (meter35 > 0) {
                System.out.print(symbol35);
                meter35--;
            }

            meter35 = counter35 - 1;
            counter35--;
            System.out.println();
        }

        System.out.println();
        do {
            System.out.print(symbol36);
            do {
                if (counter36 == 2 && meter36 == 2) {
                    System.out.print(symbol36 + "" + symbol36);
                } else if ((counter36 == 1 && meter36 == 1) || (counter36 == 3 && meter36 == 3)) {
                    System.out.print(symbol36);
                } else {
                    System.out.print("");
                }

                meter36++;
            } while (meter36 <= 4);
            System.out.println();
            counter36++;
            meter36 = counter36;
        } while (counter36 <= 4);

        System.out.println("\nЗадача 7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (int i = 1; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d%5c", i, (char) i);
                System.out.println();
            }
        }

        for (int j = 97; j < 123; j++) {
            if (j % 2 == 0) {
                System.out.printf("%3d%5c", j, (char) j);
                System.out.println();
            }
        }

        System.out.println("\nЗадача 8. Проверка, является ли число палиндромом");
        int srcNum3 = 1_234_321;
        int copySrcNum3 = srcNum3;
        int secondCopySrcNum3 = srcNum3;
        int result = 0;
        int multiplier = 1;
        while (secondCopySrcNum3 > 1) {
            multiplier *= 10;
            secondCopySrcNum3 /= 10;
        }

        while (copySrcNum3 > 0) {
            int digit = copySrcNum3 % 10;
            copySrcNum3 /= 10;
            result += digit * multiplier;
            multiplier /= 10;
        }

        if (result == srcNum3) {
            System.out.println("Число " + srcNum3 + " является палиндромом");
        }

        System.out.println("\nЗадача 9. Определение, является ли число счастливым");
        int srcNum4 = 383_905;
        int firstHalfSrcNum4 = srcNum4 / 1000;
        int secondHalfSrcNum4 = srcNum4 % 1000;
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < 3; i++) {
            int firstDigitNum = firstHalfSrcNum4 % 10;
            firstHalfSrcNum4 /= 10;
            firstSum += firstDigitNum;
            int secondDigitNum = secondHalfSrcNum4 % 10;
            secondHalfSrcNum4 /= 10;
            secondSum += secondDigitNum;
        }

        System.out.println("Сумма цифр " + (srcNum4 / 1000) + " = " + firstSum +
                ", а сумма цифр " + (srcNum4 % 1000) + " = " + secondSum + ".");
        System.out.print("Число " + srcNum4 + " является ");
        if (firstSum == secondSum) {
            System.out.println("счастливым.");
        } else {
            System.out.println("несчастливым.");
        }

        System.out.println("\nЗадача 10. Вывод таблицы умножения Пифагора");
        System.out.println("      ТАБЛИЦА ПИФАГОРА");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 1 && i == 1) {
                    System.out.printf("%3s", " |");
                } else if (j == 1) {
                    System.out.printf("%3s", i * j + "|");
                } else {
                    System.out.printf("%3d", i * j);
                }
            }

            if (i == 1) {
                System.out.print("\n---------------------------");
            }

            System.out.println();
        }
    }
}
