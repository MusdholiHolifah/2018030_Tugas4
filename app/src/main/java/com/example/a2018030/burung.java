package com.example.a2018030;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class burung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung);
    }
    public void kelinci (View view){
        Intent a = new Intent(burung.this, MainActivity.class);
        startActivity(a);
    }
    public void ikan(View view){
        Intent a = new Intent(burung.this, ikan.class);
        startActivity(a);
    }
}