package com.gtmovie.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:sport.properties")
@PropertySource("/home/pp-2/TULESH/javaSpring/spring-demo-annotations/sport.properties")
public class SwimCoach implements Coach{

    private FortuneService fortuneService;
    @Value("${foo.email}")
    private  String email;
    @Value("${foo.team}")
    private  String team;

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meter as awarm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
