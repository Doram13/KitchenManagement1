package com.Doram;

import com.sun.org.apache.bcel.internal.classfile.Code;

public class Main {

    public static void main(String[] args) {
        initKitchen();
    }

    private static void initKitchen() {
        Kitchen codekitchen = new Kitchen();
        codekitchen.hireChef();
        for (int i = 0; i< 2; i++) {
            codekitchen.hireCook();
        }
        for (int i = 0; i < 3; i++) {
            codekitchen.hireKitchenHelper(); }
        codekitchen.handOutIngredients();
        for (int i = 0; i < 10; i++) {
            codekitchen.chefOfTheKitchen.toCook();
        }

    }

}
