package com.kalelman.design_patterns_android.abstract_factory.drink;

public class Beer implements Drink {

    @Override
    public String name() {
        return "Cerveza";
    }

    @Override
    public int calories() {
        return 155;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String image() {
        return "https://cdn.pixabay.com/photo/2017/06/24/23/41/beer-2439237_1280.jpg";
    }
}
