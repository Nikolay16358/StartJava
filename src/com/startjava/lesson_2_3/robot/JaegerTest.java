package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Cherno Alpha");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("Russia");
        jaeger1.setHeight(55.12f);
        System.out.println(jaeger1.getHeight());
        jaeger1.setHeight(85.34f);
        System.out.println("The correct height value of the first jaeger is " + jaeger1.getHeight());
        jaeger1.setWeight(2_412f);
        jaeger1.setSpeed(3);
        jaeger1.setStrength(10);
        jaeger1.setArmor(10);
        System.out.println("The first jaeger is from " + jaeger1.getOrigin() + 
                ", his name is " + jaeger1.getModelName());

        Jaeger jaeger2 = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2_312f, 5, 7, 4);
        System.out.println("The second jaeger is from " + jaeger2.getOrigin() + 
                ", his name is " + jaeger2.getModelName());
        System.out.println(jaeger1.getModelName() + " has " + jaeger1.getStrength() + " power");
        System.out.println(jaeger2.getModelName() + " has " + jaeger2.getStrength() + " power");
        System.out.println("The initial armor value of " + jaeger1.getModelName() + 
                " is " + jaeger1.getArmor());
        jaeger1.setArmor(8);
        System.out.println("The new armor value of " + jaeger1.getModelName() + 
                " is " + jaeger1.getArmor());
        System.out.println("The initial strength value of " + jaeger2.getModelName() + 
                " is " + jaeger2.getStrength());
        jaeger2.setStrength(9);
        System.out.println("The new strength value of " + jaeger2.getModelName() + 
                " is " + jaeger2.getStrength());
        jaeger1.useWeapon();
        jaeger2.useWeapon();
        jaeger1.wasBorn();
        jaeger2.wasBorn();
        jaeger2.setOrigin("China");
        jaeger2.wasBorn();
        jaeger1.changeSpeed('+',15);
        System.out.println("The new speed value of " + jaeger1.getModelName() + 
                " is " + jaeger1.getSpeed());
        jaeger2.changeSpeed('-', 10);
        System.out.println(jaeger2.getSpeed());
    }
}