package com.drolmen.coffeecomponent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_main);

        try {
            Class<?> aClass = Class.forName("com.drolmen.assemblecomponent.AssembleActivity");
            startActivity(new Intent(this, aClass));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
