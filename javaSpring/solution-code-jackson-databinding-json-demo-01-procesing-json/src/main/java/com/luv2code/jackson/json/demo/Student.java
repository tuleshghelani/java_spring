package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private boolean active;

    private Address address;
    private String[] languages;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public Student setActive(boolean active) {
        this.active = active;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Student setAddress(Address address) {
        this.address = address;
        return this;
    }

    public String[] getLanguages() {
        return languages;
    }

    public Student setLanguages(String[] languages) {
        this.languages = languages;
        return this;
    }
}
