package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(5, 4);
        car1.setCost(15500);
        car1.printInfo();

        Car car2 = new Car(3, 4);
        car2.setCost(7500);
        car2.printInfo();

        Motorcycle motorcycle1 = new Motorcycle(2,180);
        motorcycle1.setCost(6500);
        motorcycle1.printInfo();

        Motorcycle motorcycle2 = new Motorcycle(2,250);
        motorcycle2.setCost(11500);
        motorcycle2.printInfo();
    }
}