package com.classtest;

import com.company.Bike;

public class OutsidePackageInheritance {
    public static void main(String args[]) {
        Bicycle hero = new Bicycle(2, 30, "Comfortable");
        hero.printInfo();
    }
}
class Bicycle extends Bike {
    String seat;
    Bicycle(int gear, int speed, String seat)
    {
        super(gear, speed);
        this.seat = seat;

    }

    @Override
    protected void applyBreak(int decrement) {
        super.applyBreak(decrement);
        this.seat="Not comfy";
    }

    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("Seat is " + seat);
    }
}

