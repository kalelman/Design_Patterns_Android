package com.kalelman.design_patterns_android.abstract_factory.bread;

public class Roll extends Bread {

    @Override
    public String name() {
        return "Pan de pita";
    }

    @Override
    public int calories() {
        return 169;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String image() {
        return "https://cdn.pixabay.com/photo/2017/02/17/09/56/baked-2073693_1280.jpg";
    }
}
