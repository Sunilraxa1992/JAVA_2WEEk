package com.greatlearning.corejava;

public class Bike1 {
    Bike1() {
        System.out.println("Bike is created.");
    }

    Bike1(int age, int date) {
        System.out.println("Bike is created. Age: " + age + ", Date: " + date);
    }

    public static void main(String[] args) {
        Bike1 bike1 = new Bike1();
        System.out.println(bike1);

        Bike1 bike2 = new Bike1(10, 20);
    }
}
