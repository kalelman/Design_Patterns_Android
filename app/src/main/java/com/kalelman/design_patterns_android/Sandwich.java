package com.kalelman.design_patterns_android;

import android.nfc.Tag;
import android.util.Log;

import com.kalelman.design_patterns_android.abstract_factory.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private static final String TAG = "Sandwich";

    private List<Ingredient> ingredients = new ArrayList<Ingredient>(); // array list vacio

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public int getCalories() {
        int calories = 0;
        for (Ingredient i: ingredients) {
            calories += i.calories();
        }
        Log.d(TAG, "Total de Calorias " + calories + "Kcal");

        return calories;
    }

    public void getIngredients() {
        for(Ingredient i: ingredients ) {
            Log.d(TAG, i.image() + " : " + i.calories() + "Kcal");
        }
    }

}
