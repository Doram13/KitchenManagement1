package com.Doram;


public class Cook extends Employee implements Cooker {

    private int birth;
    private double salary;
    private String name;

    public Cook(int birth, double salary, String name) {
        this.birth = birth;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public void toCook() {
        System.out.println("I'm cooking");
        //dirt their hands and get the job done
    }
}
