package com.kalelman.design_patterns_android.abstract_factory;

import com.kalelman.design_patterns_android.abstract_factory.bread.Bread;
import com.kalelman.design_patterns_android.abstract_factory.drink.Drink;
import com.kalelman.design_patterns_android.abstract_factory.filling.Filling;

/**
 *
 */

public abstract class AbstractFactory {

    public abstract Bread getBread(String breadType);
    public abstract Filling getFilling(String fillingType);
    public abstract Drink getDrink(String drinkType);
}

