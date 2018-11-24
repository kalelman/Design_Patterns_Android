package com.kalelman.design_patterns_android.abstract_factory.filling;

public class Cheese extends Filling {

    @Override
    public String name() {
        return "Queso";
    }

    @Override
    public int calories() {
        return 54;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String image() {
        return "https://cdn.pixabay.com/photo/2018/08/29/19/01/fig-3640553_1280.jpg";
    }
}
