package com.example.kccistc.project1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class New_Seoul_ListView_Adapter extends BaseAdapter{
    private Context context;
    private int layout;
    private ArrayList<New_Seoul_Item> items;
    private LayoutInflater inflater;


    public New_Seoul_ListView_Adapter(Context context, int layout, ArrayList<New_Seoul_Item> items){
        this.context = context;
        this.layout = layout;
        this.items = items;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = inflater.inflate(layout, parent, false);
        }
        ImageView img = convertView.findViewById(R.id.img);
        img.setImageResource(items.get(position).getIcon());
        TextView text = convertView.findViewById(R.id.text);
        text.setText(items.get(position).getName());
        final String name = items.get(position).getName();
        Button btn = (Button) convertView.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = name + " 주문";
                Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
            }
        });


        return convertView;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


}
