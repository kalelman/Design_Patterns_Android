package com.kalelman.design_patterns_android.abstract_factory.filling;

public class Ham extends Filling {

    @Override
    public String name() {
        return "Jamon";
    }

    @Override
    public int calories() {
        return 194;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String image() {
        return "https://cdn.pixabay.com/photo/2018/06/19/09/48/ham-3484120_1280.jpg";
    }
}
