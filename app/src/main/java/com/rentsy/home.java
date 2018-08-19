package com.rentsy;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class home extends AppCompatActivity {

    public static TabLayout tablayout;
    Fragment homefragment,saved,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        setuptablayout();
        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {


            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                setCurrentTabFragment(tab.getPosition());
                switch (tab.getPosition()){
                    case 0:
                        tab.setIcon(R.drawable.search_red);
                        break;
                    case 1:
                        tab.setIcon(R.drawable.heart_red);
                        break;
                    case 2:
                        tab.setIcon(R.drawable.user_profile_red);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                switch (tab.getPosition()){
                    case 0:
                        tab.setIcon(R.drawable.search);
                        break;
                    case 1:
                        tab.setIcon(R.drawable.heart);
                        break;
                    case 2:
                        tab.setIcon(R.drawable.alert);
                        break;
                    case 3:
                        tab.setIcon(R.drawable.tribes);
                        break;
                }

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        homefragment = new homefragment();

    }

    public  void replaceFragment(android.support.v4.app.Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_container, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }

    private void setCurrentTabFragment(int tabPosition)
    {
        switch (tabPosition) {
            case 0://home
                replaceFragment(homefragment);
                break;
            case 1://saved
                replaceFragment(homefragment);
                break;
            case 2://profile
                replaceFragment(homefragment);
                break;
        }
    }


    public void setuptablayout()
    {
        tablayout.addTab(tablayout.newTab().setIcon(R.drawable.search_red).setText("Search"));
        tablayout.addTab(tablayout.newTab().setIcon(R.drawable.heart).setText("Nearby"));
        tablayout.addTab(tablayout.newTab().setIcon(R.drawable.alert).setText("Alarms"));
        tablayout.addTab(tablayout.newTab().setIcon(R.drawable.user_profile).setText("Profile"));

    }



}
