package com.kalelman.design_patterns_android.abstract_factory.filling;

import com.kalelman.design_patterns_android.abstract_factory.AbstractFactory;
import com.kalelman.design_patterns_android.abstract_factory.drink.Drink;
import com.kalelman.design_patterns_android.abstract_factory.bread.Bread;

public class FillingFactory extends AbstractFactory {

    @Override
    public Bread getBread(String breadType) {
        return null;
    }

    @Override
    public Filling getFilling(String fillingType) {

        if (fillingType == null) {
            return null;
        }

        if (fillingType == "Cheese") {
            return  new Cheese();
        } else if (fillingType == "Tomato") {
            return new Tomato();
        } else if (fillingType == "Ham") {
            return new Ham();
        }

        return null;
    }

    @Override
    public Drink getDrink(String drinkType) {
        return null;
    }
}
