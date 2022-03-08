package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle travel = (Vehicle) context.getBean("bike");

        travel.drive();
    }
}
