package com.gtmovie.second;

public class BaseBallCoach implements Coach {
    private FortuneService fortuneService;

    private BaseBallCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public String getDailyWorkout() {
        return "spend 30 minute on batting practise ";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}