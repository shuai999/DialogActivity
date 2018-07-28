package com.example.test.listviewnotificationadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/28 11:37
 * Version 1.0
 * Params:
 * Description:
*/
public class MainActivity extends AppCompatActivity {

    private List<String> mData = new ArrayList<>();
    private ListView mListView;
    private MyAdapter mAdapter;


    @Override
    protected void onResume() {
        super.onResume();
        String mKey = PrefUtils.getString(MainActivity.this , "key" , "") ;
        String position = PrefUtils.getString(MainActivity.this , "position" , "") ;
        Log.e("TAG" , "mKey: " + mKey + ", position: " + position) ;
        if (!TextUtils.isEmpty(mKey) && "Y".equals(mKey)){
            if (!TextUtils.isEmpty(position)) {
                mAdapter.setTag(2, Integer.parseInt(position));    //给adapter设置绑定 , 表示你点击某个具体的item
                mAdapter.notifyDataSetChanged();//刷新数据
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);
        //添加数据
        for (int i = 0; i < 30; i++) {
            mData.add("" + i);
        }
        //适配MyAdapter数据
        mAdapter = new MyAdapter(this, mData);
        mListView.setAdapter(mAdapter);


        //点击 listview
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                mAdapter.setTag(2, position);    //给adapter设置绑定 , 表示你点击某个具体的item
                mAdapter.notifyDataSetChanged(); //刷新数据
//                lastPostion = position;        //将当前位置 置为最后一个位置
            }
        });

    }
}
