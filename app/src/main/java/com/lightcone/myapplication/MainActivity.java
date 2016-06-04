package com.lightcone.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.net.Uri;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Add Click listener for the button
        View theButton = findViewById(R.id.button);
        theButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        /*Toast.makeText(this, "You clicked the button!",
                Toast.LENGTH_LONG).show();*/
        String address = "http://apod.nasa.gov";
        Intent link = new Intent(Intent.ACTION_VIEW);
        link.setData(Uri.parse(address));
        startActivity(link);
    }
}
