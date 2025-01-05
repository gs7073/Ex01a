package com.example.ex01;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        btn = findViewById(R.id.btnMain);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    btn.setText("Oh, yea, I’ve been clicked!\n");
            }


        });
    }
}







