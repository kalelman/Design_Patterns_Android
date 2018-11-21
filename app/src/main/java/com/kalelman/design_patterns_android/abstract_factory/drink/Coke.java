package com.kalelman.design_patterns_android.abstract_factory.drink;

public class Coke implements Drink {

    @Override
    public String name() {
        return "Coca cola";
    }

    @Override
    public String calories() {
        return " : 148 kcal";
    }
}
