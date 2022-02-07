package com.company;

public class Bike {
    protected int gear;
    int speed;

    protected Bike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    protected void applyBreak(int decrement) {
        speed -= decrement;
    }

    protected void speedUp(int increment) {
        speed += increment;
    }

    protected void printInfo() {
        System.out.println("No of gears are " + gear);
        System.out.println("Speed of bicycle is " + speed);
    }


}
