package com.appbroker.roundedimageviewexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.appbroker.roundedimageview.RoundedImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RoundedImageView roundedImageView=findViewById(R.id.roundedImageView);
        roundedImageView.setRadius(5); //Sets radius of all corners
        roundedImageView.setRadius(RoundedImageView.Corner.BOTTOM_LEFT,50); //Override BOTTOM_LEFT corner.
        roundedImageView.setImageDrawable(getResources().getDrawable(R.drawable.free)); //First set radius then set drawable.
    }
}