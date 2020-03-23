package com.example.l;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stories extends AppCompatActivity {
    Button btn_anbyaa_stories , btn_tarbawya_stories,btn_interesting_stories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
        btn_anbyaa_stories = findViewById(R.id.btn_anbyaa_stories);
        btn_tarbawya_stories = findViewById(R.id.btn_tarbawya_stories);
        btn_interesting_stories= findViewById(R.id.btn_interesting_stories);

        btn_anbyaa_stories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Stories.this ,Anbyaa_Stories.class);
                startActivity(intent);
            }
        });
    }
}
