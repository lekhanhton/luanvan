package com.example.lekha.backgrounddetector;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {
    ImageView ivResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ivResult = (ImageView)findViewById(R.id.ivResult);
        ivResult.setImageResource(R.drawable.sample_0);
    }
}
