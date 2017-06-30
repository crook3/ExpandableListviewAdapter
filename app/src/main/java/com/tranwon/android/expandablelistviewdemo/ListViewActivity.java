package com.tranwon.android.expandablelistviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.tranwon.android.adaptertool.MyBaseAdapterListview;
import com.tranwon.android.adaptertool.MyViewHolderExpandbleListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SYSTEM on 2017/5/7.
 */
public class ListViewActivity extends AppCompatActivity{

    private ListView listView;
    private List<String> mListData=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = (ListView) findViewById(R.id.listView);
        initData();
        setAdapter();
    }

    private void setAdapter() {
        MyBaseAdapterListview<String> adapter=new MyBaseAdapterListview<String>(
                getApplicationContext(),mListData,R.layout.listview_item) {
            @Override
            public void convert(MyViewHolderExpandbleListView holder, String s,int position) {
                TextView tv= holder.getView(R.id.tv1);
                tv.setText(s);
                ImageView im=holder.getView(R.id.image);
                im.setImageResource(R.mipmap.ic_launcher);
            }
        };
        listView.setAdapter(adapter);
    }

    private void initData() {
        for (int i=0;i<100;i++)
            mListData.add("我是第--"+i+"--项");
    }
}
