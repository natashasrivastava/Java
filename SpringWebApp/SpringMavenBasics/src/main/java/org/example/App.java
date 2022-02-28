package org.example;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.applet.AppletContext;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

       ApplicationContext context = new ClassPathXmlApplicationContext("/Users/a1624jar/IdeaProjects/SpringWebApp/SpringMavenBasics/src/main/java/spring.xml");
        Vehicle travel = (Vehicle) context.getBean("vehicle");

        travel.drive();
    }
}
