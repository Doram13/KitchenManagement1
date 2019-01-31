package com.Doram;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Kitchen {
    private int numberOfHelpers;
    private int numberOfCooks;
    static List<KitchenHelper> listOfKitchenHelpers;
    static List<Cook> listOfCooks;

    Chef chefOfTheKitchen;


    public Kitchen() {
        listOfCooks = new LinkedList<>();
        listOfKitchenHelpers = new LinkedList<>();
    }


    protected enum Ingredient {
        CARROT,
        MEAT,
        POTATO
    }

    protected void hireKitchenHelper() {
        KitchenHelper kitchenHelper = new KitchenHelper(1990, 100, "Béla" + this.numberOfHelpers);
        listOfKitchenHelpers.add(kitchenHelper); //should I add them to their list here, or in their constructor?
    }

    protected void hireCook() {
        Cook cook = new Cook(1975, 300, "Anton" + this.numberOfCooks);
        listOfCooks.add(cook);
    }

    protected void hireChef() {
        Chef chef = new Chef(1960, 500, "Ramsay", listOfKitchenHelpers);
        chefOfTheKitchen = chef;
    }

    protected void handOutIngredients() {
        Random r = new Random();
        for (int i = 0; i < listOfKitchenHelpers.size(); i++) {
            HashMap<Ingredient, Integer> kitchenInventory = new HashMap<Ingredient, Integer>();
            kitchenInventory.put(Ingredient.POTATO, r.nextInt(4));
            kitchenInventory.put(Ingredient.CARROT, r.nextInt(4));
            kitchenInventory.put(Ingredient.MEAT, r.nextInt(4));
            listOfKitchenHelpers.get(i).fillInventory(kitchenInventory);
            }
    }
}
