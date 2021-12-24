package com.gtmovie.second;

public class CricketCoach implements Coach {
    private String email;
    private String team;

    private FortuneService fortuneService;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Cricket coach : inside setEmail method");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket coach : inside setTeam method");
        this.team = team;
    }

    public CricketCoach() {
        System.out.println("cricket coach : construtor with no argument ");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach : inside set fortune service method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
