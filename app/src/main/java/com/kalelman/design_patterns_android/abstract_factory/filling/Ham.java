package com.kalelman.design_patterns_android.abstract_factory.filling;

public class Ham implements Filling {

    @Override
    public String name() {
        return "Jamon";
    }

    @Override
    public String calories() {
        return " : 194 kcal";
    }
}
