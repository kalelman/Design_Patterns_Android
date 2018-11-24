package com.kalelman.design_patterns_android;

import com.kalelman.design_patterns_android.abstract_factory.Ingredient;
import com.kalelman.design_patterns_android.abstract_factory.bread.Sliced;
import com.kalelman.design_patterns_android.abstract_factory.filling.Cheese;
import com.kalelman.design_patterns_android.abstract_factory.filling.Ham;

public class SandwichBuilder {

    public static Sandwich cheeseAndHam() {

        Sandwich sandwich = new Sandwich();

        sandwich.addIngredient(new Sliced());
        sandwich.addIngredient(new Ham());
        sandwich.addIngredient(new Cheese());

        return sandwich;
    }

    public static Sandwich build(Sandwich sandwich, Ingredient ingredient) {

        sandwich.addIngredient(ingredient);

        return sandwich;

    }

}
