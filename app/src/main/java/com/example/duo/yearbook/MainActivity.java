package com.example.duo.yearbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); }

        public void goToResume(View view)
        {
            Intent intent = new Intent(MainActivity.this, Resume.class);
            startActivity(intent);
        }
    }
