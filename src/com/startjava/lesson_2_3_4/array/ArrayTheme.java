package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Реверс значений массива");
        int[] numbers1 = {5, 2, 1, 6, 4, 7, 3};
        int[] numbers2 = new int[7];
        int len1 = numbers1.length;
        for (int i = 0; i < len1; i++) {
            numbers2[i] = numbers1[len1 - 1 - i];
        }

        System.out.print("Массив numbers1: ");
        printArray(numbers1);
        System.out.print("\nМассив numbers2: ");
        printArray(numbers2);

        System.out.println("\n\nЗадача 2. Вывод произведения элементов массива");
        int[] numbers3 = new int[10];
        int len3 = numbers3.length;
        for (int i = 0; i < len3; i++) {
            numbers3[i] = i;
        }

        System.out.print("Произведение элементов массива numbers3 равно ");
        int multiplication = 1;
        for (int i = 1; i < len3 - 1; i++) {
            multiplication *= numbers3[i];
            System.out.print((numbers3[i] < len3 - 2) ? numbers3[i] + " * " : numbers3[i]);
        }

        System.out.println(" = " + multiplication);
        System.out.print("Первый элемент массива numbers3 с индексом 0 равен " + numbers3[0] + ", а последний элемент " +
                "массива с индексом 10 равен " + numbers3[len3 - 1]);

        System.out.println("\n\nЗадача 3. Удаление элементов массива");
        double[] numbers4 = new double[15];
        int len4 = numbers4.length;
        for (int i = 0; i < len4; i++) {
            numbers4[i] = Math.random();
        }

        int middleIndex = len4 / 2;
        double middleNum = numbers4[middleIndex];
        double[] numbers5 = new double[15];
        System.arraycopy(numbers4, 0, numbers5, 0, 15);
        for (int i = 0; i < len4; i++) {
            if (numbers5[i] > middleNum) {
                numbers5[i] = 0.0;
            }
        }

        System.out.println("Исходный массив numbers4:");
        printArrayIn2Lines(numbers4);
        System.out.println("\n\nИзмененный массив numbers5:");
        printArrayIn2Lines(numbers5);

        int numberOfZeroCells = 0;
        for (int i = 0; i < len4; i++) {
            if (numbers5[i] == 0.0) {
                numberOfZeroCells++;
            }
        }

        System.out.println("\n\nКоличество обнуленных ячеек в массиве numbers5 равно: " + numberOfZeroCells);

        System.out.println("\nЗадача 4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letters = new char[26];
        int length = letters.length;
        for (int i = 65, j = 0; i < 91; i++, j++) {
            letters[j] = (char) i;
        }

        String charToString = Character.toString(letters[length - 1]);
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(charToString);
            if (i > 0) {
                charToString = charToString + "" + letters[i - 1];
            } else {
                break;
            }
        }

        System.out.println("\nЗадача 5. Генерация уникальных чисел");
        int[] numbers6 = new int[30];
        int len6 = numbers6.length;
        for (int i = 0; i < len6; i++) {
            int randomNumber;
            do {
                randomNumber = (int) (60 + Math.random() * 40);

            } while (isUnique(numbers6, randomNumber));
            numbers6[i] = randomNumber;
        }

        Arrays.sort(numbers6);
        printArrayIn3Lines(numbers6);

        System.out.println("\n\nЗадача 6. Копирование не пустых строк");
        String[] strArr1 = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int length1 = strArr1.length;
        int length2 = 0;
        for (int i = 0; i < length1; i++) {
            if (strArr1[i].isBlank() != true) {
                length2 += 1;
            }
        }

        String[] strArr2 = new String[length2];
        for (int i = 0, j = 0; i < length1; i++) {
            if (!strArr1[i].isBlank()) {
                System.arraycopy(strArr1, i, strArr2, j, 1);
                j++;
            }
        }

        System.out.print("Первый массив strArr1: ");
        printArray(strArr1);
        System.out.print("\nВторой массив strArr2: ");
        printArray(strArr2);
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
