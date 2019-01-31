package com.Doram;


import java.util.*;

public class KitchenHelper extends Employee {

    private int birth;
    private double salary;
    private String name;
    private int weAreOutCounter;
    protected HashMap<Kitchen.Ingredient, Integer> helperInventory = new HashMap<Kitchen.Ingredient, Integer>();


    public KitchenHelper(int birth, double salary, String name) {
        this.birth = birth;
        this.salary = salary;
        this.name = name;
       // this.listOfKitchenHelpers = listOfKitchenHelpers; //Maybe I should add them to the kitchenhelper list here
    }



    protected void checkForIngredient(Kitchen.Ingredient wantedIngredient) {
        if (this.helperInventory.get(wantedIngredient) > 0) {
            this.giveItToCooks(wantedIngredient);}
        else {
            weAreOutCounter++;
            for (int i = 1; i < Kitchen.listOfKitchenHelpers.size(); i++) {
                KitchenHelper actualHelper = Kitchen.listOfKitchenHelpers.get(i);
                if (actualHelper.helperInventory.get(wantedIngredient) > 0) {
                    giveItToCooks(wantedIngredient);
                }
                else {
                    weAreOutCounter++;
                }
            }
        }
        if (weAreOutCounter >= 3) {
            for (int i = 0; i< Kitchen.listOfKitchenHelpers.size(); i++) {
                Kitchen.listOfKitchenHelpers.get(i).yellWeAreAllOut();
                weAreOutCounter = 0;
            }
        }
    }

    private void yellWeAreAllOut() {
        System.out.println("We are all out!");
    }

    private void giveItToCooks(Kitchen.Ingredient wantedIngredient) {
        int newValue = helperInventory.get(wantedIngredient) -1;
        helperInventory.put(wantedIngredient, newValue);
        for (Cook cook : Kitchen.listOfCooks) {
            cook.toCook();
        }
    }

    protected void fillInventory(HashMap<Kitchen.Ingredient, Integer> inventory) {
        this.helperInventory = new HashMap<>(inventory);
        System.out.println(helperInventory);
    }

}
