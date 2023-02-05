public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Подсчет суммы четных и нечетных чисел");
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        int counter1 = -10;
        do {
            if (counter1 % 2 == 0) {
                sumOfEvenNumbers += counter1;
            } else {
                sumOfOddNumbers += counter1;
            }
            counter1++;
        } while (counter1 <= 21);

        System.out.println("В промежутке [-10; 21] сумма четных чисел = " + sumOfEvenNumbers +
                ", а нечетных = " + sumOfOddNumbers);

        System.out.println("\nЗадача 2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num1 > num2 && num1 > num3 && num2 > num3) {
            min = num3;
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            max = num2;
            min = num3;
        } else if (num2 > num1 && num2 > num3 && num3 > num1) {
            max = num2;
            min = num1;
        } else if (num3 > num1 && num3 > num2 && num1 > num2) {
            max = num3;
        } else if (num3 > num1 && num3 > num2 && num2 > num1) {
            max = num3;
            min = num1;
        }

        for (int counter2 = max - 1; counter2 > min; counter2--) {
            System.out.print(counter2 + " ");
        }

        System.out.println("\n\nЗадача 3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int srcNum2 = srcNum;
        int sum = 0;
        int counter3 = 0;
        int countOfDigits = 0;
        do {
            srcNum2 /= 10;
            countOfDigits++;
        } while (srcNum2 > 0);

        while (counter3 < countOfDigits) {
            int digit3 = srcNum % 10;
            srcNum /= 10;
            sum += digit3;
            System.out.print(digit3);
            counter3++;
        }

        System.out.println("\nСумма цифр числа равна " + sum);

        System.out.println("\nЗадача 4. Вывод чисел на консоль в несколько строк");
        int startOfSegment = 1;
        int endOfInterval = 24;
        int count = 0;
        for (int counter4 = startOfSegment; counter4 < endOfInterval; counter4 += 2) {
            if (count % 5 == 0 && count / 5 >= 1) {
                System.out.println();
            }
            System.out.printf("%3d", counter4);
            count++;
        }

        if (count % 5 != 0) {
            for (int meter4 = count; meter4 % 5 != 0; meter4++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\nЗадача 5. Проверка количества двоек на четность/нечетность");
        int srcNum3 = 3_242_592;
        int srcNum4 = srcNum3;
        int countTwos = 0;
        int counter5 = 0;
        int countOfDigits2 = 0;
        System.out.print("Число " + srcNum3 + " содержит ");
        do {
            srcNum4 /= 10;
            countOfDigits2++;
        } while (srcNum4 > 0);

        while (counter5 < countOfDigits2) {
            int digit5 = srcNum3 % 10;
            srcNum3 /= 10;
            if (digit5 == 2) {
                countTwos++;
            }
            counter5++;
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
        for (int counter42 = 0; counter42 < 5; counter42++) {
            System.out.print(symbol42);
            for (int meter42 = 0; meter42 < 9; meter42++) {
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
        for (int counter7 = 1; counter7 < 48; counter7++) {
            if (counter7 % 2 != 0) {
                System.out.printf("%3d%5c", counter7, (char) counter7);
                System.out.println();
            }
        }

        for (int meter7 = 97; meter7 < 123; meter7++) {
            if (meter7 % 2 == 0) {
                System.out.printf("%3d%5c", meter7, (char) meter7);
                System.out.println();
            }
        }

        System.out.println("\nЗадача 8. Проверка, является ли число палиндромом");
        int srcNum5 = 1_234_321;
        int srcNum6 = srcNum5;
        int result = 0;
        int multiplier = 1_000_000;
        for (int counter8 = 0; counter8 < 7; counter8++) {
            int remainder = srcNum6 % 10;
            srcNum6 /= 10;
            result += remainder * multiplier;
            multiplier /= 10;
        }

        if (result == srcNum5) {
            System.out.println("Число " + srcNum5 + " является палиндромом");
        }

        System.out.println("\nЗадача 9. Определение, является ли число счастливым");
        int srcNum7 = 383_905;
        int firstHalfSrcNum4 = srcNum7 / 1000;
        int secondHalfSrcNum4 = srcNum7 % 1000;
        int firstSum = 0;
        int secondSum = 0;
        for (int counter9 = 0; counter9 < 3; counter9++) {
            int firstDigitNum = firstHalfSrcNum4 % 10;
            firstHalfSrcNum4 /= 10;
            firstSum += firstDigitNum;
            int secondDigitNum = secondHalfSrcNum4 % 10;
            secondHalfSrcNum4 /= 10;
            secondSum += secondDigitNum;
        }

        System.out.println("Сумма цифр " + (srcNum7 / 1000) + " = " + firstSum +
                ", а сумма цифр " + (srcNum7 % 1000) + " = " + secondSum + ".");
        System.out.print("Число " + srcNum7 + " является ");
        if (firstSum == secondSum) {
            System.out.println("счастливым.");
        } else {
            System.out.println("несчастливым.");
        }

        System.out.println("\nЗадача 10. Вывод таблицы умножения Пифагора");
        System.out.println("      ТАБЛИЦА ПИФАГОРА");
        for (int counter10 = 1; counter10 < 10; counter10++) {
            for (int meter10 = 1; meter10 < 10; meter10++) {
                if (meter10 == 1 && counter10 == 1) {
                    System.out.printf("%3s", " |");
                } else if (meter10 == 1) {
                    System.out.printf("%3s", counter10 * meter10 + "|");
                } else {
                    System.out.printf("%3d", counter10 * meter10);
                }
            }

            if (counter10 == 1) {
                System.out.print("\n---------------------------");
            }

            System.out.println();
        }
    }
}
