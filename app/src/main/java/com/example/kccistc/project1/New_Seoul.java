package com.example.kccistc.project1;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class New_Seoul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_seoul);



        New_Seoul_Adapter new_seoul_adapter = new New_Seoul_Adapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.nsview_pager);
        viewPager.setAdapter(new_seoul_adapter);

        TabLayout nsTab =findViewById(R.id.tab);
        nsTab.setupWithViewPager(viewPager);
    }
}
