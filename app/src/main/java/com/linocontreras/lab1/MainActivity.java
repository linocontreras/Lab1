package com.linocontreras.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = new Random();
    }

    public void buttonOnClick(View v){
        Button b = ((Button)v);
        b.setText("Lalalalala");
        b.setAllCaps(false);
        b.setBackgroundColor(r.nextInt());
    }
}
