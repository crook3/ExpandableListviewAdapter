package com.tranwon.android.expandablelistviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.tranwon.android.adaptertool.MyBaseAdapterExpandbleListview;
import com.tranwon.android.adaptertool.MyViewHolderExpandbleListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SYSTEM on 2017/5/7.
 */
public class ExpandableListViewActivity extends AppCompatActivity{

    private ExpandableListView expandableListview;
    private List<String> mListParentData=new ArrayList<>();
    private List<String> mListChildData=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_listview);
        expandableListview = (ExpandableListView) findViewById(R.id.expandableListview);
        initData();
        setAdapter();
    }

    private void setAdapter() {
        MyBaseAdapterExpandbleListview<String> adapter=new MyBaseAdapterExpandbleListview<String>(
                getApplicationContext(),mListParentData,mListChildData,R.layout.item_parent
                ,R.layout.item_child) {
            @Override
            public void convertParent(MyViewHolderExpandbleListView holder, String s, int parentPosition) {
                TextView tv= holder.getView(R.id.tv1);
                tv.setText(s);
            }
            @Override
            public void convertChild(MyViewHolderExpandbleListView holder, String s, int parentPosition, int childPosition) {
                TextView tv= holder.getView(R.id.tv1);
                tv.setText(s);
            }
        };
        expandableListview.setAdapter(adapter);
    }

    private void initData() {
        for (int i=0;i<100;i++)
        {
            mListParentData.add("我是第--"+i+"--项Parent");
            mListChildData.add("我是第--"+i+"--项Child");
        }
    }

}
