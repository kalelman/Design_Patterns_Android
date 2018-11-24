package com.kalelman.design_patterns_android.abstract_factory.bread;

import com.kalelman.design_patterns_android.abstract_factory.Ingredient;

public abstract class Bread implements Ingredient {

    @Override
    public abstract String name();

    @Override
    public abstract int calories();

    @Override
    public abstract String description();

    @Override
    public abstract String image();
}

