package com.startjava.lesson_2_3_4.array;

public class ArrayMain {

    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {5.1f, .5f, 200.5f};
        System.out.println(numbers.length);
        System.out.println(numbers1.length);
//        System.out.println(numbers);
        for (float number : numbers1) {
            System.out.print(number + " ");
        }

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        String[] text = new String[3];
        for (String string: text) {
            System.out.print(string + " ");
        }
    }
}
