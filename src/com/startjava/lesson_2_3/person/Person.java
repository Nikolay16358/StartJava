package com.startjava.lesson_2_3.person;

public class Person {

    String sex = "male";
    String name = "Ivan";
    float height = 1.94f;
    float weight = 92.7f;
    int age = 26;

    void move() {
        System.out.println(name + " is moving");
    }

    void sit() {
        System.out.println(name + " is sitting");
    }

    void run() {
        System.out.println(name + " is running");
    }

    void talk() {
        System.out.println(name + " is talking");
    }

    void teachJava() {
        System.out.println(name + " is teaching Java");
    }
}