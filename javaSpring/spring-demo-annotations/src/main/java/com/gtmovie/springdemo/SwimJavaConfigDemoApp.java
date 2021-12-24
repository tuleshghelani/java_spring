package com.gtmovie.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);

//      Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
        SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println("email : "+theCoach.getEmail());
        System.out.println(" team : "+theCoach.getTeam());

        context.close();
    }
}
