package com.example.myapplim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NextPage (View view){
        ImageButton vat01 = (ImageButton) findViewById(R.id.vat01);
        Intent intent = new Intent(MainActivity.this,vat.class);
        startActivity(intent);
    }
    public void Next (View view){
        ImageButton btnNEXT = (ImageButton) findViewById(R.id.ao1);
        Intent intent = new Intent(MainActivity.this,ao1.class);
        startActivity(intent);
    }
    public void NextNext (View view){
        ImageButton kak = (ImageButton) findViewById(R.id.kak);
        Intent intent = new Intent(MainActivity.this,kak.class);
        startActivity(intent);
    }
    public void mynext (View view){
        ImageButton kak = (ImageButton) findViewById(R.id.tok01);
        Intent intent = new Intent(MainActivity.this,tok.class);
        startActivity(intent);
    }
    public void ShopNext (View view){
        Button shop01 = (Button) findViewById(R.id.shop01);
        Intent intent = new Intent(MainActivity.this,shop.class);
        startActivity(intent);
    }
    public void ShopSet (View view){
        Button set = (Button) findViewById(R.id.setin01);
        Intent intent = new Intent(MainActivity.this,mom.class);
        startActivity(intent);
    }

}