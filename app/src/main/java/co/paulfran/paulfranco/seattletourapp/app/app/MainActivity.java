package co.paulfran.paulfranco.seattletourapp.app.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import co.paulfran.paulfranco.seattletourapp.R;
import co.paulfran.paulfranco.seattletourapp.app.categories.Attractions;
import co.paulfran.paulfranco.seattletourapp.app.categories.Hotels;
import co.paulfran.paulfranco.seattletourapp.app.categories.Restaurants;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Toolbar toolbar;
    private Button btnAttractions, btnRestaurants, btnHotels, btnShopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Initialize Buttons
        btnAttractions = (Button) findViewById(R.id.btnAttractions);
        btnRestaurants = (Button) findViewById(R.id.btnRestaurants);
        btnHotels = (Button) findViewById(R.id.btnHotels);
        btnShopping = (Button) findViewById(R.id.btnShopping);
        // Set onClick Listeners on buttons
        btnShopping.setOnClickListener(this);
        btnRestaurants.setOnClickListener(this);
        btnAttractions.setOnClickListener(this);
        btnHotels.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i = null;
        switch (v.getId()) {
            case R.id.btnAttractions:
                i = new Intent(MainActivity.this, Attractions.class);
                break;
            case R.id.btnRestaurants:
                i = new Intent(MainActivity.this, Restaurants.class);
                break;
            case R.id.btnHotels:
                i = new Intent(MainActivity.this, Hotels.class);
                break;
        }
        startActivity(i);
    }
}
