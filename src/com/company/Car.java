package com.company;

import com.company.ap.Costable;

public class Car extends Vehicle implements Costable {

    private int doorsCount;
    private int cost_Car;
    public Car(int wheelCount, int doorsCount){
        super(wheelCount);

        this.doorsCount =doorsCount;
    }

    @Override
    protected void printInfo() {

        System.out.println("Транспортное средство: Машина " + "\n"
                + "Количество дверей: " + wheelCount +"\n"
                + "Количество колес: " + doorsCount );

        System.out.println("Цена " + getCost());
        System.out.println();
    }

    @Override
    public void setCost(int cost_Car) {
this.cost_Car=cost_Car;
    }

    @Override
    public int getCost() {
        return cost_Car;
    }
}
