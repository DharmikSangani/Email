package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    ListView listView;

    ImageButton btn;
    CustomAdapter adapter;
    String name[]={"Sachin Tendulkar","Ms Dhoni","Virat Kohli","Rohit Sharma","KL Rahul","Hardik Pandya"};
    String num[]={"ALL RAUNDER","BATSMAN","BATSMAN","BATSMAN","BATSMAN","ALL RAUNDER"};

    int imgArr[]={R.drawable.img,R.drawable.img_1, R.drawable.img_2,
            R.drawable.img_3,R.drawable.img_4,R.drawable.img_5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        listView=findViewById(R.id.other_Listview);
        adapter=new CustomAdapter(OtherActivity.this,name,num,imgArr);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                Intent intent=new Intent(OtherActivity.this,FullScreen_Activity.class);
                intent.putExtra("pos",position);
                intent.putExtra("name",name);
                intent.putExtra("num",num);
                intent.putExtra("img",imgArr);
                startActivity(intent);

            }
        });

    }
}