package Basics;

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Methods of Base Object");
        Base b = new Base();
        b.printInfo();
        b.getStatus();

        System.out.println();
        System.out.println("Methods of Derived Object");
        Derived d = new Derived();
        d.printInfo();
        d.printStatus();
        d.getStatus();

        System.out.println();
        System.out.println("Methods of Base object pointing to Derived Class");
        Base bd = new Derived();
        bd.getStatus();
        bd.printInfo();


    }
}

class Base{
    void getStatus()
    {
        System.out.println("Base activated");
    }
    void printInfo()
    {
        System.out.println("Inside Base");
    }
}

class Derived extends Base{
    void printStatus()
    {
        System.out.println("Derived");
    }
    @Override
    void printInfo(){
        System.out.println("Inside Derived");
    }
}
