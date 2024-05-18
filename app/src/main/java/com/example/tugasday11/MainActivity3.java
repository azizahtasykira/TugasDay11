package com.example.tugasday11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    ImageButton btnAkun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnAkun  = findViewById(R.id.btnAkun);
        Klik3();
    }
    void Klik3(){
        btnAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHal4 = new Intent (MainActivity3.this, MainActivity4.class);
                startActivity(intentHal4);
            }
        });
    }
}