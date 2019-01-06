package com.example.douglas.capitulo6ejemplo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
    }

    public void launchSecondActivity(View v){
        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
    }

}
