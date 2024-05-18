package com.example.tugasday11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity4 extends AppCompatActivity {

    ImageButton btnFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btnFilm = findViewById(R.id.btnFilm);
        Klik4();
    }
    void Klik4(){
        btnFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHal5 = new Intent (MainActivity4.this, MainActivity5.class);
                startActivity(intentHal5);
            }
        });
    }
}