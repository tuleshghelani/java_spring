package com.gtmovie.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements  FortuneService{

    private String[] data={
            "array1",
            "array2",
            "array3",
    };

    private Random myRandom=new Random();


    @Override
    public String getFortune() {
        int index=myRandom.nextInt(data.length);
        String theFortune=data[index];
        return theFortune;
    }
}
