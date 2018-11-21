package com.kalelman.design_patterns_android.abstract_factory.bread;

public class Sliced implements Bread {

    @Override
    public String name() {
        return "Pan de Molde";
    }

    @Override
    public String calories() {
        return " : 80 Kcal";
    }
}
