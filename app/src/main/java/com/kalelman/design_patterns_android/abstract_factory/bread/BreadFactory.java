package com.kalelman.design_patterns_android.abstract_factory.bread;

import com.kalelman.design_patterns_android.abstract_factory.AbstractFactory;
import com.kalelman.design_patterns_android.abstract_factory.drink.Drink;
import com.kalelman.design_patterns_android.abstract_factory.filling.Filling;

/**
 * @author erickrojasperez
 * @since November/15/2018
 *
 */

public class BreadFactory extends AbstractFactory {

    @Override
    public Bread getBread(String breadType) {

        if (breadType == null) {
            return null;
        }

        if (breadType == "Baguette") {
            return new Baguette();
        } else if (breadType == "Roll") {
            return  new Roll();
        } else if (breadType == "Sliced") {
            return new Sliced();

        }

        return null;
    }

    @Override
    public Filling getFilling(String fillingType) {
        return null;
    }

    @Override
    public Drink getDrink(String drinkType) {
        return null;
    }
}
