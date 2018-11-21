package com.kalelman.design_patterns_android.abstract_factory.filling;

public class Tomato implements Filling {

    @Override
    public String name() {
        return "Tomate";
    }

    @Override
    public String calories() {
        return " : 20 Kcal";
    }
}
