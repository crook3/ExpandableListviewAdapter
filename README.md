# ExpandableListviewAdapter
Android 万能的Adapter for ExpandableListView,ListView
>
引入
>
compile 'com.tranwon:expandablelistview:1.0.1'
>
使用
简单的数据绑定(ExpandableListView与ListView一致)
相当方便，在convert方法中完成数据、事件绑定即可。

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

只需要简单的将Adapter继承CommonAdapter，复写convert方法即可。省去了自己编写ViewHolder等大量的重复的代码。

可以通过holder.getView(id)拿到任何控件。
>
效果图
>
![Image text](https://github.com/crook3/ExpandableListviewAdapter/app/src/main/res/drawable/expandableListview.PNG)
![Image text](https://github.com/crook3/ExpandableListviewAdapter/app/src/main/res/drawable/listView.PNG)
>




