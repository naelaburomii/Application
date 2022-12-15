package com.testapp.application;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    Button studentslist ,profile, oreders;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentslist = findViewById(R.id.list);
        studentslist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, com.testapp.application.studentslist.class));
            }
        });
    }
}