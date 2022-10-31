package com.example.a2018030;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ikan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan);
    }
    public void kelinci (View view){
        Intent a = new Intent(ikan.this, frag.class);
        startActivity(a);
    }
    public void burung (View view){
        Intent b = new Intent(ikan.this, burung.class);
        startActivity(b);
    }
}
