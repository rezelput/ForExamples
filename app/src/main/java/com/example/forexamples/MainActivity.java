package com.example.forexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tosecondPage(View v)
    {
        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
    }

    public void toPerson(View v){
        Intent intent = new Intent(this, PersonalPageActivity.class);
        startActivity(intent);
    }

    public void toPhonePage(View v){
        Intent intent = new Intent(this, PhoneActivity.class);
        startActivity(intent);
    }

}