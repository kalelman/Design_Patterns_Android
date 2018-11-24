package com.kalelman.design_patterns_android.abstract_factory.filling;

public class Tomato extends Filling {

    @Override
    public String name() {
        return "Tomate";
    }

    @Override
    public int calories() {
        return 20;
    }

    @Override
    public String description() {
        return "Los mejores Tomates de México";
    }

    @Override
    public String image() {
        return "https://cdn.pixabay.com/photo/2015/12/30/12/01/vegetables-1114066_1280.jpg";
    }
}
