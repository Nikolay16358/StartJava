package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Реверс значений массива");
        int[] numbers = {5, 2, 1, 6, 4, 7, 3};
        System.out.print("Исходный массив: ");
        printArray(numbers);
        int len = numbers.length;
        for (int i = 0; i <= len / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[--len];
            numbers[len] = temp;
        }

        System.out.print("\nИзмененный массив: ");
        printArray(numbers);

        System.out.println("\n\nЗадача 2. Вывод произведения элементов массива");
        int[] multipliers = new int[10];
        len = multipliers.length;
        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
        }

        System.out.print("Произведение элементов массива равно ");
        int multiplication = 1;
        for (int i = 1; i < len - 1; i++) {
            multiplication *= multipliers[i];
            System.out.print(multipliers[i]);
            System.out.print((multipliers[i] < len - 2) ? " * " : " = ");
        }

        System.out.println(multiplication);
        System.out.print("Первый элемент массива с индексом 0 равен " + multipliers[0] + ", а последний элемент " +
                "массива с индексом 10 равен " + multipliers[len - 1]);

        System.out.println("\n\nЗадача 3. Удаление элементов массива");
        double[] randomDoubles = new double[15];
        len = randomDoubles.length;
        for (int i = 0; i < len; i++) {
            randomDoubles[i] = Math.random();
        }

        System.out.println("Исходный массив:");
        printArrayIn2Lines(randomDoubles);

        double middleCellNumber = randomDoubles[len / 2];
        int numberZeroCells = 0;
        for (int i = 0; i < len; i++) {
            if (randomDoubles[i] > middleCellNumber) {
                randomDoubles[i] = 0.0;
                numberZeroCells++;
            }
        }

        System.out.println("\n\nИзмененный массив:");
        printArrayIn2Lines(randomDoubles);
        System.out.println("\n\nКоличество обнуленных ячеек в измененном массиве равно: " + numberZeroCells);

        System.out.println("\nЗадача 4. Вывод элементов массива лесенкой в обратном порядке");
        char[] englishAlphabet = new char[26];
        len = englishAlphabet.length;
        for (int i = 0; i < len; i++) {
            englishAlphabet[i] = (char) ('A' + i);
        }

        String charToString = Character.toString(englishAlphabet[len - 1]);
        for (int i = len - 1; i >= 0; i--) {
            System.out.println(charToString);
            if (i > 0) {
                charToString += englishAlphabet[i - 1];
            } else {
                break;
            }
        }

        System.out.println("\nЗадача 5. Генерация уникальных чисел");
        int[] uniqueNumbers = new int[30];
        len = uniqueNumbers.length;
        for (int i = 0; i < len; i++) {
            int randomNumber;
            do {
                randomNumber = (int) (60 + Math.random() * 40);
            } while (isUnique(uniqueNumbers, randomNumber));
            uniqueNumbers[i] = randomNumber;
        }

        Arrays.sort(uniqueNumbers);
        printArrayIn3Lines(uniqueNumbers);

        System.out.println("\n\nЗадача 6. Копирование не пустых строк");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = srcStrings.length;
        int countNonBlankStrings = 0;
        for (String strArr : srcStrings) {
            if (!strArr.isBlank()) {
                countNonBlankStrings++;
            }
        }

        String[] destStrings = new String[countNonBlankStrings];
        int tempLength = 0;
        for (int i = 0, srcPos = 0, destPos = 0; i < len; ) {
            while (!srcStrings[i].isBlank()) {
                tempLength++;
                i++;
            }

            if (!srcStrings[srcPos].isBlank()) {
                System.arraycopy(srcStrings, srcPos, destStrings, destPos, tempLength);
                srcPos += tempLength;
                destPos += tempLength;
                tempLength = 0;
            } else {
                i++;
                srcPos++;
            }
        }

        System.out.print("Первый массив: ");
        printArray(srcStrings);
        System.out.print("\nВторой массив: ");
        printArray(destStrings);
    }

    private static void printArray(int[] array) {
        for (int intArr : array) {
            System.out.print(intArr + " ");
        }
    }

    private static void printArray(String[] array) {
        for (String strArr : array) {
            System.out.print(strArr + " ");
        }
    }

    private static void printArrayIn2Lines(double[] array) {
        for (int i = 0; i < array.length - 7; i++) {
            System.out.printf("%5.3f", array[i]);
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 8; i < array.length; i++) {
            System.out.printf("%5.3f", array[i]);
            System.out.print(" ");
        }
    }

    private static void printArrayIn3Lines(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            System.out.printf("%3s", array[i]);
            System.out.print(" ");
        }
    }

    private static boolean isUnique(int[] array, int number) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                result = true;
            }
        }
        return result;
    }
}
