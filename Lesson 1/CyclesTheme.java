public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Подсчет суммы четных и нечетных чисел");
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        int i1 = -10;
        do {
            if (i1 % 2 == 0) {
                sumOfEvenNumbers += i1;
            } else {
                sumOfOddNumbers += i1;
            }
            i1++;
        } while (i1 <= 21);

        System.out.println("В промежутке [-10; 21] сумма четных чисел = " + sumOfEvenNumbers + 
                ", а нечетных = " + sumOfOddNumbers);

        System.out.println("\nЗадача 2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num1;
        int minNum = num2;
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                maxNum = num1;
                minNum = num3;
            }
        }

        if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                maxNum = num2;
                minNum = num3;
            } else {
                maxNum = num2;
                minNum = num1;
            }
        }

        if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                maxNum = num3;
                minNum = num2;
            } else {
                maxNum = num3;
                minNum = num1;
            }
        }

        for (int i2 = maxNum - 1; i2 > minNum; i2--) {
            System.out.print(i2 + " ");
        }

        System.out.println("\n\nЗадача 3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sum = 0;
        int i3 = 0;
        int bitNum;
        while (i3 < 4) {
            bitNum = srcNum % 10;
            srcNum /= 10;
            sum += bitNum;
            System.out.print(bitNum);
            i3++;
        }

        System.out.println("\nСумма цифр числа равна " + sum);

        System.out.println("\nЗадача 4. Вывод чисел на консоль в несколько строк");
        int startOfSegment = 1;
        int endOfInterval = 24;
        int countOfValues = 0;
        for (int i4 = startOfSegment; i4 < endOfInterval; i4 += 2) {
            if (countOfValues % 5 != 0 || (countOfValues % 5 == 0 && countOfValues / 5 == 0)) {
                System.out.printf("%3d", i4);
            } else if (countOfValues % 5 == 0 && countOfValues / 5 >= 1) {
                System.out.println();
                System.out.printf("%3d", i4);
            }
            countOfValues++;
        }

        if (countOfValues % 5 != 0) {
            for (countOfValues = countOfValues; countOfValues % 5 != 0; countOfValues++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\nЗадача 5. Проверка количества двоек на четность/нечетность");
        int srcNum2 = 3_242_592;
        int count = 0;
        int i5 = 0;
        int bitNum2;
        System.out.print("Число " + srcNum2 + " содержит ");
        while (i5 < 7) {
            bitNum2 = srcNum2 % 10;
            srcNum2 /= 10;
            if (bitNum2 == 2) {
                count++;
            }
            i5++;
        }

        if (count % 2 == 0) {
            System.out.println(count + " (четное) количество двоек");
        } else {
            System.out.println(count + " (нечетное) количество двоек");
        }

        System.out.println("\nЗадача 6. Отображение фигур в консоли");
        char symbol42 = '*';
        char symbol35 = '#';
        char symbol36 = '$';
        int i35 = 4;
        int j35 = 4;
        int i36 = 0;
        int j36 = 0;
        for (int i42 = 0; i42 < 5; i42++) {
            System.out.print(symbol42);
            for (int j42 = 0; j42 < 9; j42++) {
                System.out.print(symbol42);
            }

            System.out.println();
        }

        System.out.println();
        while (i35 >= 0) {
            System.out.print(symbol35);
            while (j35 > 0) {
                System.out.print(symbol35);
                j35--;
            }

            j35 = i35 - 1;
            i35--;
            System.out.println();
        }

        System.out.println();
        do {
            System.out.print(symbol36);
            do {
                if (i36 == 2 && j36 == 2) {
                    System.out.print(symbol36 + "" + symbol36);
                } else if ((i36 == 1 && j36 == 1) || (i36 == 3 && j36 == 3)) {
                    System.out.print(symbol36);
                } else {
                    System.out.print("");
                }

                j36++;
            } while (j36 <= 4);
            System.out.println();
            i36++;
            j36 = i36;
        } while (i36 <= 4);

        System.out.println("\nЗадача 7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (int i7 = 1; i7 < 48; i7++) {
            if (i7 % 2 != 0) {
                System.out.printf("%3d%5c", i7, (char) i7);
                System.out.println();
            }
        }

        for (int j7 = 97; j7 < 123; j7++) {
            if (j7 % 2 == 0) {
                System.out.printf("%3d%5c", j7, (char) j7);
                System.out.println();
            }
        }

        System.out.println("\nЗадача 8. Проверка, является ли число палиндромом");
        int srcNum3 = 1_234_321;
        int srcNum4 = srcNum3;
        int bitNum4;
        int result = 0;
        int multiplier = 1_000_000;
        for (int i8 = 0; i8 < 7; i8++) {
            bitNum4 = srcNum4 % 10;
            srcNum4 = srcNum4 / 10;
            result += bitNum4 * multiplier;
            multiplier /= 10;
        }

        if (result == srcNum3) {
            System.out.println("Число " + srcNum3 + " является палиндромом");
        }

        System.out.println("\nЗадача 9. Определение, является ли число счастливым");
        int srcNum5 = 383_905;
        int firstHalfSrcNum4 = srcNum5 / 1000;
        int secondHalfSrcNum4 = srcNum5 % 1000;
        int firstBitNum;
        int secondBitNum;
        int firstSum = 0;
        int secondSum = 0;
        for (int i9 = 0; i9 < 3; i9++) {
            firstBitNum = firstHalfSrcNum4 % 10;
            firstHalfSrcNum4 /= 10;
            firstSum += firstBitNum;
            secondBitNum = secondHalfSrcNum4 % 10;
            secondHalfSrcNum4 /= 10;
            secondSum += secondBitNum;
        }

        System.out.println("Сумма цифр " + (srcNum5 / 1000) + " = " + firstSum + 
                ", а сумма цифр " + (srcNum5 % 1000) + " = " + secondSum + ".");
        System.out.print("Число " + srcNum5 + " является ");
        if (firstSum == secondSum) {
            System.out.println("счастливым.");
        } else {
            System.out.println("несчастливым.");
        }

        System.out.println("\nЗадача 10. Вывод таблицы умножения Пифагора");
        System.out.println("      ТАБЛИЦА ПИФАГОРА");
        for (int i10 = 1; i10 < 10; i10++) {
            for (int j10 = 1; j10 < 10; j10++) {
                if (j10 == 1 && i10 == 1) {
                    System.out.printf("%3s", " |");
                } else if (j10 == 1) {
                    System.out.printf("%3s", i10 * j10 + "|");
                } else {
                    System.out.printf("%3d", i10 * j10);
                }
            }

            if (i10 == 1) {
                System.out.print("\n---------------------------");
            }

            System.out.println();
        }
    }
}
