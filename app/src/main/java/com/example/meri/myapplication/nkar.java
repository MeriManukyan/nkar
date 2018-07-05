package com.example.meri.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.zip.Inflater;

public class nkar extends BaseAdapter {
    LayoutInflater inflater1;
Context context;
int[] im;
nkar(Context context,int[]im){
    this.context=context;
    this.im=im;
    inflater1= (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

}

    @Override
    public int getCount() {
        return im.length;
    }

    @Override
    public Object getItem(int position) {
        return im[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    View view=convertView;
    if(convertView==null){
        view=inflater1.inflate(R.layout.a,parent,false);
    }
view=inflater1.inflate(R.layout.a,null);
        ((ImageView)view.findViewById(R.id.imageView)).setImageResource(im[position]);
        return view;
    }
}