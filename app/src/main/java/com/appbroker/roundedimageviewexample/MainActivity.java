package com.appbroker.roundedimageviewexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.appbroker.roundedimageview.RoundedImageView;

public class MainActivity extends AppCompatActivity {
    private RoundedImageView roundedImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roundedImageView=findViewById(R.id.roundedImageView);
        roundedImageView.setRadius(5);
        roundedImageView.setRadius(RoundedImageView.Corner.BOTTOM_LEFT,50);
    }
}