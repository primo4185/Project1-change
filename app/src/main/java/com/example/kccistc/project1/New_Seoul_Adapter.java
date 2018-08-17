package com.example.kccistc.project1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class New_Seoul_Adapter extends FragmentPagerAdapter{

    public New_Seoul_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return New_Seoul_Tab1.newInstance();
            case 1:
                return New_Seoul_Tab2.newInstance();
            case 2:
                return New_Seoul_Tab3.newInstance();
            default:
                return null;
        }
    }
    private  static  int PAGE_NUMBER = 3;
    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }
    @Override
    public CharSequence getPageTitle (int position) {
        switch (position) {
            case 0:
                return "관광지";

            case 1:
                return "맛집";

            case 2:
                return "행사정보";
        }
        return null;
    }
}
