package com.kalelman.design_patterns_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.kalelman.design_patterns_android.abstract_factory.AbstractFactory;
import com.kalelman.design_patterns_android.abstract_factory.FactoryGenerator;
import com.kalelman.design_patterns_android.abstract_factory.bread.Baguette;
import com.kalelman.design_patterns_android.abstract_factory.bread.Bread;
import com.kalelman.design_patterns_android.abstract_factory.drink.Drink;
import com.kalelman.design_patterns_android.abstract_factory.filling.Cheese;
import com.kalelman.design_patterns_android.abstract_factory.filling.Filling;
import com.kalelman.design_patterns_android.abstract_factory.filling.Tomato;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    /*@BindView(R.id.txv_bread)
    TextView txvBread;
    @BindView(R.id.txv_drink)
    TextView txvDrink;
    @BindView(R.id.txv_filling)
    TextView txvFilling;*/

    @BindView(R.id.text_title)
    TextView textTitle;
    @BindView(R.id.text_description)
    TextView textDescription;
    @BindView(R.id.text_calories)
    TextView textCalories;

    @BindView(R.id.imageView)
    ImageView imageView;


    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        SandwichBuilder builder = new SandwichBuilder();

        Sandwich s1 = builder.cheeseAndHam(); // genera san dwich de jamon y queso

        Log.d(TAG, "Primer Sandwich");
        s1.getIngredients();
        s1.getCalories();

        Sandwich s2 = builder.cheeseAndHam();
        builder.build(s2, new Tomato());

        Log.d(TAG, "Segundo Sanwich");
        s2.getIngredients();
        s2.getCalories();

        Sandwich s3 = new Sandwich();
        builder.build(s3, new Baguette());
        builder.build(s3, new Cheese());
        builder.build(s3, new Cheese());
        builder.build(s3, new Tomato());

        Log.d(TAG, "Tercer Sandwich");
        s3.getIngredients();
        s3.getCalories();

        Sandwich s4 = new Sandwich();

        Tomato tomato = new Tomato();
        textTitle.setText(tomato.name().toString());
        textDescription.setText(tomato.description().toString());
        textCalories.setText(String.valueOf(tomato.calories()));

        Picasso.get().load(tomato.image()).resize(400,250).centerCrop().into(imageView);

        /*AbstractFactory breadFactory = FactoryGenerator.getFactory("Bread");
        Bread bread = breadFactory.getBread("Roll");

        AbstractFactory fillingFactory = FactoryGenerator.getFactory("Filling");

        AbstractFactory drinkFactory = FactoryGenerator.getFactory("Drink");

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
                .toString());*/
    }
}
