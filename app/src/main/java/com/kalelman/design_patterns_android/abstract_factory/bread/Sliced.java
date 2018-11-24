package com.kalelman.design_patterns_android.abstract_factory.bread;


public class Sliced extends Bread {

    @Override
    public String name() {
        return "Pan de Molde";
    }

    @Override
    public int calories() {
        return 80;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String image() {
        return "https://cdn.pixabay.com/photo/2018/06/19/09/34/bread-3484107_1280.jpg";
    }
}
