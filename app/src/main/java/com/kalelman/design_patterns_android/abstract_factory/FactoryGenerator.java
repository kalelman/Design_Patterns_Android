package com.kalelman.design_patterns_android.abstract_factory;

import com.kalelman.design_patterns_android.abstract_factory.bread.BreadFactory;
import com.kalelman.design_patterns_android.abstract_factory.drink.DrinkFactory;
import com.kalelman.design_patterns_android.abstract_factory.filling.FillingFactory;

public class FactoryGenerator {

    public static AbstractFactory getFactory(String factoryType) {

        if (factoryType == null) {
            return null;
        }

        if (factoryType == "Bread") {
            return new BreadFactory();
        } else if (factoryType == "Filling") {
            return new FillingFactory();
        } else if (factoryType == "Drink") {
            return new DrinkFactory();
        }

        return null;
    }
}
