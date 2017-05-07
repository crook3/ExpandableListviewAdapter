package com.tranwon.android.expandablelistviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Button1Click(View view)
    {
        Intent intent=new Intent();
        intent.setClass(getApplicationContext(), ExpandableListViewActivity.class);
        startActivity(intent);
    }
    public void Button2Click(View view)
    {
        Intent intent=new Intent();
        intent.setClass(getApplicationContext(), ListViewActivity.class);
        startActivity(intent);
    }
}
