package com.gtmovie.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.gtmovie.springdemo")
@PropertySource("/home/pp-2/TULESH/javaSpring/spring-demo-annotations/sport.properties")
public class SportConfig {
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
