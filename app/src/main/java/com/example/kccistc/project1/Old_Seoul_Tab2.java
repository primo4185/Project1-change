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
public class Old_Seoul_Tab2 extends Fragment {
    private ArrayList<Old_Seoul_Item> items;
    private ListView mListView;;
    private Old_Seoul_ListView_Adapter mAdapter;
    public static Old_Seoul_Tab2 newInstance(){
        Bundle args = new Bundle();
        Old_Seoul_Tab2 fragmant = new Old_Seoul_Tab2();
        fragmant.setArguments(args);
        return  fragmant;
    }

    public Old_Seoul_Tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.old_seoul_tab2, container, false);
        items = new ArrayList<Old_Seoul_Item>();
        items.add(new Old_Seoul_Item(R.mipmap.ic_launcher, "노트북"));
        items.add(new Old_Seoul_Item(R.mipmap.ic_launcher, "키보드"));
        items.add(new Old_Seoul_Item(R.mipmap.ic_launcher, "마우스"));

        mListView= view.findViewById(R.id.old_list_view2);
        mAdapter =  new Old_Seoul_ListView_Adapter(getActivity(), R.layout.old_seoul_list_view_adapter, items);
        mListView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        return view;
        //return inflater.inflate(R.layout.old_seoul_tab2, container, false);
    }

}
