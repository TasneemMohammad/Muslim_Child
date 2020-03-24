package com.example.l;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img_quran,img_azkar ,img_stories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_stories = findViewById(R.id.img_stories);
    img_stories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast .makeText(MainActivity.this,"hhj",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Stories.class);
                Intent i = new Intent(MainActivity.this,Stories.class);
                startActivity(intent);
            }
        });

    }
}
