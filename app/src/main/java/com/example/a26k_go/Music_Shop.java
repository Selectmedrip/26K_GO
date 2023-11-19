package com.example.a26k_go;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Music_Shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_shop);
    }
    public void New_Activity(View v){
        Intent intent = new Intent(this, Shop_Order.class);
        startActivity(intent);
    }
}