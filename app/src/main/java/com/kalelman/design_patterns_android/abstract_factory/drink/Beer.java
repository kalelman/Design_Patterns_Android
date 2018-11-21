package com.kalelman.design_patterns_android.abstract_factory.drink;

public class Beer implements Drink {

    @Override
    public String name() {
        return "Cerveza";
    }

    @Override
    public String calories() {
        return " : 155 kcal";
    }
}
