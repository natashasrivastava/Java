package com.company;

class Test2 implements Cloneable {
    int a;
    int b;

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class Clone {
    public static void main(String args[]) throws CloneNotSupportedException {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;

        Test2 t2 = (Test2)t1.clone();

        t2.a = 100;


        System.out.println(t1.a + " " + t1.b);
        System.out.println(t2.a + " " + t2.b);
    }
}

