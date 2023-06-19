package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class FullScreen_Activity extends AppCompatActivity {


    ImageView imageView;
    TextView txt1,txt2;

    int imgArr[];
    String name[];
    String  num[];
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        position=getIntent().getIntExtra("pos",0);
        name=getIntent().getStringArrayExtra("name");
        num=getIntent().getStringArrayExtra("num");
        imgArr=getIntent().getIntArrayExtra("img");

        imageView=findViewById(R.id.activity_full_img);
        txt1=findViewById(R.id.activity_full_name);
        txt2=findViewById(R.id.activity_full_num);

        imageView.setImageResource(imgArr[position]);
        txt1.setText(name[position]);
        txt2.setText(num[position]);


    }
}