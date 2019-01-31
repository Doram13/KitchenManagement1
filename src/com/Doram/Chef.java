package com.Doram;

import java.util.List;
import java.util.Random;

public class Chef extends Employee implements Cooker {

    private int birth;
    private double salary;
    private String name;
    private List<KitchenHelper> listOfKitchenHelpers;

    public Chef(int birth, double salary, String name, List<KitchenHelper> listOfKitchenHelpers) {
        this.birth = birth;
        this.salary = salary;
        this.name = name;
        this.listOfKitchenHelpers = listOfKitchenHelpers;
    }

    @Override
    public void toCook() {
        // doesn’t touch anything, but yells constantly
        yellForIngredient();
    }

    private void yellForIngredient() {
        Random r = new Random();
        int num = r.nextInt(3);
        Kitchen.Ingredient wantedIngredient = null;
        switch (num) {
            case 0:
                wantedIngredient = Kitchen.Ingredient.POTATO;
                break;
            case 1:
                wantedIngredient = Kitchen.Ingredient.CARROT;
                break;
            case 2:
                wantedIngredient = Kitchen.Ingredient.MEAT;
                break;
        }
        listOfKitchenHelpers.get(0).checkForIngredient(wantedIngredient);{  // I call the method for 0, but then yell to every other Helper CLEANCODE!!
           //    Kitchen.Ingredient ingredientReceived = listOfKitchenHelpers.get(i).checkForIngredient(wantedIngredient);
        }
    }
}
