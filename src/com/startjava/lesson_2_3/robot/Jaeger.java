package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, 
            int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height > 75f) {
            this.height = height;
        } else {
            System.out.println("The height value is incorrect.");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 2000) {
            this.weight = weight;
        } else {
            System.out.println("The weight value is incorrect.");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("The speed value is incorrect.");
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength >= 0) {
            this.strength = strength;
        } else {
            System.out.println("The strength value is incorrect.");
        }
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if (armor >= 0) {
            this.armor = armor;
        } else {
            System.out.println("The armor value is incorrect.");
        }
    }

    public void useWeapon() {
        System.out.println(modelName + " is shooting!");
    }

    public int changeSpeed(char sign, int speedChange) {
        switch (sign) {
            case '+':
                speed += speedChange;
                break;
            case '-':
                speed -= speedChange;
                break;
            default:
                System.out.println("Incorrect speed change operator.");
        }

        if (speed < 0) {
            System.out.println(modelName + " has stopped.");
            speed = 0;
        }

        return speed;
    }

    public void wasBorn() {
        if (origin.equals("Russia")) {
            System.out.println(modelName + " plays the balalaika well.");
        } else if (origin.equals("Japan")) {
            System.out.println(modelName + " likes to cook sushi.");
        } else {
            System.out.println("There is no any interesting information about " + modelName);
        }
    }
}