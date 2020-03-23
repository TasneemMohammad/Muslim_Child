package com.example.l;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Anbyaa_Stories extends AppCompatActivity {
    RecyclerView rv_anbyaa_stories ;
    ArrayList<Stories_Card> arrayList ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anbyaa__stories);
        rv_anbyaa_stories = (RecyclerView)findViewById(R.id.rv_anbyaa_stories);

        arrayList = new ArrayList<>();        // khleh yget men el data base ;
        arrayList.add(new Stories_Card("قصة يوسف" ,R.drawable.ic_cloud_queue_black_24dp));
        arrayList.add(new Stories_Card("قصة يوسف" ,R.drawable.ic_cloud_queue_black_24dp));
        arrayList.add(new Stories_Card("قصة يوسف" ,R.drawable.ic_cloud_queue_black_24dp));
        arrayList.add(new Stories_Card("قصة يوسف" ,R.drawable.ic_cloud_queue_black_24dp));
        arrayList.add(new Stories_Card("قصة يوسف" ,R.drawable.ic_cloud_queue_black_24dp));
        Recycler_Adapter_Stories adapter_stories = new Recycler_Adapter_Stories(arrayList, new OnClickListener_Stories() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(Anbyaa_Stories.this,webView_Stories.class);
                intent.putExtra("page",position);
                intent.putExtra("sound",position);
                startActivity(intent);
            }
        }
        );

        rv_anbyaa_stories.setAdapter(adapter_stories);
        rv_anbyaa_stories.setLayoutManager(new LinearLayoutManager(Anbyaa_Stories.this));
       }
       }
