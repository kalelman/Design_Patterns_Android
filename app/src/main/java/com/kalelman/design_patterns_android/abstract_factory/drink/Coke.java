package com.kalelman.design_patterns_android.abstract_factory.drink;

public class Coke implements Drink {

    @Override
    public String name() {
        return "Coca cola";
    }

    @Override
    public int calories() {
        return 148;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String image() {
        return "https://cdn.pixabay.com/photo/2016/09/05/19/24/cafe-1647448_1280.jpg";
    }
}
