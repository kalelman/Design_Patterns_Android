package com.kalelman.design_patterns_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.kalelman.design_patterns_android.abstract_factory.AbstractFactory;
import com.kalelman.design_patterns_android.abstract_factory.FactoryGenerator;
import com.kalelman.design_patterns_android.abstract_factory.bread.Bread;
import com.kalelman.design_patterns_android.abstract_factory.drink.Drink;
import com.kalelman.design_patterns_android.abstract_factory.filling.Filling;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txv_bread)
    TextView txvBread;
    @BindView(R.id.txv_drink)
    TextView txvDrink;
    @BindView(R.id.txv_filling)
    TextView txvFilling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        AbstractFactory breadFactory = FactoryGenerator.getFactory("Bread");
        Bread bread = breadFactory.getBread("Roll");

        AbstractFactory fillingFactory = FactoryGenerator.getFactory("Filling");
        Filling filling = fillingFactory.getFilling("Tomato");

        AbstractFactory drinkFactory = FactoryGenerator.getFactory("Drink");
        Drink drink = drinkFactory.getDrink("Coke");

        txvBread.setText(new StringBuilder()
                .append(bread.name())
                .append("\n")
                .append(bread.calories())
                .toString());

        txvFilling.setText(new StringBuilder()
                .append(fillingFactory.getFilling("Tomato").name())
                .append("\n")
                .append(fillingFactory.getFilling("Tomato").calories())
                .toString());

        txvDrink.setText(new StringBuilder()
                .append(drinkFactory.getDrink("Coke").name())
                .append("\n")
                .append(drinkFactory.getDrink("Coke").calories())
                .toString());
    }
}
