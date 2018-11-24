package com.kalelman.design_patterns_android.abstract_factory.bread;

public class Baguette extends Bread {

    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public int calories() {
        return 250;
    }

    @Override
    public String description() {
        return "Un baguette recien hecha y crujiente";
    }

    @Override
    public String image() {
        return "https://cdn.pixabay.com/photo/2016/05/07/19/21/baguette-1378049_1280.jpg";
    }
}
