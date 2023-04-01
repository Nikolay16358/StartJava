package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("male");
        wolf.setAlias("White fang");
        wolf.setWeight(45.3f);
        wolf.setAge(5);
        wolf.setWoolColour("white");
        System.out.println("The name of the wolf is " + wolf.getAlias() + ", he is " + wolf.getSex() +
                ", his weight is " + wolf.getWeight() + ", he is " + wolf.getAge() +
                " years old, his wool colour is " + wolf.getWoolColour() + ".");
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}