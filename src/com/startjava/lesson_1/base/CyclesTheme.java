package com.startjava.lesson_1.base;

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
        int max = num2;
        int min = num1;
        if (num1 > max) {
            max = num1;
        }

        if (num3 > max) {
            max = num3;
        }

        if (num2 < min) {
            min = num2;
        }

        if (num3 < min) {
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
            if (count % 5 == 0) {
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
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        int linesNumber = 5;
        int columnsNumber = 5;
        while (linesNumber >= 0) {
            while (columnsNumber > 0) {
                System.out.print('#');
                columnsNumber--;
            }

            columnsNumber = linesNumber - 1;
            linesNumber--;
            System.out.println();
        }

        linesNumber = 0;
        columnsNumber = 0;
        do {
            do {
                System.out.print('$');
                columnsNumber++;
            } while (columnsNumber <= linesNumber && columnsNumber < 3);
            System.out.println();
            linesNumber++;
            if (linesNumber < 3) {
                columnsNumber = 0;
            } else {
                columnsNumber = linesNumber - 2;
            }
        } while (linesNumber < 5);

        System.out.println("\nЗадача 7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (int i = 1; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d%5c\n", i, (char) i);
            }
        }

        for (int j = 97; j < 123; j++) {
            if (j % 2 == 0) {
                System.out.printf("%3d%5c\n", j, (char) j);
            }
        }

        System.out.println("\nЗадача 8. Проверка, является ли число палиндромом");
        int srcNum3 = 1_234_321;
        int copySrcNum3 = srcNum3;
        int reverseNumber = 0;
        while (copySrcNum3 > 0) {
            int digit = copySrcNum3 % 10;
            copySrcNum3 /= 10;
            reverseNumber = reverseNumber * 10 + digit;
        }

        System.out.print("Число " + srcNum3);
        if (reverseNumber == srcNum3) {
            System.out.println(" является палиндромом");
        } else {
            System.out.println(" не является палиндромом");
        }

        System.out.println("\nЗадача 9. Определение, является ли число счастливым");
        int srcNum4 = 383_905;
        int leftHalfSrcNum4 = srcNum4 / 1000;
        int rightHalfSrcNum4 = srcNum4 % 1000;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < 3; i++) {
            int digit = leftHalfSrcNum4 % 10;
            leftHalfSrcNum4 /= 10;
            leftSum += digit;
            digit = rightHalfSrcNum4 % 10;
            rightHalfSrcNum4 /= 10;
            rightSum += digit;
        }

        System.out.println("Сумма цифр " + (srcNum4 / 1000) + " = " + leftSum +
                ", а сумма цифр " + (srcNum4 % 1000) + " = " + rightSum);
        System.out.print("Число " + srcNum4 + " является ");
        if (leftSum == rightSum) {
            System.out.println("счастливым");
        } else {
            System.out.println("несчастливым");
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
