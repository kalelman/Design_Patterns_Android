package com.kalelman.design_patterns_android.abstract_factory.filling;

public class Cheese implements Filling {

    @Override
    public String name() {
        return "Queso";
    }

    @Override
    public String calories() {
        return " : 54 Kcal";
    }
}
