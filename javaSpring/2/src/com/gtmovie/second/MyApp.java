package com.gtmovie.second;

public class MyApp {
    public static void main(String[] args) {
        /*BaseBallCoach thecoach=new BaseBallCoach();
        System.out.println(thecoach.getDailyWorkout());*/

        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
