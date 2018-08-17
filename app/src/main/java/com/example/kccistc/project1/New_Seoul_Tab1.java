package com.example.kccistc.project1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class New_Seoul_Tab1 extends Fragment {
    private ArrayList<New_Seoul_Item> items;
    private ListView mListView;;
    private New_Seoul_ListView_Adapter mAdapter;
    public static New_Seoul_Tab1 newInstance(){
        Bundle args = new Bundle();
        New_Seoul_Tab1 fragmant = new New_Seoul_Tab1();
        fragmant.setArguments(args);
        return  fragmant;
    }
    public New_Seoul_Tab1() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.new_seoul_tab1, container, false);
        items = new ArrayList<New_Seoul_Item>();
        items.add(new New_Seoul_Item(R.mipmap.ic_launcher, "노트북"));
        items.add(new New_Seoul_Item(R.mipmap.ic_launcher, "키보드"));
        items.add(new New_Seoul_Item(R.mipmap.ic_launcher, "마우스"));

        mListView= view.findViewById(R.id.new_list_view1);
        mAdapter =  new New_Seoul_ListView_Adapter(getActivity(), R.layout.new_seoul_list_view_adapter, items);
        mListView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        return view;
//        return inflater.inflate(R.layout.new_seoul_tab1, container, false);
    }

}
