package com.luv2code.aopdemo;

public class Account {
    private String name;
    private String level;

    public Account() {
    }

    public Account(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public String getLevel() {
        return level;
    }

    public String setLevel(String level) {
        this.level = level;
        return this.level;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }


}
