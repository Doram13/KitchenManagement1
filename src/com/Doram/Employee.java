package com.Doram;

import java.util.HashMap;

public abstract class Employee {
    private int birth;
    private double salary;
    private String name;

    public double countTax() {
        return salary * 0.99;
    }


}
