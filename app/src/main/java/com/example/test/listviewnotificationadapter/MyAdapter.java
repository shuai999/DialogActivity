package com.example.test.listviewnotificationadapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/28 11:39
 * Version 1.0
 * Params:
 * Description:
*/

public class MyAdapter extends BaseAdapter {
    private List<String> mData;
    private Context mContext;
    private LayoutInflater mInflater;
    private int tag;
    private int NowDay;


    public MyAdapter(Context context, List<String> data) {
        this.mContext = context;
        this.mData = data;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void setTag(int s,int NaDayPostion){
        tag=s;
        NowDay=NaDayPostion;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder.mImageView = (ImageView) convertView.findViewById(R.id.image);
            holder.iv_check = (ImageView) convertView.findViewById(R.id.iv_check);
            holder.mTextView = (TextView) convertView.findViewById(R.id.tvContent);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.mTextView.setText("我是:" + mData.get(position));


        if(tag==2&&NowDay==position){
            holder.iv_check.setVisibility(View.VISIBLE);
            holder.iv_check
                    .setImageResource(R.mipmap.checkedaddress);  //选中地址的图片

//            holder.mTextView
//                    .setTextColor(mContext.getResources().getColor(R.color.colorAccent));
            PrefUtils.putString(mContext , "key" , "Y");
            PrefUtils.putString(mContext , "position" , position+"");
        }else{
            holder.iv_check.setVisibility(View.GONE);
            holder.iv_check
                    .setImageResource(R.mipmap.nocheckedaddress);//没有选中的图片
        }

        return convertView;
    }

    class ViewHolder {
        ImageView mImageView , iv_check;
        TextView mTextView;
    }
}
