package com.example.himanshu.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv1;
    String[] fruitname={"mange","banana"};
    String[] des={"good","bad"};
    Integer[] img={R.drawable.abc,R.drawable.abcd};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       com.example.himanshu.adapter.custum custom=new com.example.himanshu.adapter.custum(this, fruitname,des,img);
       lv1.setAdapter(custom);



    }
}
