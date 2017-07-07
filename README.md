# ExpandableListviewAdapter
Android 万能的Adapter for ExpandableListView,ListView,Gridview等
</br>
</br>
引入
</br>
</br>
compile 'com.tranwon:expandablelistview:1.0.1'
</br>
</br>
对应博客地址为：http://blog.csdn.net/zhangxiangliang2/article/details/71698199

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
        </br>
![image](https://github.com/crook3/ExpandableListviewAdapter/raw/master/app/src/main/res/drawable/expandableListview.PNG)
</br>
     
     
     
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
     

![image](https://github.com/crook3/ExpandableListviewAdapter/raw/master/app/src/main/res/drawable/listView.PNG)
</br>
</br>
只需要简单的将Adapter继承BaseAdapter，复写convert方法即可。省去了自己编写ViewHolder等大量的重复的代码。

可以通过holder.getView(id)拿到任何控件。
</br>
</br>
</br>












