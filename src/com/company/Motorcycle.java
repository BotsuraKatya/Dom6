package com.company;
import com.company.ap.Costable;
public class Motorcycle  extends Vehicle implements Costable {
    private int maxSpeed;
    private int cost_Motorcycle;
    public Motorcycle(int wheelCount,   int maxSpeed){
        super(wheelCount);

        this.maxSpeed =maxSpeed;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Мотоцикл " + "\n"
                + "Количество колес: " + wheelCount + "\n"
                + "Максимальная скорость: " + maxSpeed);

        System.out.println("Цена " + getCost());
        System.out.println();
    }

    @Override
    public void setCost(int cost_Motorcycle) {
        this.cost_Motorcycle= cost_Motorcycle;
    }
    @Override
    public int getCost() {
        return cost_Motorcycle;
    }
}
