package com.tulesh.springdemosecond.mvc;

import java.util.LinkedHashMap;

public class Student {
    private  String firstName;
    private  String lastName;

    private String country;
    private LinkedHashMap<String,String> countryOptions;

    private  String favoriteLanguage;
    private String[] operatingSystem;

    public Student() {
        countryOptions=new LinkedHashMap<>();
        countryOptions.put("IN","India");
        countryOptions.put("UK","United Kinddom");
        countryOptions.put("BR","Brazil");
        countryOptions.put("PK","Pakistan");
        countryOptions.put("US","United state");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public Student setCountry(String country) {
        this.country = country;
        return this;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public Student setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
        return this;
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public Student setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }
}
