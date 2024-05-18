package com.example.tugasday11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    ImageButton btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnSignIn = findViewById(R.id.btnSignIn);
        Klik2();
    }
    void Klik2(){
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHal3 = new Intent (MainActivity2.this, MainActivity3.class);
                startActivity(intentHal3);
            }
        });
    }
}