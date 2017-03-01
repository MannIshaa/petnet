package com.example.manisha.fabs;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Fabsactivity extends AppCompatActivity {

    FloatingActionButton mapfab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabsactivity);
        mapfab=(FloatingActionButton)findViewById(R.id.mapbutton);
        mapfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fabsactivity.this,MapsActivity.class));
            }
        });
    }
}
