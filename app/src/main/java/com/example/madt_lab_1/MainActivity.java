package com.example.madt_lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.textView);
    }

    public void onButtonChangeClick(View view) {
        this.tvMain.setText("We did something! Yay!");
    }

    public void onButtonChangeColor(View view) {
        this.tvMain.setTextColor(Color.rgb(25,123,250));
    }
}
