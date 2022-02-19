package Basics;

class MyThread extends Thread{
    @Override
    public void run() {
        while (true)
        {
            System.out.println("Thread1 is running");
            System.out.println("Thread1 is executing");
        }

    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Thread2 is running");
            System.out.println("Thread2 is executing");
        }

    }
}
public class Multithreading {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread1 t1 = new MyThread1();
        t.start();
        t1.start();
        System.out.println("Hello World ");
    }
}
