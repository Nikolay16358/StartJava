package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Реверс значений массива");
        int[] numbers = {5, 2, 1, 6, 4, 7, 3};
        System.out.print("Исходный массив: ");
        printArray(numbers);
        int len = numbers.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[len - 1 - i];
            numbers[len - 1 - i] = temp;
        }

        System.out.print("\nИзмененный массив: ");
        printArray(numbers);

        System.out.println("\n\nЗадача 2. Вывод произведения элементов массива");
        int[] singleDigits = new int[10];
        len = singleDigits.length;
        for (int i = 0; i < len; i++) {
            singleDigits[i] = i;
        }

        System.out.print("Произведение элементов массива равно ");
        int multiplication = 1;
        for (int i = 1; i < len - 1; i++) {
            multiplication *= singleDigits[i];
            System.out.print(singleDigits[i]);
            System.out.print((singleDigits[i] < len - 2) ?  " * " : "");
        }

        System.out.println(" = " + multiplication);
        System.out.print("Первый элемент массива с индексом 0 равен " + singleDigits[0] + ", а последний элемент " +
                "массива с индексом 10 равен " + singleDigits[len - 1]);

        System.out.println("\n\nЗадача 3. Удаление элементов массива");
        double[] randomFractionalNumbers = new double[15];
        len = randomFractionalNumbers.length;
        for (int i = 0; i < len; i++) {
            randomFractionalNumbers[i] = Math.random();
        }

        System.out.println("Исходный массив:");
        printArrayIn2Lines(randomFractionalNumbers);

        double middleCellNum = randomFractionalNumbers[len / 2];
        int numberZeroCells = 0;
        for (int i = 0; i < len; i++) {
            if (randomFractionalNumbers[i] > middleCellNum) {
                randomFractionalNumbers[i] = 0.0;
                numberZeroCells++;
            }
        }

        System.out.println("\n\nИзмененный массив:");
        printArrayIn2Lines(randomFractionalNumbers);
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
        int[] randomIntegers = new int[30];
        len = randomIntegers.length;
        for (int i = 0; i < len; i++) {
            int randomNumber;
            do {
                randomNumber = (int) (60 + Math.random() * 40);
            } while (isUnique(randomIntegers, randomNumber));
            randomIntegers[i] = randomNumber;
        }

        Arrays.sort(randomIntegers);
        printArrayIn3Lines(randomIntegers);

        System.out.println("\n\nЗадача 6. Копирование не пустых строк");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = srcStrings.length;
        int lengthDestStrings = 0;
        for (int i = 0; i < len; i++) {
            if (!srcStrings[i].isBlank()) {
                lengthDestStrings++;
            }
        }

        String[] destStrings = new String[lengthDestStrings];
        for (int i = 0, j = 0; i < len; i++) {
            if (!srcStrings[i].isBlank()) {
                System.arraycopy(srcStrings, i, destStrings, j,1);
                j++;
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
