package com.startjava.lesson_2_3.animal;

public class Wolf {

    private String sex;
    private String alias;
    private float weight;
    private int age;
    private String woolColour;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getWoolColour() {
        return woolColour;
    }

    public void setWoolColour(String woolColour) {
        this.woolColour = woolColour;
    }

    public void move() {
        System.out.println(alias + " is moving.");
    }

    public void sit() {
        System.out.println(alias + " is sitting.");
    }

    public void run() {
        System.out.println(alias + " is running.");
    }

    public void howl() {
        System.out.println(alias + " is howling.");
    }

    public void hunt() {
        System.out.println(alias + " is hunting.");
    }
}