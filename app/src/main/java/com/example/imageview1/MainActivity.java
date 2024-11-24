package com.example.imageview1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private static ImageView imageView;
    private static Button switchButton;
    private int current_image;
    int[] images={R.drawable.img1,R.drawable.img2,R.drawable.img3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick();
    }

    private void buttonclick() {
        imageView=(ImageView) findViewById(R.id.imgView);
        switchButton=(Button) findViewById(R.id.switchBtn);
        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image++;
                current_image=current_image% images.length;
                imageView.setImageResource(images[current_image]);
            }
        });
    }
}