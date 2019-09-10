package com.inversionOfControl;

import com.inversionOfControl.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class HelloSpringApp {

    public static void main(String[] args) {
       // File file = new File( "D:/My Projects/UdemySpring/src/main/resources/applicationContext.xml");
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
