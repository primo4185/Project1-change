package com.example.kccistc.project1;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Old_Seoul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_seoul);

        Old_Seoul_Adapter old_seoul_adapter = new Old_Seoul_Adapter(getSupportFragmentManager());
        ViewPager viewPager2 = findViewById(R.id.osview_pager);
        viewPager2.setAdapter(old_seoul_adapter);

        TabLayout osTab = findViewById(R.id.tab1);
        osTab.setupWithViewPager(viewPager2);
    }
}
