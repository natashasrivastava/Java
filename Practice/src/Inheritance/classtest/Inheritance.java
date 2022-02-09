package Inheritance.classtest;

public class Inheritance {
    public static void main(String[] args) {
        MountainBike Firefox = new MountainBike(3,100,25);
        Firefox.printInfo();
        // Protected members and methods are accessible in same package.
        Firefox.gear=4;
        System.out.println();
        Firefox.speedUp(20);
        Firefox.printInfo();
        System.out.println();
        Firefox.applyBreak(40);
        Firefox.printInfo();

    }
}

class MountainBike extends Bike {
    int height;
    MountainBike(int gear, int speed, int height)
    {
        super(gear, speed);
        this.height = height;
    }
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Height of bike is " + height);
    }

}