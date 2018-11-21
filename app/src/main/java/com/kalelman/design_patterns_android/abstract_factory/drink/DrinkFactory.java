package com.kalelman.design_patterns_android.abstract_factory.drink;

import com.kalelman.design_patterns_android.abstract_factory.AbstractFactory;
import com.kalelman.design_patterns_android.abstract_factory.bread.Bread;
import com.kalelman.design_patterns_android.abstract_factory.filling.Filling;

public class DrinkFactory extends AbstractFactory {

    @Override
    public Bread getBread(String breadType) {
        return null;
    }

    @Override
    public Filling getFilling(String fillingType) {
        return null;
    }

    @Override
    public Drink getDrink(String drinkType) {

        if (drinkType == null) {
            return null;
        }

        if (drinkType == "Coke") {
            return new Coke();
        } else if (drinkType == "Beer") {
            return new Beer();
        }

        return null;
    }
}
